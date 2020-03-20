import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)
    val word = input.next()
    var cnt = 0
    var repeat = 0

    for (c in word) {
        repeat = 0
        for (x in word)
            if (c == x)
                repeat++
        if (repeat == 1)
            cnt++
    }
    println(cnt)
}
