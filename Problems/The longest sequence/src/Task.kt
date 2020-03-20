import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val numbers = IntArray(n)
    var maxSize = 0
    var size = 1

    numbers[0] = scanner.nextInt()
    if (n == 1) {
        println(1)
        return
    }
    for (x in 1 until n) {
        numbers[x] = scanner.nextInt()
        if (numbers[x] >= numbers[x - 1]) {
            size ++
            maxSize = size
        } else {
            size = 1
        }
    }
    println(maxSize)
}
