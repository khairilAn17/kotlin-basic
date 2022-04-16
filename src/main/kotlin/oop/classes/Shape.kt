package oop

/***
 * Keyword super berfungsi untuk mengakses function atau properties parent class dari child class
 */

open class Shape{
    open val corner: Int = -1 ;
}

open class Rectangle: Shape(){
    override val corner: Int = 4  // meng-override property corner Shape()
    val parentCorner: Int = super.corner // mengakses corner Shape()
}