# Being_Android
如何通过自学成为一名 Android 应用开发工程师？

這是一個用作學習安卓應用開發的項目，具體過程記錄在 [**Being Android Application Development Engineer**](https://sokaorochi.github.io/project/2020/07/24/Andorid.html) 。以下是筆記：

## Lession 1: Basic Java Keywords Explained

### package:

就是 Java 的文件名，不能重復，和要有意義。

### import

重用別人的代碼。

```java
import a.a // 重用 a 文件某部分 package
import a.* // 重用 a 文件的全部 package
```

### class

將相同目的的代碼組合一起。

```java
class Car {
}
```

### method

與 Python 的 functions 一樣，相同功能的代碼組合一起。method 行數越小越好。要判斷 method 要不要返回 value。

```java
double(2) = 4
void drive(speed) {} // no return value
drive(speed) {} // return value
Car.drive(); // call the method drive on Car
```

### variable

Java 使用 CamelCase 命名方法，其他語言使用 camel_case（如 Python)。

```java
myOldCar
```

### public

Determined whether the class or method is accessoried.

```java
public class Car {
	public void drive(Speed) { // no return value
    // codes...
	}
}

@Test // @Test 之後會介紹用法
public void shouldDrive() {
    car.drive(100);
}
```

### class & object & object oriented language

抽象化：如何將問題有效轉換爲 class，並且取得具體有用的數據來組成 object。

```java
class Car (age, maxSpeed)
Car myOldCar = new Car(12, 120); 
							// Car myOldCar: declare a variable of the Car type
							// new Car(12, 120): constructe a new object under Car class
							// object allocation Car myOldCar = new Car(12, 120);
```



## Lession 2: Coding Session

