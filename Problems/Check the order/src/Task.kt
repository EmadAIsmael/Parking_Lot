import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()

    var x = scanner.nextInt()
    for (i in 1 until n) {
        val y = scanner.nextInt()
        if (y <= x) {
            println("NO")
            return
        }
        x = y
    }
    println("YES")
}
