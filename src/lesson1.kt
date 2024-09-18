fun main() {
    println("Hello World")
    val a = arrayOf(1,2)
    a[0] = 3
    val b = 100_000_000
    println(b)
    val s = "abc" //Khong the thay doi gia tri
    println("$s length is ${s.length}")
    var c = 10 //Co the thay doi gia tri
    println(c)
    for(i in 1..10) {
        print(i)
        print(" ")
    }
    print("\n")
    for (i in 10 downTo 1 ) {
        print(i)
        print(" ")
    }
    print("\n")
    repeat(2) {
        println("Hello World")
    }
    val instruments = listOf("trumpet", "piano", "violin")
    println(instruments)
    val myList = mutableListOf("trumpet", "piano", "violin")
    myList[0] = "drum"
    println(myList)
    val pets = arrayOf("dogs","cats")
    println(java.util.Arrays.toString(pets))
}