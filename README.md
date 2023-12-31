## 🍀 GoFDesignPatterns
The 23 GoF Design Patterns with Java Examples

## 🧩 Java Examples
Examples were mostly taken from the YouTube channel [Geekfic](https://www.youtube.com/watch?v=mE3qTp1TEbg&list=PLlsmxlJgn1HJpa28yHzkBmUY-Ty71ZUGc&ab_channel=Geekific)

1. Strategy:
Defines a family of algorithms, encapsulates each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients who use it.

2. Decorator:
Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

3. Factory Method
Define an interface for creating an object, but let the subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.

4. Observer
Define a one-to-many dependency between objects so that when one object changes state, all its dependents are notified and updated automatically.

5. Chain of Responsibility
Avoid coupling the sender of a request to its receiver by giving more then one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it.

6. Singleton
Ensure a class only has one instance, and provide a global point of access to it.

7. Flyweight
Use sharing to support large numbers of fine-grained objects efficiently. A flyweight is a shared object that can be used in multiple contexts simultaneously. The flyweight acts as an independent object in each context; it’s indistinguishable from an instance of the object that’s not shared.

8. Adapter
Convert the interface of a class into another interface clients expect. Adapter lets classes work together that couldn’t otherwise because of incompatibility interfaces.

9. Façade
Provide a unified interface to a set of interfaces in a system. Façade defines a higher-level interface that makes the subsystem easier to use.

10. Template
Define a skeleton of an algorithm in an operation, deferring some steps to subclasses. Template Method lets subclasses redefine certain steps of an algorithm without changing the algorithms structure.

11. Builder
Separate the construction of a complex object from its representation so that the same construction processes can create different representations.

12. Iterator
Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.

13. Composite
Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.

14. Command
Encapsulate a request as an object, thereby letting you parameterize clients with different requests, queue or log requests, and support undoable operations.

15. Mediator
Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly, and lets you vary their interaction independently.

16. State
Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.

17. Proxy
Provide a surrogate or placeholder for another object to control access to it.

18. Abstract Factory
Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

19. Bridge
Decouple an abstraction from its implementation so that the two can vary independently.

20. Interpreter
Given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.

21. Memento
Without violating encapsulation, capture and externalize an object’s internal state so that the object can be restored to this state later.

22. Prototype
Specify the kinds of objects to create using a prototypical instance, and create new objects by copying this prototype.

23. Visitor
Represent an operation to be performed on the elements of an object structure. Visitor lets you define a new operation without changing the classes of the elements on which it operates.

List taken from [Medium](https://buihuycuong.medium.com/the-23-gang-of-four-design-patterns-974ae8d1a957)
