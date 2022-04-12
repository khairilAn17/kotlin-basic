/***
 * Anonymous function mirip dengan lamda namun lebih flexible
 * perbedaannya adalah cara membuatnya
 */

fun main() {
    fun hello(name: String, transformer: (String) -> String): String{
        val nameTransform = transformer(name)
        return "Hallo $nameTransform";
    }

    val anonymousUpper = fun(value: String): String{
        if(value.isBlank()){
            return "You should fill the value";
        }

        return value.uppercase();
    }

    println(anonymousUpper("Khairil Anwar"));
    println(anonymousUpper(""));

    print(hello("Khairil keren", anonymousUpper))
}