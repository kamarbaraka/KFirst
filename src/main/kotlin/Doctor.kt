import org.jetbrains.annotations.NotNull
import org.kamar.Person

/**
 * Represents a doctor.
 * Extends the Person class and inherits the name and age properties.
 * A doctor has additional properties - course and graduation.
 *
 * @see Person
 */
class Doctor(@NotNull name: String, age: Int): Person(name, age) {

    private var course: String = ""
    private var graduation: String = ""

    fun setCourse(course: String): Doctor {
        this.course = course
        return this
    }

    fun setGraduation(graduation: String): Doctor {
        this.graduation = graduation
        return this
    }

    override fun toString(): String {
        return "Doctor(course='$course', graduation='$graduation')"
    }

}

open class Vehicle(brand: String, model: String, year: Int) {

    private var mileage: Double = 0.0
}

class Car(brand: String, model: String, year: Int, mileage: Int): Vehicle(brand, model, year) {

}