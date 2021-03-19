import kotlin.math.sqrt

fun main(args: Array<String>) {
    val n = readLine()!!.toInt()

    for (i in 0 until n) {
        val x = readLine()!!.toDouble()
        
        if(ehPrimo(x))
          println("Prime")
        else
          println("Not Prime")
    }
}

fun ehPrimo(num: Double): Boolean {
    if (num < 2)
      return false
    
    if (num % 2 == 0.0)
      return num == 2.0

    for(i in 3..sqrt(num).toInt() step 2)
        if (num % i == 0.0)
          return false

    return true
}