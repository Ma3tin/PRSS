fun main() {
    println("Zadejte počet slov")
    val countOfWords = readLine()!!.toInt()
    val words = Array(countOfWords) {
        println("Zadej ${it + 1}. slovo")
        val input = readLine()!!.toString()
        input to countVowels(input)
    }
    val vowelsInWordsMap = words.groupBy({it.second}, {it.first})
    println("Zadejte počet slabik nebo end pro konec")
    var input = readLine()!!
    while (input != "end") {
        println(vowelsInWordsMap.getOrDefault(input.toInt(), "[]"))
        println("Zadejte dalsi cislo nebo end pro konec")
        input = readLine()!!
    }
}


fun countVowels(input: String):Int {
    val vowels = arrayOf('a', 'e', 'i', 'o', 'u')
    var total = 0
    for (i in input) {
        if (vowels.contains(i)) total++
    }
    return total
}