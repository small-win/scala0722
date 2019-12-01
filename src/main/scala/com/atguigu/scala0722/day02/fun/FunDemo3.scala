package com.atguigu.scala0722.day02.fun

/**
  * @author lsy
  * @create 2019-11-30 11:23
  */
object FunDemo3 {
    def main(args: Array[String]): Unit = {
        add(2)
    }

    // 普通的函数和方法的形参默认都是val的. 如果需要改, 需要自己定义变量再更改
    def add(a: Int) = {
        var b = a
        println(b + 10)
        println(b * 2)
    }
}
