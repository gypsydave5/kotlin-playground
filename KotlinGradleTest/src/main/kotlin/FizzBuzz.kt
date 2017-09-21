fun FizzBuzz(number : Int) : String {
    return when {
        number % 15 == 0 -> "FizzBuzz"
        number % 5 == 0 -> "Buzz"
        number % 3 == 0 -> "Fizz"
        else -> number.toString()
    }
}

fun FizzBuzz() : Sequence<String> {
    return generateSequence(1) { it + 1 }
            .map(::FizzBuzz)
}
