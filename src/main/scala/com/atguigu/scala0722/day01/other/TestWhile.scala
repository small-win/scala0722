package com.atguigu.scala0722.day01.other

/**
  * @author lsystart
  * @create 2019-11-29 19:52
  */
object TestWhile {
    def main(args: Array[String]): Unit = {
        var max = 9
        for (i <- 1 to max) {
            for (j <- 1 to i) {
                print(i + "*" + j + "=" + (i * j) + "\t")
            }
            println()
        }
    }

}
