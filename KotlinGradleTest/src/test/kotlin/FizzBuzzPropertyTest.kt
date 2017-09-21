import io.kotlintest.properties.Gen
import io.kotlintest.properties.forAll
import io.kotlintest.specs.StringSpec

class FizzBuzzPropertyTest : StringSpec() {
    init {
        "multiples of three" {
            forAll(MultiplesOf(3), { i ->
                FizzBuzz(i).contains(Regex("Fizz"))
            })
        }

        "multiples of five" {
            forAll(MultiplesOf(5), { i ->
                FizzBuzz(i).contains(Regex("Buzz"))
            })
        }

        "multiples of fifteen" {
            forAll(MultiplesOf(15), { i ->
                FizzBuzz(i).contains(Regex("FizzBuzz"))
            })
        }
    }
}

class MultiplesOf(val number : Int) : Gen<Int> {
    override fun generate(): Int {
        return Gen.positiveIntegers()
                .generate()
                .coerceIn(0, Int.MAX_VALUE / number)
                .times(number)
    }
}