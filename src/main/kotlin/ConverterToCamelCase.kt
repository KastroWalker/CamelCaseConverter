import java.util.*

class Converter {
    private fun converterFirstLetterToUpperCase(word: String): String {
        val firstLetter = word[0].toString()
        val firstLetterConverted = firstLetter.uppercase(Locale.getDefault())
        return word.replace(firstLetter, firstLetterConverted)
    }

    fun converterToCamelCase(sentence: String): String {
        val words = sentence.split(Regex("/s+/g"))
        if (words.size == 1) return converterFirstLetterToUpperCase(words[0])
        return ""
    }
}
