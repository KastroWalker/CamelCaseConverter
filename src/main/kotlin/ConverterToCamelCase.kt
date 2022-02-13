import java.util.*

class Converter {
    private fun converterFirstLetterToUpperCase(word: String): String {
        val firstLetter = word[0].toString()
        val firstLetterConverted = firstLetter.uppercase(Locale.getDefault())
        return word.replace(firstLetter, firstLetterConverted)
    }

    fun converterToCamelCase(sentence: String): String {
        val words = sentence.split(" ")
        if (words.size == 1) return converterFirstLetterToUpperCase(words[0])

        var sentenceConverted = ""
        for (word in words) {
            val wordInLowerCase = word.lowercase(Locale.getDefault())
            sentenceConverted = "${sentenceConverted}${converterFirstLetterToUpperCase(wordInLowerCase)}"
        }

        return sentenceConverted
    }
}
