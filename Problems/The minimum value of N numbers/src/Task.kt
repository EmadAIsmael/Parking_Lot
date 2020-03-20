import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    var min = Int.MAX_VALUE

    for (i in 1..n) {
        val x = scanner.nextInt()
        if (x < min) min = x
    }
    println(min)
}
