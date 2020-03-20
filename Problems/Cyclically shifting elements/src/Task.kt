import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val input = IntArray(n)

    for (i in input.indices)
        input[i] = scanner.nextInt()

    print("${input[input.lastIndex]} ")
    for (i in 0..input.lastIndex - 1)
        print("${input[i]} ")
}
