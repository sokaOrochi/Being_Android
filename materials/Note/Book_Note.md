# Thinking in Java(4th edition)

End @ The hidden implementation

## 摘抄：

### Preface:

1. Programming is about **managing complexity**: the complexity of the problem you want to solve, laid upon the complexity of the machine in which it is solved.
2. ... all the programming languages... their main design goal would be to conquer the complexity of developing and maintaining programs.
3. ... the next revolution is the formation of a kind of global mind that results from enough people and enough interconnectedness. *神經病*

#### The 4th edition:

1. A learning experience is what you get when you don't get what you want.

### Introduction:

#### Prerequisites:

1. This book **assumes** that you have some programming familiaryity... *WTF*

#### Foundations for Java:

1. ... the C syntax, operators, and functions that Java syntax is based upon.

#### Coding standards:

1. ... the coding style issue is to use a tool like **Jalopy** ... 

### Introduction to Objects:

1. ... computer are not so much machines as they are **mind amplification tools** and a different kind of **expressive medium**. As a result, the tools are beginning to look less like machines and **more like parts of our minds**, ... such as writing, painting, ... Object-oriented programming (OOP) is part of this movement toward using the computer as an expressive medium.

#### The progress of abstraction:

1. ... their (assembly language, FORTRAN, Basic, C) primary abstraction still **requires you to think in terms of the structure of the computer** rather than the struture of the problem you are trying to solve. The programmer must establish the association between **the machine model** (solution space) and **the model of the problem** (problem space) that is actually being solved.
2. We refer to the elements in the problem space and their representations in the solution space as "objects". ... the program is allowed to **adapt itself to the lingo of the problem** by a**dding new types of objects**, so when you read the code describing the solution, you're reading words that also express the problem. *如何將 problem space 轉化爲 solution spaca 的 object ？*
3. ... OOP allows you to **describe the problem in terms of the problem**, rather than in terms of the computer where the solution will run. *但是具體要怎樣做？*
4. ... they (objects) all have **characteristics** and **behaviors**. *對應 C 中的 state 和 operations。*
   1. Everything is an object. (... stores data, ... perform operations...)
   2. A program is a bunch of objects telling each other what to do by sending messages.
   3. Each object has its own memory made up of other objects. *繼承*
   4. Every object has a type. (Object 是 Class 的實體，Class 就是類型，規範什麼接受什麼 data。)
   5. All objects of a particular type can receive the same messages.
5. An object has **state** (internal data), **behavior** (methods) and **identity**.

#### An object has an interface:

1. Creating abstract data types (classes) is a fundamental concept in object-oriented programming.

2. When you see the word "type" think "class" and vice versa. 

3. ... programmer **defines a class to fit a problem** rather than being forces to use an existing data type (floating point number) that was designed to represent a unit of storage in a machine.  \

4. The requests you can make of an object are defined by its interface, ...

   <img src="/home/da/Documents/github/Being_Android/materials/Note/Screenshot/interface.png" alt="interface" style="zoom: 50%;" />

   ```java
   Light lt = new Light(); // type or class: Light , object: lt
   lt.on(); // interface
   ```

   

5. The preceding diagram follows the format of the **Unified Modeling Language** (UML). UML 就是一種規範：最開頭是 Type name，中間是 data members，methods 在最後。通常只關系 Type name 和 methods 就可以。（除非你需要自己寫一個 Type / Class。）

#### An object provides services:

1. Your program itself will **provide services to the user,** and it will accomplish this by using the services offered by other objects... provide the ideal services to solve your problem.
2. It (**High cohesion**) means that the various aspects of a software component "fit together" well.
3. ...**each object does one thing well,** but doesn't try to do too much... be purchased... be reused...

#### The hidden implementation:

----------------------------------------------------

## 筆記：

### Preface:

1. 程式語言的目的都是用來**降低解決問題的復雜度**。同時在**運行時間和編程難度上作取舍**。這本書用 Java 和 C++ 來作對比（因爲這本書的第四版是在2006年出版）。現在可以用 Python 來做對比了。目的多是爲了**高效**。

2. 提到的一些不懂的方向：multi-threading,  network programming, cross-platform programs, dynamic code changes, security。這些方向都可以用 Java 來實現。

3. <u>什麼是 Java SE5/6</u>？就是以下命令行的結果：

   ```bash
   $ java -version
   
   # 本機結果 2020-08-01
   $ openjdk version "11.0.8" 2020-07-14
   $ OpenJDK Runtime Environment (build 11.0.8+10-post-Ubuntu-0ubuntu120.04)
   $ OpenJDK 64-Bit Server VM (build 11.0.8+10-post-Ubuntu-0ubuntu120.04, mixed mode, sharing)
   ```

   不知道 **Java SE11 和 Java SE5/6 的差異**會不會在學習的過程中造成很大的問題？

### Introduction:

1. 什麼是 **Macro language**, **Perl**？可以找作者另外一本 **Thinking in C** 和 **Thinking in C++** 看看。
2. 不需要先學 C, C++，之後再學 Java。雖然三者之間是有承接關系。
3. Java coding style 用 **Jalopy** 規範，或者用類似的工具。看 VS code extensions 有沒有類似 Jalopy 的工具。傻的嗎？要錢？不了。但是需要注意 Java coding style 的問題。

### Introduction to Objects:

1. 操蛋，早點看這本書就好了。電腦是意志的放大器。經典。
2. Class 就是 Type，浮點數也是 Class，只不過系簡單的 Class。
3. 媽的，形容 OOP 的比喻用得真好。
4. 如何將問題分拆到每個 object 身上，每個 object 提供咩 service，義務系咩？