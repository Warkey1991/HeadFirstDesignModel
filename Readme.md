# 策略模式

#### 定义：定义了一系列算法，并将每个算法封装起来，使它们可以互相替换，且算法的变化不会影响使用算法的客户。

#### 特点：策略模式属于对象行为模式，它通过对算法进行封装，把使用算法的责任和算法的实现分割开来，并委派给不同的对象对这些算法进行管理。

#### 其类结构如下

<img src="https://github.com/Warkey1991/HeadFirstDesignModel/blob/master/images/screenshot-20220504-101112.png"/>

有三个角色：

* **Context(环境角色)**: 持有一个指向Strategy的引用strategy,该引用指向的是Strategy 的实现类，这里用到了对象的多态特性。
* **Strategy(抽象策略角色)**:Strategy 是用接口定义的，遵循面向接口编程的原则，此接口定义出所有具体策略类所需的接口方法。
* **StrategyA(具体策略决策)**：包装了相关的算法和行为。
  <img src="https://github.com/Warkey1991/HeadFirstDesignModel/blob/master/images/screenshot-20220504-101057.png"/>

在我们这个鸭子的例子中，基类为Duck === 环境角色，其持有一个FlyBehavior以及QuackBehavior
引用，通过set方法动态设置行为算法，使用那种行为算法由客户端决定。其Duck类无需关心其飞行、鸣叫的行为是什么样子的，只需要通过代理去执行不同的行为算法。

浏览其特点，**策略模式属于对象行为模式，它通过对算法进行封装，把使用算法的责任和算法的实现分割开来，并委派给不同的对象对这些算法进行管理**我们分析下这段描述：

1. 策略模式属于对象行为模式，它通过对算法进行封装：所有的行为通过定义接口，其接口里的方法就是行为需要实现的方法，然后通过具体类来实现这些行为，FlyBehavior
   接口定义了飞行的行为，其具体的实现则由FlyWithWings、FlyNoWay 这些类来实现。其每种算法都封装在了实现类中。
3. 把使用算法的责任和算法的实现分割开来: 使用算法的责任是Duck 类，算法的实现是实现了FlyBehavior 和 QuackBehavior 的实现类。
4. 并委派给不同的对象对这些算法进行管理：使用算法的类Duck 持有算法的接口引用，flyBehavior与quackBehavior，鸭子的飞行行为和鸣叫行为分别通过方法performFly() 和performQuack()
   委派给客户端通过set 方法传递进来的飞行行为实现类和鸣叫行为实现类。

#### 这个算法遵循了设计原则如下：

1. 找出应用中可能需要变化之处，把它们独立出来，不要和那些不需要变化的代码混在一起。---开闭原则(对修改关闭，对扩展开放)
2. 针对接口编程，而不是针对实现编程。---每个行为都是定义了接口，然后通过具体行为类来实现算法。
3. 多用组合编程，少用继承。----Duck类中持有飞行行为的引用好和鸣叫行为的引用，可以实现动态的调整，继承是静态的，无法动态改变其行为。

##### 策略模式的主要优点如下

1. 多重条件语句不易维护，而使用策略模式可以避免使用多重条件语句，如 if...else 语句、switch...case 语句。
2. 策略模式提供了一系列的可供重用的算法族，恰当使用继承可以把算法族的公共代码转移到父类里面，从而避免重复的代码。
3. 策略模式可以提供相同行为的不同实现，客户可以根据不同时间或空间要求选择不同的。
4. 策略模式提供了对开闭原则的完美支持，可以在不修改原代码的情况下，灵活增加新算法。
5. 策略模式把算法的使用放到环境类中，而算法的实现移到具体策略类中，实现了二者的分离

##### 其主要缺点如下：

1. 客户端必须理解所有策略算法的区别，以便适时选择恰当的算法类。
2. 策略模式造成很多的策略类，增加维护难度。---接口+实现类。小类太多。

##### 策略模式的使用场景：

1. 一个系统需要动态地在几种算法中选择一种时，可将每个算法封装到策略类中。
2. 一个类定义了多种行为，并且这些行为在这个类的操作中以多个条件语句的形式出现，可将每个条件分支移入它们各自的策略类中以代替这些条件语句。
3. 系统中各算法彼此完全独立，且要求对客户隐藏具体算法的实现细节时。
4. 系统要求使用算法的客户不应该知道其操作的数据时，可使用策略模式来隐藏与算法相关的数据结构。
5. 多个类只区别在表现行为不同，可以使用策略模式，在运行时动态选择具体要执行的行为。

##### 参考文献：

[http://c.biancheng.net/view/1378.html](http://c.biancheng.net/view/1378.html)

[https://segmentfault.com/a/1190000040419861](https://segmentfault.com/a/1190000040419861)

[https://www.cnblogs.com/java-my-life/archive/2012/05/10/2491891.html](https://www.cnblogs.com/java-my-life/archive/2012/05/10/2491891.html)





# 观察者模式：
首先我们从现实生活中举个例子,认识观察者模式：
1. 报社的业务就是出版报纸。
2. 向某家报社订阅报纸，只要他们有新报纸出版，就会给你送来。前提是你要是他们的订户，你就会一只收到新报纸。
3. 当你不想在看报纸的时候，取消订阅，他们就不会再送报纸了。
4. 只要报社还在运营，就会一只有人向他们订阅或者取消订阅报纸。

**报社+订阅者=观察者模式。**

### 观察者模式定义：
定义了对象之间的一对多依赖，这样一来，当一个对象状态改变时，它的所有依赖者都会收到通知并自动更新。

<img src="https://github.com/Warkey1991/HeadFirstDesignModel/blob/master/images/screenshot-20220504-155237.png"/>

本文要讲的例子是天气预报和布告板， 天气预报的WeatherData 类相当于主题，布告板相当于观察者，主题有数据更新，依赖于主题的观察者就会收到通知。
<img src="https://github.com/Warkey1991/HeadFirstDesignModel/blob/master/images/screenshot-20220504-160618.png"/>
实现一对多的关系---> 需要在这个主题中保存布告板对象的一个容器，这样，在收到数据更新的时候，能够通知所有观察者。
由此，我们在WeatherData 中声明了一个集合observers:List<Observer>.针对观察者的操作，都要基于这个列表中的观察者。
<img src="https://github.com/Warkey1991/HeadFirstDesignModel/blob/master/images/screenshot-20220504-162051.png"/>

**观察者模式是一种对象行为型模式，**
#### 其主要优点如下。
1. 降低了目标与观察者之间的耦合关系，两者之间是抽象耦合关系。符合依赖倒置原则。
2. 目标与观察者之间建立了一套触发机制。

#### 它的主要缺点如下。
1. 目标与观察者之间的依赖关系并没有完全解除，而且有可能出现循环引用。
2. 当观察者对象很多时，通知的发布会花费很多时间，影响程序的效率。

#### 模式的结构与实现
观察者模式的主要角色如下。
1. 抽象主题（Subject）角色：也叫抽象目标类，它提供了一个用于保存观察者对象的聚集类和增加、删除观察者对象的方法，以及通知所有观察者的抽象方法。
2. 具体主题（Concrete Subject）角色：也叫具体目标类，它实现抽象目标中的通知方法，当具体主题的内部状态发生改变时，通知所有注册过的观察者对象。
   3.抽象观察者（Observer）角色：它是一个抽象类或接口，它包含了一个更新自己的抽象方法，当接到具体主题的更改通知时被调用。
   具体观察者（Concrete Observer）角色：实现抽象观察者中定义的抽象方法，以便在得到目标的更改通知时更新自身的状态。

#### 模式的应用场景
在软件系统中，当系统一方行为依赖另一方行为的变动时，可使用观察者模式松耦合联动双方，使得一方的变动可以通知到感兴趣的另一方对象，从而让另一方对象对此做出响应。

1. 通过前面的分析与应用实例可知观察者模式适合以下几种情形。
   对象间存在一对多关系，一个对象的状态发生改变会影响其他对象。
2. 当一个抽象模型有两个方面，其中一个方面依赖于另一方面时，可将这二者封装在独立的对象中以使它们可以各自独立地改变和复用。
3. 实现类似广播机制的功能，不需要知道具体收听者，只需分发广播，系统中感兴趣的对象会自动接收该广播。
4. 多层级嵌套使用，形成一种链式触发机制，使得事件具备跨域（跨越两种观察者类型）通知。


参考文献：
[http://c.biancheng.net/view/1390.html](http://c.biancheng.net/view/1390.html)

具体实现代码请移步github: [https://github.com/Warkey1991/HeadFirstDesignModel](https://github.com/Warkey1991/HeadFirstDesignModel)

