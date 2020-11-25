fun main() {
    // kumpuan karakter atau text
    // kata kunci String

    val namaDepan = "Tino"
    val namaBlakang = "Rajen"

    // val fulname : String = namaDepan + "" + namaBlakang
    //trimMargin() function
    val jalan: String = """
        | Jalan Raya sesetan,
        | nomor 21,
        | Denpasar Bali
    """.trimMargin()

    // penggabungan String menggunakan + (plus)
    // template string
    val fulname = "$namaDepan $namaBlakang"
    //recomended penggabungan string
    val desc = "$fulname length = ${fulname.length}"

    println(desc)
    println(jalan)
}