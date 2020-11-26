fun main() {
    palindrom("makan")
}

fun palindrom(words: String){
    var palindrom = ""
    var text = words.length - 1

    while ( text >= 0 ) {
        palindrom += words[text].toString()
        text--
    }

 when{
     palindrom == text.toString() -> println("palindrome")
     else-> println("not palinderome")
 }
}