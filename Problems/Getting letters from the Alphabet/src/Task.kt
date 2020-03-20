import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val letter = input.next()

    for (c in 'a'..'z') {
        if (letter.toCharArray()[0] > c)
            print(c)
        else
            break
    }
}
