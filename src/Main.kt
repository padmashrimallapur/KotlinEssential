fun main(args: Array<String>) {
    var num1 = 15
    val num2 = 15

    val sum:Int = num1+num2
    println("Sum $sum")

    val sum1:Int = num1.plus(num2)
    println("sum1 : $sum1")

    val diff:Int = num1-num2
    println("diff : $diff")

    num1++
    println("updated value of num1 : $num1")

    val num3 = num1.inc()
    println("updated value of num1 : $num3")

}
