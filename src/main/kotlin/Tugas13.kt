fun main() {
    val form = 878210789875.toString().trim{it <='0'}
//
    // mengurutkan isi form dari pembatas => 0
    val str = form.split("0")
    val strNew = mutableListOf<String>()

    for (i in 0 until str.size) {
        strNew.add(str[i].map { it }.sorted().joinToString(""))
    }
    println(strNew.joinToString(""))

}