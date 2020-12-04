import Constants.Companion.RED
import kotlin.math.abs
import kotlin.math.round

fun main(args: Array<String>) {
    val num1 = 35.0
    val num2 = 10.0
    println("Add "+ add(param1 = num1, param2 = num2))

    val result1 = values(4.0, 7.0)
    println("Result1 $result1 ")

    val result2 = values(7.0, 3.0, "-")
    println("Result2 $result2")

    val result3 = calcValues(1,2,3,4,5)
    println("Result3 $result3")
}

fun add(param1 : Double, param2 : Double) : Double{
    return param1 + param2
}

fun values(param1: Double, param2: Double, op:String = "+") : Double{
    if(op.equals("+")){
        return param1+ param2
    }else if(op.equals("-")){
        return  param1 - param2
    }else{
        return -1.0
    }
}

fun calcValues(vararg numbers:Int): Int{
    var result = 0
    for(i in numbers){
        result += i
    }
    return result
}
