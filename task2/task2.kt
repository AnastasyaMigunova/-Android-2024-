fun main() {
    val arr = arrayOf(1, 2, 5, 2, 2, 6, 15, 15, 4)

    val countMap = arr.groupingBy { it }.eachCount()

    for ((key, value) in countMap) {
        println("$key - $value")
    }
}