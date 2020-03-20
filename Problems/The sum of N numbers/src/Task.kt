import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val input = IntArray(n)
    for (i in 0 until n) input[i] = scanner.nextInt()
    println(input.sum())
}
