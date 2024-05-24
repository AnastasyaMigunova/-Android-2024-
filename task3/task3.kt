import kotlin.math.PI
import kotlin.math.pow

abstract class Shape {
    abstract fun volume(): Double
    abstract fun baseArea(): Double
}

class Sphere(private val radius: Double) : Shape() {
    override fun volume(): Double {
        return (4.0 / 3.0) * PI * radius.pow(3)
    }

    override fun baseArea(): Double {
        return PI * radius.pow(2)
    }
}

class Cube(private val side: Double) : Shape() {
    override fun volume(): Double {
        return side.pow(3)
    }

    override fun baseArea(): Double {
        return side.pow(2)
    }
}

class Cylinder(private val radius: Double, private val height: Double) : Shape() {
    override fun volume(): Double {
        return PI * radius.pow(2) * height
    }

    override fun baseArea(): Double {
        return PI * radius.pow(2)
    }
}

fun main() {
    val sphere = Sphere(3.0)
    println("Объем сферы: ${sphere.volume()}")
    println("Площадь сферы: ${sphere.baseArea()}")

    val cube = Cube(2.0)
    println("Объем куба: ${cube.volume()}")
    println("Площадь куба: ${cube.baseArea()}")

    val cylinder = Cylinder(2.0, 5.0)
    println("Объем цилиндра: ${cylinder.volume()}")
    println("Площадь цилиндра: ${cylinder.baseArea()}")
}