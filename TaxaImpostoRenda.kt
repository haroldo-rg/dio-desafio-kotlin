fun main(args: Array<String>) {
    //continue a solução
    fun Float.format(digits: Int) = "%.${digits}f".format(this).replace(',','.')
    val r = readLine()!!.toFloat()
    var i = 0F
    
    if (r <= 2000) {
        i = 0F
    } else if (r <= 3000) {
        i = ((r-2000F)*0.08).toFloat()
    } else if (r <= 4500) {
        i = (1000*0.08 + (r-3000)*0.18).toFloat()
    } else if (r > 4500) {
        i = (1000*0.08 + 1500*0.18 + (r-4500)*0.28).toFloat()
    }
    
    if (i == 0F) println("Isento") else println("R$ ${i.format(2)}")
}