import java.text.SimpleDateFormat
import java.util.*

fun main() {
    cekUmur(1997)
}

fun cekUmur(tahun:Int){

    val cal = Calendar.getInstance()
    val date = SimpleDateFormat("yyyy", Locale.getDefault())

    val yearNow = date.format(cal.time).toInt()


    //val sekarang = 2020
    val umur = yearNow - tahun

    println("umur = $umur")

}