package oop.`object`

import oop.classes.Note

fun main() {
    val note = Note("Belajar bareng")

    println(note.title) // untuk get

    note.title = "Khairil" // untuk set
     println(note.title)
}