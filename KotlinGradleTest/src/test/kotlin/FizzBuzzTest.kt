import org.junit.Test
import kotlin.test.assertEquals

class FizzBuzzTest {
    @Test
    fun `returns "1" when given 1`() {
        assertEquals(FizzBuzz(1), "1")
    }

   @Test
    fun `returns "2" when given 2`() {
        assertEquals(FizzBuzz(2), "2")
    }

    @Test
    fun `returns "Fizz" when given 3`() {
        assertEquals(FizzBuzz(3), "Fizz")
    }

    @Test
    fun `returns an iterator when given no arguments`() {
        assertEquals(FizzBuzz().take(5).toCollection(ArrayList()),
                listOf("1", "2", "Fizz", "4","Buzz"))
    }

}

