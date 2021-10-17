import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val size = sc.nextLine().toInt()
    var numbers = Array<Int>(size){0}
    for (i in 0 until size) {
        numbers[i] = sc.nextLine().toInt()
    }

    for (i in 0 until size) {
        for (j in i + 1 until size) {
            if (numbers[i] == numbers[j]) {
                println(numbers[j])
            }
        }
    }
}

