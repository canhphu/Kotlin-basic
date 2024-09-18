fun addNumbers(a: Int, b: Int): Int {
    return a + b
}

fun drive(speed: String = "fast") {
    println("driving $speed")
}

fun encodeMsg(msg: String, encode: (String) -> String): String = encode(msg)

fun enc2(s: String) = s.lowercase()

fun myRepeat(n: Int, act: (Int) -> Unit) {
    for(i in 1..n) {
        act(i - 1)
    }
}

fun main() {
    val isUnit = println("this is an expression")
    println(addNumbers(2,4))
    drive()
    drive("slow")
    var dirtLevel = 20
    val waterFilter = {level: Int -> level/2}
    println(waterFilter(dirtLevel))
    val add: (Int, Int) -> Int = {a,b -> print("The result is: "); a+b}
    println(add(3,8))
    val msg = "Hello World"
    val enc1 = {s:String -> s.uppercase()}
    println(encodeMsg(msg, enc1)) //Ham la mot tham so
    println(encodeMsg(msg, ::enc2))  //Ham rieng biet
    println(encodeMsg(msg, {s: String -> s.reversed()})) //Khai bao lambda ngay trong ham
    myRepeat(5, {println("Hello $it")})
    val ints = listOf(1,2,3)
    println(ints.filter{it > 0})
    println(ints.map{it * it})
    val numberSets = listOf(setOf(1,2,3), setOf(4,5))
    print(numberSets.flatten())
}

