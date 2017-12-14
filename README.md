# 设计模式总结

## 创建型(Creation)

1. ***单例模式(singleton)***
> Ensure a class only has one instance, and provide a global point of access to it.

    * 意图：保证一个类仅有一个实例，并提供一个访问它的全局访问点。
    * 主要解决：一个全局使用的类频繁地创建与销毁。
    * 何时使用：当您想控制实例数目，节省系统资源的时候。
    * 如何解决：判断系统是否已经有这个单例，如果有则返回，如果没有则创建。
    * 关键代码：构造函数是私有的。
    * 注意事项：getInstance() 方法中需要使用同步锁 synchronized (Singleton.class) 防止多线程同时进入造成 
instance 被多次实例化。


1. ***工厂方法模式(factory method)***
> Exposes a method for creating objects, allowing subclasses to control the actual creation process.

* 意图：定义一个创建对象的接口，让其子类自己决定实例化哪一个工厂类，工厂模式使其创建过程延迟到子类进行。
* 主要解决：主要解决接口选择的问题。
* 何时使用：我们明确地计划不同条件下创建不同实例时。
* 如何解决：让其子类实现工厂接口，返回的也是一个抽象的产品。
* 关键代码：创建过程在其子类执行。
* 注意事项：作为一种创建类模式，在任何需要生成复杂对象的地方，都可以使用工厂方法模式。有一点需要注意的地方就是
复杂对象适合使用工厂模式，而简单对象，特别是只需要通过 new 就可以完成创建的对象，无需使用工厂模式。如果使用工厂模式，
就需要引入一个工厂类，会增加系统的复杂度。

1. 抽象工厂模式(abstract factory)
> Provide an interface that delegates creation calls to one or more concrete classes in order to deliver 
specific objects.

* 意图：提供一个创建一系列相关或相互依赖对象的接口，而无需指定它们具体的类。
* 主要解决：主要解决接口选择的问题。
* 何时使用：系统的产品有多于一个的产品族，而系统只消费其中某一族的产品。
* 如何解决：在一个产品族里面，定义多个产品。
* 关键代码：在一个工厂里聚合多个同类产品。
* 注意事项：产品族难扩展，产品等级易扩展。

1. ***建造者模式(builder)***
> Allows for the dynamic creation of objects based upon easily interchangeable algorithms.

* 意图：将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示。
* 主要解决：主要解决在软件系统中，有时候面临着"一个复杂对象"的创建工作，其通常由各个部分的子对象用一定的算法构成；
由于需求的变化，这个复杂对象的各个部分经常面临着剧烈的变化，但是将它们组合在一起的算法却相对稳定。
* 何时使用：一些基本部件不会变，而其组合经常变化的时候。
* 如何解决：将变与不变分离开。
* 关键代码：建造者：创建和提供实例，导演：管理建造出来的实例的依赖关系。
* 注意事项：与工厂模式的区别是：建造者模式更加关注与零件装配的顺序。

1. 原型模式(prototype)
> Create objects based upon a template of an existing objects through cloning.

* 意图：用原型实例指定创建对象的种类，并且通过拷贝这些原型创建新的对象。
* 主要解决：在运行期建立和删除原型。
* 何时使用： 
    1. 当一个系统应该独立于它的产品创建，构成和表示时。 
    2. 当要实例化的类是在运行时刻指定时，例如，通过动态装载。 
    3. 为了避免创建一个与产品类层次平行的工厂类层次时。 
    4. 当一个类的实例只能有几个不同状态组合中的一种时。建立相应数目的原型并克隆它们可能比每次用合适的状态手工实例化该类更方便一些。
* 如何解决：利用已有的一个原型对象，快速地生成和原型对象一样的实例。
* 关键代码： 
    1. 实现克隆操作，在 JAVA 继承 Cloneable，重写 clone()，在 .NET 中可以使用 Object 类的 
    MemberwiseClone() 方法来实现对象的浅拷贝或通过序列化的方式来实现深拷贝。 
    2. 原型模式同样用于隔离类对象的使用者和具体类型（易变类）之间的耦合关系，它同样要求这些"易变类"拥有稳定的接口。
* 注意事项：与通过对一个类进行实例化来构造新对象不同的是，原型模式是通过拷贝一个现有对象生成新对象的。
浅拷贝实现 Cloneable，重写，深拷贝是通过实现 Serializable 读取二进制流。

## 结构型(Structural)

1. 适配器模式(adapter)
> Permits classes with disparate interfaces to work together by creating a common object by 
which they may communicate and interact.

* 意图：将抽象部分与实现部分分离，使它们都可以独立的变化。
* 主要解决：在有多种可能会变化的情况下，用继承会造成类爆炸问题，扩展起来不灵活。
* 何时使用：实现系统可能有多个角度分类，每一种角度都可能变化。
* 如何解决：把这种多角度分类分离出来，让它们独立变化，减少它们之间耦合。
* 关键代码：抽象类依赖实现类。
* 注意事项：对于两个独立变化的维度，使用桥接模式再适合不过了。

1. 桥接模式(bridge)
> Defines an abstract object structure independently of the implementation object structure 
in order to limit coupling.

1. 代理模式(proxy)

1. 组合模式(composite)

1. 装饰器模式(decorator)

1. 外观模式(facade)

1. 享元模式(flyweight)

## 行为型(Behavioral)

1. ***策略模式(strategy)***
> Defines a set of encapsulated algorithms that can be swapped to carry out a specific behavior.

* 意图：定义一系列的算法,把它们一个个封装起来, 并且使它们可相互替换。
* 主要解决：在有多种算法相似的情况下，使用 if...else 所带来的复杂和难以维护。
* 何时使用：一个系统有许多许多类，而区分它们的只是他们直接的行为。
* 如何解决：将这些算法封装成一个一个的类，任意地替换。
* 关键代码：实现同一个接口。
* 注意事项：如果一个系统的策略多于四个，就需要考虑使用混合模式，解决策略类膨胀的问题。

1. ***模板方法模式(template method)***
> Identifies the framework of an algorithm, allowing implementing classes to define the actual behavior.

* 意图：定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
* 主要解决：一些方法通用，却在每一个子类都重新写了这一方法。
* 何时使用：有一些通用的方法。
* 如何解决：将这些通用算法抽象出来。
* 关键代码：在抽象类实现，其他步骤在子类实现。
* 注意事项：为防止恶意操作，一般模板方法都加上 final 关键词。

1. 观察者模式(observer)

1. 迭代器模式

1. 责任链模式

1. 命令模式

1. 解释器模式

1. 中介者模式

1. 状态模式

1. 备忘录模式

