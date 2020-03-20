import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    val a = scanner.nextInt()
    val b = scanner.nextInt()
    val c = scanner.nextInt()
    val d = scanner.nextInt()

    for (x in 0..1000) {
        if (a * Math.pow(x.toDouble(), 3.0) + b * Math.pow(x.toDouble(), 2.0) + c * x + d == 0.0) {
            println(x)
        }
    }
}
