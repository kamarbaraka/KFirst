/**
 * Loops class contains methods for iterating over lists using different types of loops.
 *
 * @author <a href="https://github.com/kamarbaraka">samson baraka</a>.
 */
class Loops {

    /**
     * This class provides methods for executing loops and printing out values.
     */
    companion object
    {
        /**
         * Executes a for loop to iterate over a list of fruits and print them out.
         *
         * The method creates a list `fruits` containing strings: "banana", "apple", and "orange".
         * It then iterates over the indices of the `fruits` list using a for loop.
         * Inside the loop, it prints the index and the corresponding fruit.
         * The index is incremented by 1 before printing to display a human-readable index.
         *
         * Example Usage:
         * ```kotlin
         * forLoop()
         * ```
         *
         * Output:
         * ```
         * the 1th fruit is banana
         * the 2th fruit is apple
         * the 3th fruit is orange
         * ```
         */
        fun forLoop() {

            val fruits = listOf("banana", "apple", "orange")
            for (i: Int in fruits.indices) {

                println("the ${i + 1}th fruit is ${fruits[i]}")

            }
        }

        /**
         * Executes a while loop to iterate over a list of names and print them out.
         *
         * The method initializes a loop index variable, `loop`, to 0.
         * It then enters a while loop that continues as long as the index is less than the size of the names list.
         * Inside the loop, it prints out the current name and its corresponding index.
         * After each iteration, the loop index is incremented by 1.
         *
         * Example Usage:
         * ```kotlin
         * whileLoop()
         * ```
         *
         * Output:
         * ```
         * my 1 is samson
         * my 2 is baraka
         * my 3 is kahindi
         * ```
         */
        fun whileLoop() {

            val names = listOf<String>("samson", "baraka", "kahindi")
            var loop = 0

            while (loop < names.size) {

                println("my ${loop + 1} is ${names[loop]}")

                loop++
            }

        }

        /**
         * Executes specific code based on the value of the trigger parameter using a when expression.
         *
         * @param trigger the string value representing the trigger condition
         */
        fun whenExpression(trigger: String) {

            /*when expression example*/
            when (trigger) {
                "start" -> println("Starting...")
                "stop" -> println("Stopping...")
                "hello" -> println("HELLO!")
                "bye" -> println("Bye...")
                else -> println("Unknown trigger")
            }
        }
    }
}

/**
 * The `Range` class provides utility methods for working with ranges of numbers.
 *
 * @author <a href="https://github.com/kamarbaraka">samson baraka</a>.
 */
class Range{
    /**
     * The `Companion` class provides utility methods for working with ranges of numbers.
     *
     * @since 1.0
     */
    companion object{

        /**
         * Checks if the given [value] is within the specified range defined by [max] and [min] (inclusive).
         *
         * @param value the value to be checked
         * @param max the upper bound of the range, defaults to [Int.MAX_VALUE]
         * @param min the lower bound of the range, defaults to 0
         */
        fun within(value: Int, max: Int, min: Int= 0) =
            if (value in min..max) println("$value is in the range") else println("$value is not in the range")

        /**
         * Prints the progression of numbers from [min] to [max] with a specified [step].
         *
         * @param max the maximum value in the progression
         * @param min the minimum value in the progression, defaults to 0
         * @param step the step between consecutive values in the progression, defaults to 1
         * @param reversed indicates whether the progression should be printed in reversed order, defaults to false
         */
        fun progression(max: Int, min: Int = 0, step: Int = 1, reversed: Boolean = false) {

            if (reversed)
                    for (i: Int in max downTo min step step) println(i)
                 else
                    for (i: Int in min..max step step) println(i)
        }
    }
}

/**
 * The entry point of the program.
 *
 * This method calls the `whileLoop` method from the `Loops` class.
 *
 * @see Loops.whileLoop
 */
fun main() {

    Range.within(7, 10, 5)
}