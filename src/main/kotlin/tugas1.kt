/* Menukar isi dari variable
   membuat var x dan var y
   menambahkan satu variabel z untuk menampung isi dari variable pertama

*/
fun main() {
    var x = 10
    var y = 20
    val z = x

    x = y
    y = z

    println ( "variable x = $x")
    println ("variable y =  $y")
}