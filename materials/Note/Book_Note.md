

# Thinking in Java(4th edition)

[TOC]

# Preface:

1. Programming is about **managing complexity**: the complexity of the problem you want to solve, laid upon the complexity of the machine in which it is solved.
2. ... all the programming languages... their main design goal would be to **conquer the complexity** of developing and maintaining programs.
3. ... the next revolution is the formation of a kind of global mind that results from enough people and enough interconnectedness. *神經病，我不看好全球化*

## The 4th edition:

1. A learning experience is what you get when you don't get what you want.

# Introduction:

## Prerequisites:

1. This book **assumes** that you have some programming familiarity... *WTF*

## Foundations for Java:

1. ... the C syntax, operators, and functions that Java syntax is based upon.

## Coding standards:

1. ... the coding style issue is to use a tool like **Jalopy** ... 

# Chapter 1: Introduction to Objects:

1. ... computer are not so much machines as they are **mind amplification tools** and a different kind of **expressive medium**. As a result, the tools are beginning to look less like machines and **more like parts of our minds**, ... such as writing, painting, ... Object-oriented programming (OOP) is part of this movement toward using the computer as an expressive medium.

## The progress of abstraction:

1. ... their (assembly language, FORTRAN, Basic, C) primary abstraction still **requires you to think in terms of the structure of the computer** rather than the struture of the problem you are trying to solve. The programmer must establish the association between **the machine model** (solution space) and **the model of the problem** (problem space) that is actually being solved.
2. We refer to the elements in the problem space and their representations in the solution space as "objects". ... the program is allowed to **adapt itself to the lingo of the problem** by a**dding new types of objects**, so when you read the code describing the solution, you're reading words that also express the problem. *如何將 problem space 轉化爲 solution spaca 的 object ？*
3. ... OOP allows you to **describe the problem in terms of the problem**, rather than in terms of the computer where the solution will run. *但是具體要怎樣做？*
4. ... they (objects) all have **characteristics** and **behaviors**. *對應 C 中的 state 和 operations。*
   1. Everything is an object. (... stores data, ... perform operations...)
   2. A program is a bunch of objects telling each other what to do by sending messages.
   3. Each object has its own memory made up of other objects. 繼承
   4. Every object has a type. (Object 是 Class 的實體，Class 就是類型，規範什麼接受什麼 data。)
   5. All objects of a particular type can receive the same messages.
5. An object has **state** (internal data), **behavior** (methods) and **identity**.

## An object has an interface:

1. Creating abstract data types (classes) is a fundamental concept in object-oriented programming.

2. When you see the word "type" think "class" and vice versa. 

3. ... programmer **defines a class to fit a problem** rather than being forces to use an existing data type (floating point number) that was designed to represent a unit of storage in a machine. 

4. The requests you can make of an object are defined by its interface, ...

   ```java
Light lt = new Light(); // type or class: Light , object: lt
   lt.on(); // interface
   ```
   
5. The preceding diagram follows the format of the **Unified Modeling Language** (UML). UML 就是一種規範：最開頭是 Type name，中間是 data members，methods 在最後。通常只關系 Type name 和 methods 就可以。（除非你需要自己寫一個 Type / Class。）

## An object provides services:

1. Your program itself will **provide services to the user,** and it will accomplish this by using the services offered by other objects... provide the ideal services to solve your problem.
2. It (**High cohesion**) means that the various aspects of a software component "fit together" well.
3. ...**each object does one thing well,** but doesn't try to do too much... be purchased... be reused...

## The hidden implementation:

1. ... **class creators** (those who create new data types) and **client programmers** (the class consumers who use the data types in their application). class creator: 創造 class，client programmer: 使用 class.
2. **public** means the following element is available to everyone. the **private** keyword, on the other hand, means that no one can access that element except you, ... an inheriting class has access to **protected** members, but not private members... 任何人可以用 public ，只有 class creator 才可以用 private（沒有繼承關系），protected 類似 private，但是可以繼承。
3. ... **package** access because classes can access the members of other classes in the same package (**library component**),...

## Reusing the implementation:

1. **Code reuse** is one of the greatest advantages that object-oriented programming languages provide.
2. Your new **class** can **be made up of** any number and type of **other objects**,... composing a new class from existing classes, this concept is called composition,... "has-a" relationship...

## Inheritance:

1. ... we can take the existing class, clone it, and then make additions and modifications to the clone... inheritance,...
2. A base type contains all of the characteristics and behaviors that are shared among the types derived from it. You create a base type to represent the core of your ideas about some objects in your system. From the base type, you derive other types to express the different ways that this core can be realized.
3. ... the derived class is the same type as the base class.
4. You simply add brand new methods to the derived class... your base class might also need these additional methods. 在 derived class 裏添加的新 method，要留意 base class 需不需要。
5. ... differentiate your new class is to change the behavior of an existing base-class method... I'm using the same interface method here, but I want it to do something different for my new type. 不一定在 derived class 裏添加新 method，亦要留意改 base class 裏的 method 來成爲 derived class。

## Is-a vs. is-like-a relationships:

1. 當在 derived class 裏添加原來 base class 沒有的 method 時，此時 derived class 就不是和 base class 同一個 type 了（is-like-a relationship）。如果只是修改 method 裏的東西，沒有添加新 method，那他們還是同一個 type（is-a relationship）。

## Interchangeable objects with polymorphism:

1. **多型看不懂！！！** *猜測意思是 前 type (shape) 套在 後 type (circle) 上，然後 後 type  就可以用 前 type 的 method 了，這就是 upcasting。*

## The singly rooted hierarchy:

1. ... all classes should ultimately be inherited from a single base class...
2. All objects can easily be created on the heap, and argument passing is greatly simplified.
3. ...garbage collector... you'll never end up with an object whose type you cannot determine.

## Containers:

1. *Containers 就是 List, Maps, Sets, Arrays 來裝其他 object。*
2. ... containers provide different types of interfaces and external behavior.
3. ... different containers have different efficiencies for certain operations.

## Parameterized types (generics):

1. downcasting: 你要用其他 type 套在 containers 裏的 objects， 可是爲了 type 的類型要一致，就要用到 parameterized types 來統一 container 裏的 type 的類型（同一個 type）。

## Object creation & lifetime:

1. ... the storage and lifetime can be determined while the program is being written, by placing the objects on the stack or in the static storage area. ... sacrifice flexibility because you must know the exact quantity, lifetime, and type of objects...
2. ... create objects dynamically in a pool of memory called the heap.
3. ...garbage collector that automatically discovers when an object is no longer in use and destroys it.

## Exception handling: dealing with errors: 

1. ...in Java, exception handling was wired in from the beginning and you're forced to use it.

## Concurrent programming:

1. Within a program, these separately running pieces are called threads, and the general concept is called concurrency.
2. The program is logically divided into tasks,...
3. ...resources that can be shared, ... must be locked while they are being used.

## Java and the Internet:

### What is the Web?

1. ...client/server systems...

#### Client/server computing:

1. the information repository, the software that distributes the information, and the machine(s) where the information and software reside are called "the server."
2. The software that resides on the consumer machine, communicates with the server, fetches the information, processes it, and then displays it on the consumer machine is called the client.
3. ... Client/server computing accounts for roughly half of all programming activities.

#### The Web as a giant server:

1. 本節所說的 It (sending request to server) could take many seconds or minutes to find out you had misspelled something in your request. 已經過時。

#### Client-side programming:

1. This submission passes through the **Common Gateway Interface** (CGI) provided on all Web servers.
2. ...Web sites built on CGI programs can rapidly become overly complicated to maintain, and there is also the proglem of response time.
3. Client-side programming means that the Web browser is harnessed to do whatever work it can,... Client-side programming 就是設計瀏覽器。。。弱智。。。
4. Plug-ins: 添加 plug-in 到瀏覽器
5. Scripting languages: Javascript 可以解決問題的 80%
6. Java: 剩下的 20% 用 Java 的 applet 解決，applet 和 Web page 一起下載到瀏覽器（帶有 Java interpreters），然後自動解決問題。
7. Alternatives: ... (applet) to increase responsiveness and decrease bandwidth requirements ... 10 MB download necessary to install the Java Runtime Environment was too scary...
8. .Net and C#: 知識太舊，不需要知道。
9. Internet vs. intranet: 知識太舊，不需要知道。

#### Server-side programming:

1. 就是接受和處理 client-side 發來的請求。
2. ...its (Java) programmability, its robustness, its large, standard library and the numerous third-party libraries...

## Summary:

1. A well-written Java program is generally far simpler and much easier to understand than a procedural program.



-----------------------------------------------------

# Chapter 2: Everything is an object:

1. The Java language assumes that you want to do only object-oriented programming.

## You manipulate objects with references:

1. ...a television (the object) and a remote control (the reference).

## You must create all the objects:

1. When you create a reference, you want to connect it with a new object.

2. ... creating new types is the fundamental activity in Java programming,...

   ```java
   String s = "asdf";
   String s = new String("asdf");
   ```

### Where storage lives:

1. Registers
2. The stack: ...lives in the general random-access memory (RAM) area,... the stack pointer is moved down to create new memory and moved up to release that memory. references 放在 stack 上，objects 就不是。
3. The heap: ... a general-purpose pool of memory where all Java objects live. stack 和 heap 最大區別就是：stack 固定了存儲內容的 lifetime，可是 heap 沒有。heap 更靈活，可是也更耗時去 allocate。
4. Constant storage: ... placed directly in the program code,...
5. Non-RAM storage: streamed objects 就是發送去其他電腦的內容，persistent object 就是當程序停了也會保留的內容。

### Special case: primitive types

1. ... an "automatic" variable is created that is not a reference. The variable holds the value directly, and it's placed on the stack,... (boolean, char, byte, short, int, long, float, double, void)

#### High-precision numbers:

1. ... two classes... BigInteger and BigDecimal.

### Arrays in Java:

1. A Java array is guaranteed to be initialized and cannot be accessed outside of its range.
2. When you create an array of objects, you are really creating an array of references, and each of those references is automatically initialized to special value with its own keyword: null.

## You never need to destroy an object:

### Scoping

1. ... scope is determined by the placement of curly braces {}.
2. A variable defined within a scope is available only to the end of that scope.

### Scope of objects:

1. ... the reference s vanishes at the end of the scope. However, the String object that s was pointing to is still occupying memory.

   ```java
   {
   	String s = new String("a string");
       // s vanishes within {}
       // String() is ended with garbage collector
   }
   ```

   

2. Java has a **garbage collector**, which looks at all the objects that were created with new and figures out which ones are not being referenced anymore. Then it releases the memory for those objects, so the memory can be used for new objects.

3. ... eliminates ... "memory leak,"...

## Creating new data types: class

1. Forms:

   ```java
   class ATypeName { /* Class body */} 
   //  introduces a new type
   ATypeName a = new ATypeName(); 
   // create a object of ATypeName
   ```

### Fields and methods:

1. ... all you do in Java is **define classes**, **make objects** of those classes, and **send messages** to those objects...

2. you can put two types of elements in your class: field (... **data members**), and methods (. **member functions**). A field ... reference, or a primitive type. 

   ```java
   class DataOnly { 
   	int i;
   	double d;
   	boolean b;
   }
   // define a class
   
   DataOnly data = new DataOnly();
   // create a object
   
   data.i = 47;
   // assign values to the fields
   
   myPlane.leftTank.capacity = 100;
   // ...object contains other objects that contain data...
   ```

3. ... it (primitive data) is guaranteed to get a default value... It's best to always explicitly initialize your variables. *一定要 initialize 的時候就賦值*

## Methods, arguments, and return values

1. ... method, as in "a way to do something."

2. Methods in Java determine the messages an object can receive.

   ```java
   ReturnType methodName(/* Arguments */) {
   	/* method body */
   }
   ```

3. Methods in Java can be created only as part of class. A method can be called only for an object, and that object must be able to perform that method call.

   ```java
   objectName.methodName(arg1, arg2);
   int x = a.f(); // sending f() message to a object, return x
   ```

### The argument list

1. 你是傳 object 的 reference 到 method argument list 裏的。

   ```java
   int storage(String s) {
   	return s.length() * 2;
   }
   ```

2. When the return type is void, then the return keyword is used only to exit the method,...

   ```java
   boolean flag() { return true; }
   double naturalLogBase() { return 2.718; }
   void nothing() { return; } // 可以 return nothing
   ```

## Building a Java program

### Name visibility

1. ... the Java creators want you to use your Internet domain name in reverse since domain names are guaranteed to be unique.... MindView.net... net.mindview.utility.foibles...

### Using other components

1. ... telling the Java compiler exactly what classes you want by using the import keyword. import tells the compiler to bring in a package, which is a library of classes.

   ```java
   import java.util.ArrayList;
   import java.util.*;
   ```

### The static keyword

1. ... you make two StaticTest objects, there will still be only one piece of storage for StaticTest.i.

   ```java
   class StaticTest {
   	static int i = 47;
   }
   StaticTest st1 = new StaticTest();
   StaticTest st2 = new StaticTest();
   // st1.i 和 st2.i 的值都是 47
   
   StaticTest.i++;
   // 除了靠 object 來操控 static variable
   // 也可以直接用 class 來控制
   ```

2. 如果 static 的是 method 也可以直接用 class 來 call

   ```java
   class Incrementable {
   	static void increment() { StaticTest.i++; }
   }
   Incrementable sf = new Incrementable();
   sf.increment(); // 靠 object 來 call method
   
   Incrementable.increment(); 
   // 直接用 class 來 call method
   ```

3. An important use of static for methods is to allow you to call that method without creating an object.

## Your first Java program

```java
// HelloDate.java
import java.util.*;
public class HelloDate {
    public static void main(String[] args) {
        // String[] -> an array of 
        // String objects
        // args -> hold the arguments 
        // from the command line
        System.out.println("Hello, it's: ");
        System.out.println(new Date());
        // 直接用 class 來 call method
    }
}
// ...the garbage collector can 
// come along and get it anytime.
```

### Compiling and running

1. *直接用 VS code 就可以了，不用 Sun 的*

### Comments and embedded documentation

```java
/*
 * C-style comments
 */

// C++-style single-line comment
```

### Comment documentation

1. **Javadoc**: 輸出 HTML 形式的 documentation 。具體用法參考 [How to Write Doc Comments for the Javadoc Tool](https://www.oracle.com/technical-resources/articles/java/javadoc-tool.html)

   ```shell
   mkdir javadoc-html
   javadoc -d javadoc-html testing.java
   ```

2. 通常 Java 文件格式：

   ```java
   //: object/HelloDate.java
   import java.util.*;
   
   /** The first Thinking in Java example program.
    * Displays a string and today's date.
    * @author Soka Orochi
    * @author sokaorochi.github.io
    * @version 4.0
    */
   public class HelloDate {
       /** Entry point to class & application
        * @param args array of string arguments
        * @throws exceptions Noexceptions thrown
        */
       public static void main(final String[] args) {
           System.out.println("Hello, it's: ");
           System.out.println(new Date());
       }
   }   /* Output: (55% match)
   Hello, it's: 
   Thu Aug 06 19:38:34 CST 2020
   *///:~
   ```

<hr/>

## Coding style

1. ... "camel-casing" ...

   ```java
   class AllTheColorOfTheRainbow {
   	int anIntegerRepresentingColors:
   	void changeTheHueOfTheColor(int newHue) {
       	// ...
   	}
   		// ...
   }
   ```

## Summary

1. ... how to write a simple program ... an overview of the the language and some of its basic ideas. *最重要是要知道 javadoc 的用法*

## Exercise

```shell
./src/c1/*  # 在這裏
```

