package oop.`object`

import oop.classes.City
import oop.classes.Location

fun main() {
   // val location = Location("Medan"); // ini akan error
    val city = City("Medan");
    print(city.name)
}