package oop.classes

/***
 * Secara default semua class di kotlin itu meng-extend ke Any class
 * kalo di java meng-extend ke Object
 */

open class Laptop(val name: String)

open class HandPhone(val name: String)

class SmartPhone(name: String, val os: String): HandPhone(name);