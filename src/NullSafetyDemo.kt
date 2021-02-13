
//null Safety
fun main(){
    var sampleVar:Int? = 10
    sampleVar = null
    //sampleVar = 32

    if(sampleVar != null){
        println("We have a value ${sampleVar}")
    }else{
        println("We do not have the value")
    }

    var sampleString:String? = "It's a Beautiful day"

    //sampleString = null

    //Elvis operator
    val stringLength = sampleString?.length ?: "Unknown Length"
    println("The sampleString length is ${stringLength}")

    sampleVar = stringLength as? Int
    println("Sample var value : ${sampleVar}")
}