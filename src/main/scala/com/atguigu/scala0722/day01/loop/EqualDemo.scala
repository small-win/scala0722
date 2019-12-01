package com.atguigu.scala0722.day01.loop

/**
  * Author lsy
  * Date 2019/11/29 14:21
  */
object EqualDemo {
    def main(args: Array[String]): Unit = {
        println(1 << 3)  //8， 乘以2
        println(-8 >> 1)  //-4， 除以2
        println(-8 >>> 1)  //2147483644， 除以2
        
        println(1 ^ 2)  //位运算：3 异或
        
        var a = 1
        a += 1  //2,即：a = a + 1
        println(a)
        
        
    }
}

/*
1. scala没有运算符, 所有的运算符本质都是方法

2.
== equals  eq

== equals 等价的, 表示 比的内容.  一般是重新 equals (hashCode)

eq 引用类型才有, 表示比较的两个对象的地址

3. ++ -- ? : scala没有

 */