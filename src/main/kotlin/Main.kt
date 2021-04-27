
fun main() {
    val numbers = mutableListOf<Int> (1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val target = 10
    val resultList = twoSum(numbers, target)

    println("Final List: $resultList")



}
fun twoSum(numbers: MutableList<Int>, target: Int) : MutableList<Int> {
    var indexList = mutableListOf<Int>()
    var baseNumber: Int
    var index = 0
    var sum: Int
    numbers.forEach {
        baseNumber = numbers[index]
        println("Current List: $indexList")

        var sumItemIndex = 0
        for (number in  numbers) {
            sum = baseNumber + number
            // println("$number -- ${numbers[index]} -- $sum")
            when (sum) {
                target -> {
                    indexList.add(index)
                    indexList.add(sumItemIndex)
                    println("index of number $baseNumber is $index:  item added")
                }
            }
            sumItemIndex += 1
        }
        index += 1
    }
    return indexList
}