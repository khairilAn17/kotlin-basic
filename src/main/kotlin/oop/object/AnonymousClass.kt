package oop.`object`

/**
 * Kotlin mendukung pembuatan class yg belum sepenuhnya siap
 * anonymous class dapat dibuat dengan menggunakan kata kunci object
 */
import oop.classes.Action

fun fireAction(action: Action){
    action.action()
}

fun main() {
    fireAction(object : Action{ // membuat anonymous class dengan kata kunci object
        override fun action() = println("Action One")
    })
}