package oop.classes

/**
 * di kotlin kita dapat membuat class di dalam class namun class yg di dalam class yg lain
 * tidak dapat mengakses properties atau function dari class di luarnya
 * artinya inner class tidak memiliki hubungan dengan outer class
 * agar inner class dapat mengakses outernya makan perlu ditambahkan kata kunci inner di inner class nya
 */
class Boss(val bossName: String) {
    inner class Employee(val name: String){
        fun hi(){
            println("Hi, my name is $name, my boss name is ${this@Boss.bossName}")
        }
    }
}