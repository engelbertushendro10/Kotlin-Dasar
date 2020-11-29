/*
    1. Start
    2. Buat variabel x = 10, y = 20
    3. Ganti nilai x dengan nilai x - y
    4. Ganti nilai y dengan nilai y + x
    5. Ganti nilai x dengan nilai y - x
    6. Print x & y sesudah ditukar
    7. Finish
*/

fun main() {
    var x = 10
    var y = 20

    x -= y
    y += x
    x = y - x

    println("var x = $x")
    println("var y = $y")
}