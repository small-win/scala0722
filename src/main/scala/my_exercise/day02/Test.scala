package my_exercise.day02

/**
  * @author lsy
  * @create 2019-11-30 11:28
  */
object Test {
    def main(args: Array[String]): Unit = {

        println(add(10)(20))

        println(jiecheng(4))
    }

    def add(a: Int)(b: Int) = a + b

    def jiecheng(n: Int) : Int = {
        if(n == 1) 1
        else n * jiecheng(n - 1)
    }
}
