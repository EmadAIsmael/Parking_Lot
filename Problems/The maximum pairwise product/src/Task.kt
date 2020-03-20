import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()

    var maxProduct = 0
    val input = IntArray(n)
    for (i in 0 until n) input[i] = scanner.nextInt()
    if (n == 1) {
        println(input[0])
        return
    }

    for (i in 0 until n) {
        for (j in 0 until n) {
            if (i == j) continue
            val p = input[i] * input[j]
            if (maxProduct < p) maxProduct = p
        }
    }
    println(maxProduct)
}
