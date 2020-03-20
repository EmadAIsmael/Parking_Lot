import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val s = scanner.nextInt()
    val input = IntArray(s)
    for (i in input.indices)
        input[i] = scanner.nextInt()
    val n = scanner.nextInt()
    val m = scanner.nextInt()

    for (i in 1..input.lastIndex) {
        if ((input[i - 1] == n && input[i] == m) ||
            (input[i - 1] == m && input[i] == n)
        ) {
            println("NO")
            return
        }
    }
    println("YES")
}
