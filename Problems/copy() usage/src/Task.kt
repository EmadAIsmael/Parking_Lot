import java.util.Scanner

//do not change this data class
data class Box(val height: Int, val length: Int, val width: Int)

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val data = IntArray(4)
    for (i in data.indices)
        data[i] = input.nextInt()

    val box1 = Box(data[0], data[1], data[3])
    val box2 = box1.copy(length = data[2])

    println(box1)
    println(box2)
}
