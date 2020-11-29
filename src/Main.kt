fun main(args: Array<String>) {
    val myInt = 42
    val myLong:Long = myInt.toLong()
    println("the type of myLong is ${myLong::class.qualifiedName}")

    val myLong2 = 49.9
    val myInt2 = myLong2.toInt()
    println("the value of myLong2 is $myLong2")
    println("the value of myInt2 $myInt2")

    val myInt3 = 568
    val myDouble = myInt3.toDouble()
    println("the value of myDouble $myDouble")

}
