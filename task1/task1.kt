fun findDuplicate(nums: IntArray): Int {
    val n = nums.size - 1
    val expectedSum = n * (n + 1) / 2
    val actualSum = nums.sum()
    return actualSum - expectedSum
}

fun main() {
    val numbers = IntArray(100) { it + 1 }

    val duplicate = (1..100).random()
    println(duplicate)

    val numbersWithDuplicate = numbers + duplicate
    println("Дублированный элемент: ${findDuplicate(numbersWithDuplicate)}")
}