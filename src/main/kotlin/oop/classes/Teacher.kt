package oop.classes

/***
 * Terdapat 4 Visibility modifier pada kotlin
 * 1. Public: Secara default VM pada kotlin adalah public artinya dapat diakses dari mana saja
 * 2. Private: Hanya dapat diakses di tempat ia dideklarasikan
 * 3. protected: Hanya dapat diakses dari tempat dia dideklarasikan dan di turunannya
 * 4. Internal: Hanya dapat diakses di module/project yang sama
 */

class Teacher { //secara default bersifat public artinya dapat diakses darimana saja
    private fun teach(){ // Hanya dapat diakses di dalam class Teacher
        println("teach other ppl")
    }
}