/***
 * Lamda function pada akhirnya akan di compile menjadi object
 * oleh karena itu jika terlalu sering menggunakan lamda function akan
 * mempengaruhi performance oleh karena itu dibutuhkan inline function
 * yg akan menduplikat lamda function sehingga tidak perlu membuat object terus terusan
 *
 * jika kita ingin ada parameter lamda yg tidak ingin dibuat menjadi inline maka
 * dapat dibuat menjadi object dengan menambahkan kata noinline
 */

inline fun hello(name: () -> String): String {
    return "Hello ${name()}";
}

inline fun hello1(fistName: () -> String,
                  noinline lastName: () -> String // ini akan dibuat menjadi object
        ):String{
    return "Hallo ${fistName()} ${lastName()}"
}

fun main() {
    println(hello { "Khairil" })
    println(hello { "Anwar" })

    println(hello1({"Khairil"}, {"Anwar"}))
}