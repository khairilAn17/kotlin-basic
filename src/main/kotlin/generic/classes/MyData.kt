package generic.classes

class MyData<T>(val firstData: T) {

    fun getData(): T =  firstData;

    fun printlnData(){
        println("Data is $firstData");
    }
}