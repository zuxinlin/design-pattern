# 设计模式总结

## 创建型(Creation)

1. 单例模式(instantSingleton)
> Ensure a class only has one instance, and provide a global point of access to it.

* 意图：保证一个类仅有一个实例，并提供一个访问它的全局访问点。
* 主要解决：一个全局使用的类频繁地创建与销毁。
* 何时使用：当您想控制实例数目，节省系统资源的时候。
* 如何解决：判断系统是否已经有这个单例，如果有则返回，如果没有则创建。
* 关键代码：构造函数是私有的。
* 注意事项：getInstance() 方法中需要使用同步锁 synchronized (Singleton.class) 防止多线程同时进入造成 
instance 被多次实例化。


1. 工厂方法模式(factory method)
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

1. 建造者模式(builder)

1. 原型模式(prototype)

## 结构型(Structural)

## 行为型(Behavioral)

