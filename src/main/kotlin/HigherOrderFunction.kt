fun main() {
    fun hello(name: String, transformer: (String) -> String): String {
        val nameTransform = transformer(name);
        return "Hello $nameTransform"
    }

    val lamdaUpper = {value : String -> value.uppercase()}

   println(hello("Khairil", lamdaUpper))

    println(hello("ANwar", {value : String -> value.lowercase()}))

    //jika lamda nya berada diakhir parameter kita bisa memakai trailing lamda

    // lamdanya diletakkan setelah tutup kurung == trailing lamda
    val result1 = hello("Budi") { value: String -> value.uppercase()}

    println(result1)
}