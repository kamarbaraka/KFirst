class MyFirstApp {

    companion object
    {
        fun pow(status: Boolean) = if (status) println("hello") else println("goodbye")
    }

}

fun main() = MyFirstApp.pow(true)