import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val input = IntArray(n)
    for (i in input.indices) input[i] = scanner.nextInt()
    val m = scanner.nextInt()
    var count = 0

    for (i in input)
        if (m == i)
            count++
    println(count)
}
