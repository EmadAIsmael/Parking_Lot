import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    val n = scanner.nextInt()
    val income = IntArray(n)
    val tax = IntArray(n)
    var max = 0
    var company = 1

    for (i in income.indices)
        income[i] = scanner.nextInt()

    for (i in tax.indices)
        tax[i] = scanner.nextInt()

    for (i in income.indices) {
        val amt = income[i] * tax[i]
        if (amt > max) {
            max = amt
            company = i + 1
        }
    }
    println(company)
}
