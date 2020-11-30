import kotlin.math.abs
import kotlin.math.round

fun main(args: Array<String>) {
    var aString = "Hello!"
    println(aString)

    val empty = String()
    println("'$empty'")

    val charArray:CharArray = aString.toCharArray()
    println(charArray.toList())

    val byteArray:ByteArray = aString.toByteArray()
    println(byteArray.toList())

    aString += " and welcome!!"
    println(aString)

    val len:Int = aString.length
    for(i:Int in 0 until  len){
       val c:Char = aString.get(i)
        println(c)
    }

    val p:Int = aString.indexOf("w")
    val subString:String = aString.substring(p)
    println("Substring : $subString")

    val string2:String = aString.toUpperCase()
    val match = aString.equals(string2, true)

    println("Match : $match")
}
