fun main() {

    var userResponse = 0
    println("View the prices of items")
    do {
        println("(1) Apples")
        println("(2) Bananas")
        println("(3) Strawberries")
        println("(4) Watermelon")
        println("(5) Cherries")
        print("Enter a number: ")
        userResponse = readln()!!.toInt()

        if (userResponse == 1 ||userResponse == 2 ||userResponse == 3 ||userResponse == 4 ||userResponse == 5) {
                println("-------------------")
            if (userResponse == 1) {
                println("Apples are $1.68/lb")
                println("------------------")
            }
            else if (userResponse == 2) {
                println("Bananas are $0.62/lb")
                println("------------------")
            }
            else if (userResponse == 3) {
                println("Strawberries are $1.68/lb")
                println("------------------")
            }
            else if (userResponse == 4) {
                println("Watermelons are $0.38/lb")
                println("------------------")
            }
            else if (userResponse == 5) {
                println("Cherries are $11.52/lb")
                println("------------------")
            }
        } else if (userResponse == 6) {
            println("Have a nice day")
            } else
                println("Enter a valid number")
    } while (userResponse != 6)


}