# 問題和方法

## 1. Java 8 V.S. Java 11

一開始我是按照這個 [Learn Java 8 - Full Tutorial for Beginners](https://www.youtube.com/watch?v=grEKMHGYyns&t=1808s) 教程學習，因爲看他點贊數目比較多。雖然那時候一開始沒有留意到這是 Java 8 的教程，而我根據其他教程已經在 Ubuntu 上安裝了 Java 11，於是當我發現這點的時候，就搜索了 **Java 8 和 Java 11 的區別**， 可惜很多概念我都看不懂。媽的。我還是先把 Java 的基礎知識補上（雖然我不太知道“基礎知識究竟指的是什麼”），才能做對比，這對於進一步學習 Java 編程或許會有幫助。

## 2. VS code 關於 Java 的環境變量的相關設定

在 VS code 裏的 Configure Java Runtime 頁面有幾個環境路徑 (environment path)： **java.home / java.home / JDK_HOME / JAVA_HOME** 我想在這裏解釋，配置和記錄下來：

![java_env_path](/home/da/Documents/github/Being_Android/Note/java_env_path.png)

### JAVA_HOME: 

#### 解釋：

這是代表 **Java Development Kit** 安裝的位置，至於什麼是 Java Development Kit 之後可以解釋。

#### 配置：

通過以下命令行搜索已安裝有關  Java 的內容：

```bash
sudo locate | grep "jvm"
```

搜索得出：

```bash
/usr/lib/jvm/java-1.11.0-openjdk-amd64
```

這就是 JDK 安裝的位置。再將此路徑記錄在 ~/.bashrc 裏

```bash
JAVA_HOME="/usr/lib/jvm/java-1.11.0-openjdk-amd64"
```

再 source 它就可以了。

### JDK_HOME:

根據 Nam Ha Minh 在[這裏的回答](https://coderanch.com/t/600047/java/Difference-JAVA-HOME-JRE-HOME)，JDK_HOME 和 JAVA_HOME 是指同一樣東西，那就是 JDK 的安裝路徑，所以嘗試設定 JDK_HOME 與 JAVA_HOME 相同，看能否成功。

### 結論：

似乎在這是三個環境變量中，能成功設定一個即可。

![java_env_path_done](/home/da/Documents/github/Being_Android/Note/java_env_path_done.png)



## 3. JUnit 的認識

在教學視頻中看到 Marcus Biel import junit.Test:

```java
import org.junit.Test;
```

爲保持與教學視頻統一性（雖然後來發現他運行的是 JAVA 8，而我使用的是 JAVA 11，本身已經有很大差異）。以下爲我對 Junit 的認識：

### JUnit:

根據 [wikipedia](https://en.wikipedia.org/wiki/JUnit)， JUnit 是 Java 的 unit testing framework。然後什麼是 unit test 呢？（之前在工作中常聽到”單元測試“這個概念。）根據 [wikipedia](https://zh.wikipedia.org/zh-tw/%E5%8D%95%E5%85%83%E6%B5%8B%E8%AF%95) ，單元測試就是對模組進行測試，好像特別來介紹這個有點多餘。當看完這個[視頻](https://www.youtube.com/watch?v=O1XnFHdsjYU)之後，直接用代碼和例子就很清晰怎樣使用 JUnit 了。只不過 VS code 不像 Eclipse 那麼方便導入 org.junit 而已。

[【Java】VS Code导入jar包及进行JUnit单元测试](https://www.cnblogs.com/ME-WE/p/12500766.html) 這個帖子很好地講解了如何在 Eclipse 中導入和測試。

[JUnit Testing in VS Code](https://www.youtube.com/watch?v=60yrTfVdFwo) 這是 VS code 版本。

VS code 需要在 .vscode 中的 setting.json 添加以下內容：

```json
{
	"java.project.referencedLibraries": [
		"lib/**/*.jar",
		"${HOME}/lib/junit-4.13.jar"
	]
}
```

才可以順利導入 JUnit 包

## #. 待辦事項

Java Development Kit 是什麼

## $. 備忘

教學網址：

- [Java Full Course](https://www.youtube.com/watch?v=hBh_CC5y8-s)
- [Learn Java 8](https://www.youtube.com/watch?v=grEKMHGYyns&t=1809s) （在學）

