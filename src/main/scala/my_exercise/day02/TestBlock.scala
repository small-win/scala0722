package my_exercise.day02

/**
  * 控制抽象的名调用的应用！
  * @author lsy
  * @create 2019-12-02 18:14
  */
object TestBlock {
    def loop(n: Int)(op: => Unit): Unit = {
        if (n > 0) {
            op
            loop(n - 1)(op)
        }
    }

    def main(args: Array[String]): Unit = {
        loop(4) {
            println("test")
        }

    }
}
