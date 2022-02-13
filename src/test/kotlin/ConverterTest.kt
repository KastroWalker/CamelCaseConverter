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
}