package org.kamar

import Doctor
import org.jetbrains.annotations.NotNull

/**
 * Represents an abstract class for a person.
 *
 * @property name The person's name.
 * @property age The person's age.
 */
abstract class Person(private var name: String, private var age: Int) {

    fun getName(): String {
        return this.name
    }

    fun getAge(): Int {
        return this.age
    }


}


fun main() {
    val doctor: Doctor = Doctor("kamar", 24)
        .setCourse("med")
        .setGraduation("2024")


    println(doctor.toString())
}