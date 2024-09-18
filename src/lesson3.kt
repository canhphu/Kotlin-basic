class Box(val length: Int, val width: Int = 20, val height: Int = 40)


// Khai bao cau truc co ban
class Square(i: Int) {
    init {
        println(i * 2)
    }
    init {
        println(i*i)
    }
}

class Circle(val radius: Double) {
    constructor(name: String) : this(1.0)
    constructor(diameter:Int) : this(diameter/2.0) {
        println("in diameter constructor")
    }
    init {
        println("Area: $(Math.PI * radius * radius")
    }
}

interface Shape {
    fun computeArea(): Double
}
class Tron(val radius: Double) : Shape {
    override fun computeArea() = Math.PI * radius * radius
}

fun main () {
    val box1 = Box(100,20,40)
    val box2 = Box(length = 100)
    val box3 = Box(length = 100, width = 20, height = 30)
    val s = Circle("test") //constructor name
    val s1 = Circle(2) //constructor diameter
    val s2 = Circle(2.0) //tham so Circle
}
