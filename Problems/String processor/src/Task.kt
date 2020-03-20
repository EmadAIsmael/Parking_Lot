import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val op1 = scanner.next()
    val operand = scanner.next()
    val op2 = scanner.next()

    println(
        when (operand) {
            "equals" -> op1 == op2
            "plus" -> op1 + op2
            "endsWith" -> op1.endsWith(op2)
            else -> "Unknown operation"
        }
    )
}
