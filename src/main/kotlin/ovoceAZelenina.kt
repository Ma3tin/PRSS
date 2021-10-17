import java.util.*
import kotlin.collections.ArrayList

fun main() {
    val sc = Scanner(System.`in`)
    val fruit: Int = sc.nextLine().toInt()
    val vegetable: Int = sc.nextLine().toInt()
    val fruits = ArrayList<String>()
    val vegetables = ArrayList<String>()
    for (i in 0 until fruit) {
        val fruity: String = sc.nextLine()
        fruits.add(fruity)
    }
    for (i in 0 until vegetable) {
        val vegetably: String = sc.nextLine()
        vegetables.add(vegetably)
    }
    var input: String = sc.nextLine()
    while (input.toUpperCase() != "END") {
        if (fruits.contains(input)) println("Ovoce") else if (vegetables.contains(input)) println("Zelenina") else println(
            "Ostatní"
        )
        input = sc.nextLine()
    }
}