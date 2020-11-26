fun main() {
    var x = 10
    var y = 20

    x -= y
    y += x
    x = y - x

    println("var x = $x")
    println("var y = $y")
}