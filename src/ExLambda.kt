fun main(args:Array<String>){
    println("Let's start kotlin")

    val program = Program()
     program.addTwoNumbers(5,7,object : MyInterface{
        override fun execute(sum: Int) {
            println(sum)
        }
    })


    // {s-> println(s)}          //lamda expression

    val aLambda :(Int) -> Unit = { s : Int -> println(s) }
    val bLambda :(Int) -> Int = { s : Int -> 2 + 3 }
    val cLambda :(Int) -> String = { s : Int -> "C LAMBDA" }

   // program.addTwoNumbers(5,9,aLambda)

    val myLambdaFunction:(Int,Int) -> Int = {x,y -> x+y}
    addTwoNumbers(3,8,myLambdaFunction)

}

fun addTwoNumbers(a:Int,b:Int,myFunc:(Int,Int)->Int){
    var result  = myFunc(a,b)
    println(result)
}




class Program {

    fun addTwoNumbers(a:Int,b:Int,action: (Int) -> Unit ){   //high level function with lambda as a parameter
        val sum = a + b
        action(sum)
    }

    fun addTwoNumbers(a:Int,b:Int,action:MyInterface){
        val sum = a + b
        action.execute(sum)

    }

    fun addTwoNumbers(a:Int,b:Int){
        val sum = a+b
        println(sum)
    }
}

interface MyInterface{
    fun execute(sum : Int)
}