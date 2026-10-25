fun main() {
    print("Enter numbers: ")
    val parts = readln().split(" ")

    var sum = 0
    for (p in parts) {
        if (p.isNotEmpty()) {
            sum += p.toInt()
        }
    }

    println("Sum = $sum")
}