class numberCounting {

}

fun main() {
    var number: String = "A2C4Z7";
    var total: Int = 0;
    for (i in 0..number.length - 1) {
        var num: Char = number[i];
        if (num.toInt() >= 48 && num.toInt() <= 57) total+= num.digitToInt()
    }
    println(total)
}