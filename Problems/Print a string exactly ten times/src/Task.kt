import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var line = ""

    while (scanner.hasNext())
        line += " " + scanner.next()

    repeat(10) {
        println(line.trim())
    }
}
