## Java Concepts
1. Encapsulation
2. Inheritance
3. Polymorphism
4. Abstraction
5. Class
6. Object
7. Data hiding

**Encapsulation** means having both member variables and methods in the object.

Every object in Java implements Encapsulation


**Polymorphism** - Compile Time Polymorphism, Run Time Polymorphism

Compile Time Polymorphism examples - Function Overloading, Operator Overloading

Run Time Polymorphism examples - 

## Inheritance in Java
Inheritance can be defined as the process where one class acquires the properties (methods and fields) of another

Inheritance is implemented in Java using “extends” keyword. 

When the derived class extends base class, the derived class contains all members that are available in base class 
and the derived class can override the base class members

```if(m instanceof Deer)``` can be used to check if the data type of m is Deer or a superClass (say Animal)

### Links 
https://www.tutorialspoint.com/java/java_inheritance.htm

http://www.rapidprogramming.com/questions-answers/How-is-inheritance-implemented-in-Java--6 

**Multiple Inheritance not allowed** in java. To facilitate multiple inheritance, we can use **Interfaces**

```image of multiple inheritance comes here```

## Polymorphism in Java
Any Java object that can pass more than one IS-A test is considered to be polymorphic. 

In Java, all Java objects are polymorphic since any object will pass the IS-A test 
for their own type and for the class Object.

### Links
1. https://www.tutorialspoint.com/java/java_polymorphism.htm

## Abstraction in Java

In Java, abstraction is achieved using *Abstract classes* and *interfaces*.

A class which contains the abstract keyword in its declaration is known as **Abstract Class**. 
If a class has at least one abstract method, then the class must be declared abstract. 
If a class is declared abstract, it cannot be instantiated.

To use an abstract class, you have to inherit it from another class, provide implementations to the abstract methods in it.

Abstract classes may or may not contain abstract methods, i.e., methods without body ( public void get(); )

If you inherit an abstract class, you have to provide implementations to all the abstract methods in it.

**Abstract Methods** - If you want a class to contain a particular method but you want the actual implementation
 of that method to be determined by child classes, you can declare the method in the parent class as an abstract.

An abstract method contains a method signature, but no method body.

**Interface** - A Collection of abstract methods. 

A class implements an interface, thereby inheriting the abstract methods of the interface.

An interface is implicitly abstract. You do not need to use the abstract keyword while declaring an interface.

Each method in an interface is also implicitly abstract, so the abstract keyword is not needed. 
Methods in an interface are implicitly public.

When a class implements an interface, you can think of the class as signing a contract, agreeing to perform the specific behaviors of the interface. 

If a class does not perform all the behaviors of the interface, the class must declare itself as abstract.

**Characteristics of Interface other than a normal Class**
```
1. You cannot instantiate an interface.

2. An interface does not contain any constructors.

3. All of the methods in an interface are abstract.

4. An interface cannot contain instance fields. 
The only fields that can appear in an interface must be declared both static and final.

5. An interface is not extended by a class; it is implemented by a class.

6. An interface can extend multiple interfaces.
```

### Links
1. https://www.tutorialspoint.com/java/java_abstraction.htm

## Differences between Absract Class and Interface Class
SNo.|abstract Classes|Interfaces
---|---|---|
1| abstract class can extend only one class or one abstract class at a time| interface can extend any number of interfaces at a time
2| abstract  class  can extend from a class or from an abstract class| interface can extend only from an interface
3| abstract  class  can  have  both  abstract and concrete methods| interface can  have only abstract methods
4| A class can extend only one abstract class| A class can implement any number of interfaces
5| In abstract class keyword ‘abstract’ is mandatory to declare a method as an abstract| In an interface keyword ‘abstract’ is optional to declare a method as an abstract
6| abstract  class can have  protected , public and public abstract methods| Interface can have only public abstract methods i.e. by default
7| abstract class can have  static, final  or static final  variable with any access specifier| interface  can  have only static final (constant) variable i.e. by default

### Links
http://beginnersbook.com/2013/05/abstract-class-vs-interface-in-java/

If no modifier (public, private, protected) is specified, 
a method or member variable is treated as **default**.

The method or member variables with default modifier 
are accessible only within package.

MODIFIER|CLASS|PACKAGE|SUBCLASS|WORLD
---|---|---|---|---|
`public`|Y|Y|Y|Y
`protected`|Y|Y|Y|N
*no modifier*|Y|Y|N|N
`private`|Y|N|N|N

Every Class has a default constructor like ```<ClassName>()```
