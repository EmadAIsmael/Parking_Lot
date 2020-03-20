import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val input = IntArray(n)
    for (i in input.indices)
        input[i] = scanner.nextInt()
    var max = Int.MIN_VALUE
    var maxI = 0

    for (i in input.indices)
        if (input[i] > max) {
            max = input[i]
            maxI = i
        }

    println(maxI)
}
