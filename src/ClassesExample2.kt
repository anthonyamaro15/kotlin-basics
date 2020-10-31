// mimic an interaction between different components of a program
fun requestData() {
    val result = InputOutputDevice.getData()

    when(result) {
        is Result.Loading -> UserInterface.showLoadingScreen()
        is Result.Success -> UserInterface.showData(result.value)
        is Result.Error -> UserInterface.showErrorMessage()
    }
}


// Result Wrapper (Either Monad)
sealed class Result {
    // for events, we create a class or object, objects work when we don't need any data
    object Loading: Result()
    object Error: Result()
    data class Success(val value: String): Result()
}

object InputOutputDevice {
    fun getData(): Result {
        return Result.Success("yes!")
    }
}

object UserInterface {
    fun showLoadingScreen() {

    }
    fun showData(data: String) {

    }
    fun showErrorMessage() {

    }
}

enum class MathematicalOperator(val op: String) {
    PLUS("+"),
    MINUS("-"),
    MULTIPLY("*"),
    DIVIDE("/")
}

fun checkOperator(op: MathematicalOperator) : (Double, Double) -> Double {
    return when(op) {
        // lambda expression
        // similar to one liner functions in JS
        // (x, y) => x + y;
        MathematicalOperator.PLUS -> {x, y -> x + y}
        MathematicalOperator.MINUS -> {x, y -> x - y}
        MathematicalOperator.MULTIPLY -> {x, y -> x * y}
        MathematicalOperator.DIVIDE -> {x,y -> x / y}
    }
}

fun main(args: Array<String>) {
    val mathFunction = checkOperator(MathematicalOperator.DIVIDE)
    // interesting ---- ???
    // when storing a function into a variable you still need to call the function like the
    // example below ???
    println(mathFunction.invoke(4.0, 4.0))
}
