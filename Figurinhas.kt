fun main(args: Array<String>) {
    for (i in 1..readLine()!!.toInt()) {
        val input = readLine()!!.split(" ").map { it.toInt() }
        println(mdc(input[0], input[1]))
    }
}

// máximo divisor comum (chamada recursiva)
fun mdc(n1: Int, n2: Int): Int
{
  if(n2 == 0) 
    return n1
  else
    return mdc(n2, n1 % n2)
}