import exceptions.ConverterException
import org.junit.jupiter.api.assertThrows
import kotlin.test.Test
import kotlin.test.assertEquals

internal class ConverterTest {
    private val converter: Converter = Converter()

    @Test
    fun shouldConvertAWordToCamelCase() {
        val word = "name"
        val wordInCamelCase = "Name"
        val wordConverted = converter.converterToCamelCase(word)
        assertEquals(wordInCamelCase, wordConverted)
    }

    @Test
    fun shouldConvertASentenceToCamelCase() {
        val sentence = "composite name"
        val sentenceInCamelCase = "CompositeName"
        val sentenceConverted = converter.converterToCamelCase(sentence)
        assertEquals(sentenceInCamelCase, sentenceConverted)
    }

    @Test
    fun shouldConvertASentenceInUpperCaseToCamelCase() {
        val sentence = "COMPOSITE NAME"
        val sentenceInCamelCase = "CompositeName"
        val sentenceConverted = converter.converterToCamelCase(sentence)
        assertEquals(sentenceInCamelCase, sentenceConverted)
    }

    @Test
    fun shouldNotConvertSetencesStartingWithNumbers() {
        val sentence = "0COMPOSITE NAME"
        val expectedMessage = "The sentence cannot start with a number"

        val exception = assertThrows<ConverterException> {
            converter.converterToCamelCase(sentence)
        }

        assertEquals(exception.message, expectedMessage)
    }
}