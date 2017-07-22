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

Links 

https://www.tutorialspoint.com/java/java_inheritance.htm

http://www.rapidprogramming.com/questions-answers/How-is-inheritance-implemented-in-Java--6 

**Multiple Inheritance not allowed** in java. To facilitate multiple inheritance, we can use **Interfaces**

```image of multiple inheritance comes here```


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
