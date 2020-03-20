import java.util.Scanner

data class Client(val name: String, val age: Int) {
    var balance: Int = 0
}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val clients = Array<Client>(2) { Client("", 0) }

    for (i in 0..1) {
        val name = input.next()
        val age = input.nextInt()
        val balance = input.nextInt()

        clients[i] = Client(name, age)
        clients[i].balance = balance
    }
    println(clients[0] == clients[1])
}
