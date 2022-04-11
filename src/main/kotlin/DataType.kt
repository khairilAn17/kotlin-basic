
//constant, type data immutable yg dapat diakses global, biasanya menggunakan UPPER_CASE
const val EMAIl = "khairilanwar569@gmail.com";

fun main() {
    //Type data number
    var one = 1 // Int
    var threeBillion = 3000000000 // Long
    var oneLong = 1L // Long
    var oneByte: Byte = 1

    println(one)
    println(threeBillion)
    println(oneLong)
    println(oneByte)

    //undescore data number
    var age: Int = 100_00;

    println(age)

    //convertion data number
    var age_ = age.toByte()

    println(age_)

    //Type data character

    var char1: Char = 'K'
    var char2: Char = 'H'
    println(char1)

    //Type data boolean
    var benar: Boolean = true;
    var salah: Boolean = false;

    println(benar);
    println(salah);

    //Type data string
    var firstName: String = "Khairil"
    var description: String = """
        i'm a cool man, handsome and many others
        haha
    """.trimIndent()

    //string template
    var me: String = "$firstName $description"

    println(firstName);
    println(description);
    println(me);

    //variable var: mutable & val: immutable
    //type data bersifat optional
    var name: String = "Khairil";
    val addres: String = "jl. alamat haha"

    println(name);
    println(addres);

    //nullable
    var tes: String? = ""
    println(tes)

    println(EMAIl)

    //Type data range
    val range = 1..100; // naik
    var rangeDownTo = 100 downTo 1

    println(range)
    println(range.count())
    println(range.contains(17))
    println(range.first)
    println(range.last)
    println(range.step)
    var angka = 1..100
    for ( i in angka){
        println(i)
    }

}