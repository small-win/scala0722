package com.atguigu.scala0722.day02.fun

/**
  * Author lzc
  * Date 2019/11/30 9:03
  */

//万物皆对象，Scala推崇至简原则
object FunDemo1 {
    //Scala程序的入口
    def main(args: Array[String]): Unit = {
        //Scala的输出格式
        println(add(20))
        println(add1(b = 20))
        println(add(1))
        println(add1(3,1))
        /* println(add(20, 20))
         println(add())

//        println(add1(b = 100))  // 命名参数

 println(add1(b = 10, a = 20))
 println(add1(10, b = 20))*/
    }
    //命名参数&位置参数（可以自带默认的值）
    def add(a: Int = 100, b: Int = 10) = a + b

    def add1(a: Int = 1, b: Int) = a + b
}
