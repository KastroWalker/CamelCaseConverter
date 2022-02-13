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
}