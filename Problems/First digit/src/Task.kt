import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)
    val word = scanner.next()

    for (c in word)
        if (c in '0'..'9') {
            print(c)
            break
        }
}
