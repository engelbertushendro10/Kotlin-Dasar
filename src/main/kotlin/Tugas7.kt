fun main() {
    kabisat(2020)
}

fun kabisat(tahun:Int){
    when{
        tahun % 400 == 0-> println("tahun $tahun merupakan tahun kabisat")
        tahun % 100 == 0-> println("tahun $tahun Bukan Tahun Kabisat")
        tahun % 4 == 0 -> println("Tahun $tahun Merupakan Tahun Kabisat")
        else-> println("Tahun $tahun Bukan Tahun Kabisat")
    }
}