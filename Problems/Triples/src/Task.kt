import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val input = IntArray(n)

    for (i in input.indices)
        input[i] = scanner.nextInt()
    var triples = 0

    for (i in 0..input.lastIndex - 2)
        if (input[i + 1] - input[i] == 1 &&
            input[i + 2] - input[i + 1] == 1
        )
            triples++

    println(triples)
}
