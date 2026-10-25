fun main() {
    print("Enter age: ")
    val age = readln().trim().toInt()

    if (age in 13..19) {
        println("Teen")
    } else {
        println("Not a teen")
    }
}