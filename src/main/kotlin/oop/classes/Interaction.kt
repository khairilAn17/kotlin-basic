package oop.classes

/***
 * Interface digunakan untuk membuat blue print atau contract sebuah class
 * di interface dapat dibuat concreate function artinya tidak wajib di overrid
 * caranya adalah dengan membuat body pada function tersebut
 * di interface sebuah class child boleh memiliki banyak interface parent
 * sedangkan di class biasa hanya boleh memiliki satu parent
 * Interface dapat melakukan inheritance dengan interface lain
 * namun tidak dapat inheritance dengan class
 * Jika ada dua interface dengan dau function yg sama persis maka harus dioverride di class
 * and jika ingin memanggil parent dari class ke interface dengan super maka harus ditentukan
 * interface yg dimaksud, cth : super<MoveA>.move(); super<MoveB>.move()
 */

interface Interaction {
    val name: String
    fun sayHello(name: String)
}

interface Go{
    fun go(){
        println("go")
    }
}

class Human(override val name: String): Interaction, Go{ // multiple interface parent
    override fun sayHello(name: String) {
        println("Hallo name $name, my name is ${this.name}")
    }
}