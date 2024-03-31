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

            val fruits = listOf<String>("banana", "apple", "orange")
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
            var loop: Int = 0

            while (loop < names.size) {

                println("my ${loop + 1} is ${names[loop]}")

                loop++
            }

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

    Loops.whileLoop()
}