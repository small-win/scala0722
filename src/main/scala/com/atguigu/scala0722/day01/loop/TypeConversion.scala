package com.atguigu.scala0722.day01.loop

/**
  * Author lsy
  * Date 2019/11/29 14:12
  */
object TypeConversion {
    def main(args: Array[String]): Unit = {
        val a = 1.1
        val b: Int = a.toInt
        println(b) //1
        
        val s = a + ""
        val s1 = a.toString
        println(s1) //1.1

        val num = "1.1"
        println(num.toDouble) //1.1
    }
}
/*
byte->short->int->long->float->double
char->int->long->...


 */
