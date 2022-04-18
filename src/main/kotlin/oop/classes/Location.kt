package oop.classes

/***
 * Abstract class adalah class yg tidak dapat langsung dibuat objectnya
 * fungsinya sebagai class yg akan diturunkan
 * Abstract class secara default akan menjadi open class yg dapat diturunkan
 *
 * untuk membuat abstract properties & abstract function maka kita perlu membuatnya di abstract class
 * properties & function yg bersifat abstract wajib dibuat ulang di class child nya
 */
abstract class Location(val name: String) // abstract class dibuat dengan kata kunci abstract

class City(name: String): Location(name); // meng-extend abstract class Location