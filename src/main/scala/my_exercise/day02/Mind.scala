package my_exercise.day02

/**
  * Scala自我总结！推崇至简原则！
  *     参数若只用到一次，可用"_"表示占位符
  * 变量(常量)可以存储任意的值!
  *     1. 把函数当做值传递(函数的引用)给变量
  *     2. 把函数定义直接赋值给变量
  *
  * 函数编程的标配:
  *     1. 高阶函数
  *     2. 闭包
  *         一个函数, 如果他访问的外部的变量, 就是一个闭包. 闭包会持有外部变量
  *     3. 柯里化（柯里化的理论基础是闭包）
  *         把一个参数列表的多个参数, 变成多个参数列表, 就是函数的柯里化
  * @author lsy
  * @create 2019-11-30 20:00
  */
object Mind {
    def main(args: Array[String]): Unit = {

        //1、把数组展开, 一个一个的传给可变参数
        println(add(Array(1, 2, 3): _*))
        println(add(1, 2))

        //2、Scala中能用常量：val，就不用变量：var
        println(add1(3))

        //3、“_”代表传函数 ；默认赋值语句的最后一行为返回值
        def f() = {
            println("最简单的高阶函数")
            1
        }
        foo(f _)

        //4、匿名函数的具体实现 ；调用函数须传参
        val arr1 = Array(2, 3, 10)
        travel(arr1,(a: Int) => {
            println(a)
            println(a * a)
        })
        println("==============lsy_fighting=============")

        //5、对匿名函数做聚合，参数只用到一次，故可至简 , "_"表示占位符
        val arr2 = Array(1,2,3,4)
//        val res1 = reduce(arr2, (last, current) => last + current)
        val res = reduce(arr2, _ + _)
        val res2 = reduce(arr2, _ * _)
        println("加和聚合的结果为：" + res)
        println("乘积聚合的结果为：" + res2)

        //6、 把数组内所有的偶数的平方求和
        val arr3 = filter(arr2,_ % 2 == 0)
        val res4 = map(arr3,elem => elem * elem)
        val res5 = reduce(res4,_ + _)
        println("数组中偶数平方和的结果为：" + res5)

        //部分应用函数
       /* val f11 = add2(10, _)
        println(f11(20))*/

    }

    //1、可变参数
    def add(num: Int*) = {
        num.sum
    }

    //2、普通的函数和方法的形参默认都是val的. 如果需要改, 需要自己定义变量再更改
    def add1(a: Int) = {
        var b = a
        b * b
    }

    //3、高阶函数/(高级算子):一个函数A, 可以接受一个或多个函数作为参数, 或者可以返回一个函数作为返回值
    def foo(f: () => Int) = {
        println(f())
    }

    //4、定义函数, 这个函数可以遍历给定的数组, 遍历到元素之后传递给匿名函数(存在特征符“=>”)
    def travel(arr: Array[Int],f: Int => Unit) = {
        for (elem <- arr) {
            f(elem)
        }
    }

    //5、(Int, Int) 1. 上次聚合的结果, 2. 本次参与聚合的元素，3.注意泛型：[] 索引：()
    def reduce(arr: Array[Int],f: (Int,Int) => Int) : Int = {
        if (arr.length == 0) return 0
        var last: Int = arr(0)
        for(i <- 1 until arr.length) {
            last = f(last,arr(i))
        }
        last
    }

    //6、 把数组内所有的偶数的平方求和: 过滤-平方-求和
    def filter(arr: Array[Int], op: Int => Boolean) = {
        for (elem <- arr if op(elem)) yield elem
    }

    def map(arr: Array[Int],op: Int => Int) = {
        for (elem <- arr) yield op(elem)
    }
/*

    //7、部分应用函数
    def add2(a: Int,b: Int) = a + b
*/


}
