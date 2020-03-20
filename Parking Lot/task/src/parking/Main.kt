package parking

import java.util.Scanner

class ParkingLot {
    var capacity: Int = 0
    var spots = emptyArray<Boolean>()
    var carReg = emptyArray<String>()
    var carColor = emptyArray<String>()

    fun create(n: Int) {
        this.capacity = n
        this.spots = Array<Boolean>(n) { false }
        this.carReg = Array<String>(n) { "" }
        this.carColor = Array<String>(n) { "" }

        println("Created a parking lot with $n spots.")
    }

    fun vacancy(): Int {
        for (i in spots.indices) {
            if (!spots[i])
                return i
        }
        return -1
    }

    fun park(reg: String, color: String) {

        if (capacity == 0) {
            println("Sorry, parking lot is not created.")
            return
        }
        val freeSpot = vacancy()
        if (freeSpot != -1) {
            spots[freeSpot] = true
            carReg[freeSpot] = reg
            carColor[freeSpot] = color
            println("$color car parked on the spot ${freeSpot + 1}.")
        } else
            println("Sorry, parking lot is full.")
    }

    fun leave(spotNumber: Int) {
        if (capacity == 0) {
            println("Sorry, parking lot is not created.")
            return
        }

        val spot = "Spot $spotNumber"
        var status = spots[spotNumber - 1]

        when (status) {
            true -> {
                spots[spotNumber - 1] = false
                carReg[spotNumber - 1] = ""
                carColor[spotNumber - 1] = ""
                println("$spot is free.")
            }
            false -> println("There is no car in the ${spot.toLowerCase()}.")
        }
    }

    fun status() {
        if (capacity == 0) {
            println("Sorry, parking lot is not created.")
            return
        }

        if (spots.count({ it -> it == true }) == 0) {
            println("Parking lot is empty.")
            return
        }
        for (i in this.spots.indices) {
            if (this.spots[i])
                println("${i + 1} ${this.carReg[i]} ${this.carColor[i]}")
        }
    }

    fun regByColor(color: String) {
        if (capacity == 0) {
            println("Sorry, parking lot is not created.")
            return
        }

        if (spots.count({ it -> it == true }) == 0) {
            println("Parking lot is empty.")
            return
        }

        var found = false
        for (i in this.spots.indices) {
            if (this.spots[i] && this.carColor[i].toLowerCase() == color.toLowerCase()) {
                if (!found)
                    print("${this.carReg[i]}")
                else
                    print(", ${this.carReg[i]}")
                found = true
            }
        }
        if (!found)
            println("No cars with color $color were found.")
        else
            println()
    }

    fun spotByColor(color: String) {
        if (capacity == 0) {
            println("Sorry, parking lot is not created.")
            return
        }

        if (spots.count({ it -> it == true }) == 0) {
            println("Parking lot is empty.")
            return
        }

        var found = false
        for (i in this.spots.indices) {
            if (this.spots[i] && this.carColor[i].toLowerCase() == color.toLowerCase()) {
                if (!found)
                    print("${i + 1}")
                else
                    print(", ${i + 1}")
                found = true
            }
        }
        if (!found)
            println("No cars with color $color were found.")
        else
            println()
    }

    fun spotByReg(reg: String) {
        if (capacity == 0) {
            println("Sorry, parking lot is not created.")
            return
        }

        if (spots.count({ it -> it == true }) == 0) {
            println("Parking lot is empty.")
            return
        }

        var found = false
        for (i in this.spots.indices) {
            if (this.spots[i] && this.carReg[i] == reg) {
                println("${i + 1}")
                found = true
                break
            }
        }
        if (!found)
            println("No cars with registration number $reg were found.")
    }
}

fun main() {

    val scanner = Scanner(System.`in`)
    val parkingLot = ParkingLot()

    var command = ""
    while (command != "exit") {
        command = scanner.next()
        when (command) {
            "create" -> {
                val cap = scanner.nextInt()
                parkingLot.create(cap)
            }
            "park" -> {
                val reg = scanner.next()
                val color = scanner.next()
                parkingLot.park(reg, color)
            }
            "leave" -> {
                val spotNumber = scanner.nextInt()
                parkingLot.leave(spotNumber)
            }
            "status" -> parkingLot.status()
            "reg_by_color" -> {
                val color = scanner.next()
                parkingLot.regByColor(color)
            }
            "spot_by_color" -> {
                val color = scanner.next()
                parkingLot.spotByColor(color)
            }
            "spot_by_reg" -> {
                val reg = scanner.next()
                parkingLot.spotByReg(reg)
            }
            "exit" -> return
        }
    }
}
