package oop.classes

/***
 * Getter & Setter : Secara default kotlin telah menyediakan getter dan setter saat kita membuat
 * sebuah properties
 *
 * namun kita dapat membuatnya manual dengan menambahkan get() untuk getter dan set() untuk setter
 * untuk memanggil properties diobjectnya tidak perlu memakai kata kunci get dan set
 * cukup panggil saja sesuai namanya untuk mengambil atau mengubah data
 * Getter dan Setter tidak wajib dideklarasikan semua di kotlin, bisa salah satu saja atau tidak sama sekali
 */
class Note(title: String) {
    var title: String = title
        get() = field // get() bisa memiliki body seperti set namun dapat juga dibuat seperti di samping
        set(value) { // set() juga sama seperti get()
            if (value.isNotBlank()){
                field = value
            }
        }
}