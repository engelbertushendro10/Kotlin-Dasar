//import java.time.LocalDateTime
//import java.time.format.DateTimeFormatter
fun main() {
    var x = 10
    var y = 20

    x = 20
    y = 10
    println ( "variable x = $x")
    println ("variable y =  $y")

    ganjilGenap()

    luasLingkaran(15)
    tukarVariabel()

}

fun tukarVariabel(){
    var a = 10
    var b = 20

    println(+a)
    println(+b)
}

fun ganjilGenap() {
    val angka = 8

    if (angka % 2 == 0 ){
        println("the number is odd")
    } else{
        println("the number is even")
    }
}






