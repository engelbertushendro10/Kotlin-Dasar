fun main() {

    // operasi pada tipe data range
    // count() = untuk mendapatkan total di range
    // countains(value) = mengecek apakah ada value tersebut
    // first = mendapatkan nilai pertama
    // lasat = mendapatkan nilai terakhir
    // step = mendapatkan nilai terakhir


    // range naik
    val range = 1..10
    println( "range = $range ")

    // val rangeDown: Any = (10 downTo 1).apply { println(this) }
    val rangeDown = 10 downTo 1 step 2
    println("Range $rangeDown")
    println("count =" +rangeDown.count())
    println("Range contains= " + rangeDown.contains(5))
    println("Range first= " +rangeDown.first())
    println("Range last=" + rangeDown.last())
    println("Range=" + rangeDown.step)


}