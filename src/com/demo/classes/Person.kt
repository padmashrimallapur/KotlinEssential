class Person{

    constructor(){
        println("This is primary constructor")
    }

    constructor(sampleParameter: Int): this(){
        println("This is secondary constructor")
    }
    constructor(SampleParameter : String) : this(10){
        println("This is ternary constructor")
    }

    init {
        println("This is first init")
    }
    init {
        println("This is second init")
    }
    init {
        println("This is third init")
    }
}