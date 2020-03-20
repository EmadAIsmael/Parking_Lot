import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var sum = 0

    do {
        val x = scanner.nextInt()
        sum += x
    } while (x != 0)

    println(sum)
}
