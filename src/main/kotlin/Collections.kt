/**
 * Utility class for working with collections of Strings.
 *
 * author <a href="https://github.com/kamarbaraka">samson baraka</a>.
 */
class Collections {

    /**
     * Utility class for working with collections of Strings.
     */
    companion object{

        /**
         * Iterates over a given collection of strings and prints each item.
         *
         * @param collection the collection of strings to iterate over
         */
        fun iterate(collection: Collection<String> ) { for (item in collection) println(item) }
        /**
         * Checks if the given element is present in the provided collection of Strings.
         *
         * @param collection The collection of Strings to check.
         * @param element The element to search for.
         *
         * @return Prints "yes" if the element is present in the collection, otherwise prints "no".
         */
        fun containing(collection: Collection<String>, element: String) = if(collection.contains(element)) println("yes") else println("no")

        /**
         * Matches the elements in the given collection with the keys in the provided map and prints the corresponding values.
         *
         * @param collection The collection of strings to match.
         * @param map The map of string keys and string values.
         *
         * @see Collections
         */
        fun vary(collection: Collection<String>, map: Map<String, String>) {

            when{
                "orange" in collection -> println(map["orange"])
                "banana" in collection -> println(map["banana"])
                "pineapple" in collection -> println(map["pineapple"])
                else -> println(map["other"])
            }

        }

        /**
         * Converts a collection of strings into a collection of Fruit objects and prints each Fruit.
         *
         * @param collection the collection of strings to be converted
         */
        fun convertToFruits(collection: Collection<String>) = collection.map { Fruit(it) }.forEach { println(it) }
    }
}

/**
 * Represents a fruit.
 *
 * @param name the name of the fruit
 *
 * author <a href="https://github.com/kamarbaraka">samson baraka</a>.
 */
data class Fruit(val name: String)

fun main() {

    val fruits = listOf(  "pineapple", "lavender", "guava", "peach")
    val map =
        mapOf(Pair("banana", "banana juice"), Pair("orange", "orange juice"), Pair("pineapple", "pinnacle juice"))

    Collections.vary(fruits, map)

}