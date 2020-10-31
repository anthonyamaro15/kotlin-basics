class AppUser( val name: String, val joinDate: String, val proVersion: Boolean) {
    // class constructor can contain properties


}

data class User(val uid: String, val name: String, val profileImgUrl: String = "default_value") {
    // you can also add default values just like in JS.
}

fun main(ars: Array<String>) {
    // To create a class, type the class name, and pass the values it expects
    // same as JS! expect for the (new) keyword
    val aUser = AppUser("nameVal", "any date", false)

    // we don't have to pass the third argument if we don't want to, its optional since we defined a default value
    // in its class
    val user = User("abcdef", "Anthony")

    // in case you have more than one default values defined in the class what you can do is specify the name of the
    // variable so you won't update the wrong variable like so.
    val otherUser = User("123", "Anthony", profileImgUrl = "potato.jph")
}

// Cohesion: The degree to which things belong together in this context, in a class
// Cohesive class

class DogOne(val age: Int, val weight: Double, val height: Double, val name: String, val owner: User) {
    fun makeNoise() {
        println("noiseeeeee")
    }
}

// Not cohesive
class DogTwo(val bankAccNum: Int, val letterGrade: String, val speaks: Boolean) {
    fun measure() {
        println("Bark!!!")
    }
}