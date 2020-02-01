package hackeRankPractice

import java.util.*

fun main(args: Array<String>){


    val tallestCandle =  birthdayCakeCandles()
    println("The tallest candle would be $tallestCandle")



}

fun birthdayCakeCandles(): Int{
    println("Please input the number of candles :")
    val scan = Scanner(System.`in`)
    val totalCandle = scan.nextLine().trim().toInt()

    println("Please specify the height of the candles :")
    val candleHeights = scan.nextLine().split(" ").map {
        it.trim().toInt()
    }.toTypedArray()

    val max = candleHeights.max()

    return candleHeights.count {
         it == max
     }


}