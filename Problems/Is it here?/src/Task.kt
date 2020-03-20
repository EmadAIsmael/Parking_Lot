import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val input = IntArray(n)
    for (i in input.indices)
        input[i] = scanner.nextInt()
    val m = scanner.nextInt()

    for (i in input)
        if (m == i) {
            println("YES")
            return
        }
    println("NO")
}
