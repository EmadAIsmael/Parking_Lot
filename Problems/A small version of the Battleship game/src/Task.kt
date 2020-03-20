import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val rows = IntArray(3)
    val cols = IntArray(3)
    var freeRows = ""
    var freeCols = ""

    for (i in rows.indices) {
        rows[i] = input.nextInt()
        cols[i] = input.nextInt()
    }

    for (row in 1..5)
        if (row !in rows)
            freeRows += "$row "
    println(freeRows.substring(0, freeRows.length - 1))

    for (col in 1..5)
        if (col !in cols)
            freeCols += "$col "
    println(freeCols.substring(0, freeCols.length - 1))
}
