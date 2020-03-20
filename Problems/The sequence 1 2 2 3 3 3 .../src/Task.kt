import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val n = scanner.nextInt()
    val sequence = Array<String>(n) { "" }

//    var i = 0
//    var m = 1
//    theWhile@ while (i < n) {
//        val nextSeq = (m).toString().repeat(m)
//        for (j in nextSeq.indices) {
//            if (i < n) {
//                sequence[i] = nextSeq[j].toString()
//                i++
//            } else
//                break@theWhile
//        }
//        m++
//    }
//    println(sequence.joinToString(" "))
    var i = 1
    var s = ""
    while (s.length <= n) {
        s += i.toString().repeat(i)
        i++
    }
    println(s.toList().subList(0, n).joinToString(" "))
}
