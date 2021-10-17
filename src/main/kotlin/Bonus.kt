import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val size = sc.nextLine().toInt()
    val numbers = Array<Int>(size){0}
    for (i in 0 until size) {
        numbers[i] = sc.nextLine().toInt()
    }

    var counter = 1
    for (i in 0 until size) {
        for (j in i + 1 until size) {
            if (numbers[i] == numbers[j]) {
                if (counter == 1 && numbers[j] != 0) {
                    print(numbers[i])
                }
                numbers[j] = 0
                counter++
            }
        }
        counter = 1
    }
}

