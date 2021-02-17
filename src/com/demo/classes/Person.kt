class Person{

    lateinit var fistName : String
    lateinit var lastName : String

    constructor(){
        println("This is primary constructor")
    }

    constructor(fname: String , lName: String){
        fistName = fname
        lastName = lName
    }

    constructor(sampleParameter: Int): this(){
        println("This is secondary constructor")
    }

    fun someRandomFunction(){
        if(this::fistName.isInitialized) {
            println("Some random function ${this.fistName}")
        }else{
            println("First name not initialized")
        }
    }

}