import kotlin.math.abs
import kotlin.math.absoluteValue
import kotlin.math.round

fun main(args: Array<String>) {
    val num1 = 15
    val num2 = 30

    val sum:Int = num1.plus(num2)
    println("Sum $sum")

    val diff:Int = num1.minus(num2)
    println("diff : $diff")

    val product:Int = num1.times( num2)
    println("Product: $product")

    val quotient:Double = num1.toDouble()/num2.toDouble()
    println("Quotient : $quotient")

    val reminder:Int = num1.rem(num2)
    println("Reminder : $reminder")

    val neg = -150.9
    val abs:Double = abs(neg)
    println("Absolute : $abs")
    println("rounded : ${round(neg)}")
}
