import exceptions.ConverterException
import java.util.*

class Converter {
    private fun converterFirstLetterToUpperCase(word: String): String {
        val firstLetter = word[0].toString()
        val firstLetterConverted = firstLetter.uppercase(Locale.getDefault())
        return word.replace(firstLetter, firstLetterConverted)
    }

    private fun validateSentence(sentence: String): Boolean {
        val startsWithNumber = Regex("^\\d")

        if (startsWithNumber.containsMatchIn(sentence)) {
            throw ConverterException("The sentence cannot start with a number")
        }

        return true
    }

    fun converterToCamelCase(sentence: String): String {
        var sentenceConverted = ""

        if (validateSentence(sentence)) {
            val words = sentence.split(" ")

            for (word in words) {
                val wordInLowerCase = word.lowercase(Locale.getDefault())
                sentenceConverted = "${sentenceConverted}${converterFirstLetterToUpperCase(wordInLowerCase)}"
            }
        }

        return sentenceConverted
    }
}
