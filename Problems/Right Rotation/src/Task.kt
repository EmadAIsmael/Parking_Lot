import java.util.*

fun rRotate(arr: IntArray) {
    val t = arr[arr.lastIndex]
    for (i in arr.lastIndex downTo 1)
        arr[i] = arr[i - 1]
    arr[0] = t
}

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val input = IntArray(n)
    for (i in input.indices)
        input[i] = scanner.nextInt()
    val nRot = scanner.nextInt()

    repeat(nRot % input.size) {
        rRotate(input)
    }

    for (e in input)
        print("$e ")
}
