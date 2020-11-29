fun main() {

    printWords ("arkademy")
}
fun printWords( words:String) {
    var vowel = arrayListOf<Char>('a','i','u','e','o','A','I','U','E','O')
    val word = mutableListOf<Char>()//menampung object baru dari array vowel
    for (data in words) {
        word.add(data)
    }
    for (i in 0 until word.size) {
        //cek keberadaan data dalam word
        if (vowel.contains(word[i])){
            println(word[i])
        }
    }
    for (i in 0 until word.size) {
        if (!vowel.contains(word[i])){
            println(word[i])
        }
    }
}