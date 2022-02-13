import exceptions.ConverterException
import java.util.*

class Converter {
    private fun converterFirstLetterToUpperCase(word: String): String {
        val firstLetter = word[0].toString()
        val firstLetterConverted = firstLetter.uppercase(Locale.getDefault())
        return word.replace(firstLetter, firstLetterConverted)
    }

    private fun validateSentence(sentence: String): Boolean {
        val startWithNumber = Regex("^\\d").containsMatchIn(sentence)
        val doesNotContainOnlyAlphanumerics = !Regex("^[a-zA-Z0-9\\s]*$").containsMatchIn(sentence)

        if (startWithNumber) {
            throw ConverterException("The sentence cannot start with a number")
        } else if (doesNotContainOnlyAlphanumerics) {
            throw ConverterException("The sentence must contain only alphanumerics")
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
