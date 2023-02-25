fun main() {
    val number = 1234567890
    var oddDigits = mutableListOf<Int>()
    var evenDigits = mutableListOf<Int>()
    var temp = number
    while (temp > 0) {
        val digit = temp % 10
        if (digit % 2 == 0) {
            evenDigits.add(digit)
        } else {
            oddDigits.add(digit)
        }
        temp /= 10
    }

    val mostSignificantOddDigit = oddDigits.max()
    println("Most Significant Odd Digit: $mostSignificantOddDigit")

    val factorials = mutableListOf<Long>()
    for (i in 1..mostSignificantOddDigit) {
        factorials.add(factorial(i.toLong()))
    }
    println("Factorials: $factorials")

    val fibonacci = mutableListOf<Long>(0, 1)
    while (fibonacci.size < mostSignificantOddDigit) {
        val nextFibonacci = fibonacci[fibonacci.size - 1] + fibonacci[fibonacci.size - 2]
        fibonacci.add(nextFibonacci)
    }
    println("Fibonacci series: $fibonacci")

    val secondEvenNumber = evenDigits[1]
    println("Second Even Number: $secondEvenNumber")

    evenDigits.removeAt(2)
    println("Even Digits after deleting 3rd index: $evenDigits")
}

fun factorial(n: Long): Long {
    return if (n == 0L) {
        1
    } else {
        n * factorial(n - 1)
    }
}