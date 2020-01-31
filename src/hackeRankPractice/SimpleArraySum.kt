package hackeRankPractice

import java.util.*

/*
 * Complete the simpleArraySum function below.
 */
fun simpleArraySum(ar: Array<Int>): Int {
    var total = 0

    for(i in ar){
        total = total+i
    }
    return total

}

fun main(args: Array<String>) {
    val scan = Scanner(System.`in`)

    println("Please specify array count number:")

    val arCount = scan.nextLine().trim().toInt()


    println("Please input your numbers")
    val ar = scan.nextLine().split(" ").map{ it.trim().toInt() }.toTypedArray()

    val result = simpleArraySum(ar)

    println(result)
}