import java.math.BigInteger

fun main(){

    println(getFibonacciNumber(7, BigInteger("1"), BigInteger("0")))

    println(findFactorial(7))
}

fun getFibonacciNumber(n:Int,a:BigInteger,b:BigInteger):BigInteger{
    if(n == 0){
        return b
    }else{
        return getFibonacciNumber(n-1,a+b,a)
    }
}

fun findFactorial(num : Int):Int{

    if(num == 0){
        return 1
    }else{
        return num * findFactorial(num - 1)
    }
}









