import java.io.EOFException

fun main(args: Array<String>) {
    
    while (true) {
    
        try {
            val l = readLine()!!.toInt()
            val vList: List<Int> = readLine()!!.split(" ").map { it -> it.toInt() }
            val v: Array<Int> = vList.toTypedArray()
            
            v.sort()
            val velocidade = v[v.lastIndex]
            
            if(velocidade < 10)
                println("1")
            else if(velocidade < 20)
                println("2")
            else
                println("3")

        } catch(e : Exception) {
            break
        }
    }
}