/***
 * Lamda function adalah fungsi tanpa nama
 */
fun main() {
    val lamdaFun: (String) -> String = { name : String ->
        "Hallo $name"
    }

    //parameter pada lamda function bisa lebih dari satu
    val lamdaTwoParams: (String, String) -> String = {
        firstName: String, lastName: String -> "Hallo $firstName $lastName"
    }

    //untuk satu parameter bisa menggunakan kata kunci it tanpa membuat parameter
    val lamdaIt: (String) -> String = {
        "your hobby $it"
    }
    println(lamdaIt("Make Coding"))

    var myName = lamdaFun("Khairil")
    println(myName)

    var myCompleteName = lamdaTwoParams("Khairil", "Anwar");
    println(myCompleteName)

    //Method Referecen yaitu menjadi fungsi dengan parameter dan nilai balikkan yang sama menjadi lamda function
    val cthMethodRef: (String) -> String = ::address

    println(cthMethodRef("jl Medan Kutacane"))

}

fun address(value: String): String{
    return  "your addres $value";
}

