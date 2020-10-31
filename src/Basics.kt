// We create variables with (val) instead of (var) because values wont change
// val is like const from JS.
val add: String = "+"
val subtrac = "-"
val multiply = "*"
val divide = "/"

val ERROR_MESSAGE = "An error has occurred."

val testOperandOne: Double = 5.0
val testOperandtwo = 4.0

fun main(args: Array<String>) {
    val operatorSymbol = args[0]
    start(operatorSymbol)
}

// whenever we pass parameter we need to define the type of the parameter
fun start(operatorSymbol: String) {
    if(checkArguments(operatorSymbol)) {
        val getResultValue = evaluateBinomial(testOperandOne, testOperandtwo, operatorSymbol)
        displayResult(getResultValue)
    } else {
        println(ERROR_MESSAGE)
    }
}

// as with the parameter type you also you need to specify the type of the return value if it returns something
fun checkArguments(operatorSymbol: String): Boolean {
    return when(operatorSymbol) {
        // basically and if statement.
        // operatorSymbol === add ? true
        add -> true
        subtrac -> true
        multiply -> true
        divide -> true
        // otherwise
        else -> false
    }
}

fun evaluateBinomial(value1: Double, value2: Double, symbol: String): String {
    return when(symbol) {
        add -> (value1 + value2).toString()
        subtrac -> (value1 - value2).toString()
        multiply -> (value1 * value2).toString()
        divide -> (value1 / value2).toString();
        else  -> ERROR_MESSAGE
    }
}

// Single expression syntax for single line code snippets
fun displayResult(result: String) = println(result)