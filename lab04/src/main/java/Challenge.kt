fun main() {
    print("Enter names (comma-separated): ")
    val names = readln().split(",")

    for (i in names.indices) {
        println("$i: ${names[i].trim()}")
    }
}