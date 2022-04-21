package oop.classes

/***
 * Sealed Class merupakan class yg didesain untuk inheritance
 * Sealed Class tidak dapat diintansiasi menjadi object dan secara standar merupakan abstract class
 * Sealded Class sangat cocok untuk dijadikan parent class
 * Sealed Class biasa digunakan dengan when expression
 * Dengan sealed class kita bisa membatasi hanya class turunannya yg perlu di check
 */
sealed class Operations(val name: String)

class Plus: Operations("Plus")
class Minus: Operations("Minus")