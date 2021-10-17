import java.util.*

class bankovkyAMince {
}

fun main() {
    val sc = Scanner(System.`in`)
    var now: Int = sc.nextLine().toInt()
    var total = 0
    val bankNotes = intArrayOf(5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1)
    for (bankNote in bankNotes) {
        val n = now / bankNote
        now -= n * bankNote
        total += n
    }
    println(total)
}