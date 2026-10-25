fun main() {
    // 1 2 3 4 5
    for (i in 1..5) {
        print("$i ")
    }
    println()

    // 5 4 3 2 1
    for (i in 5 downTo 1) {
        print("$i ")
    }
    println()

    // 0 1 2
    for (i in 0 until 3) {
        print("$i ")
    }
    println()

    // 1 3 5 7 9
    for (i in 1..9 step 2) {
        print("$i ")
    }
    println()
}