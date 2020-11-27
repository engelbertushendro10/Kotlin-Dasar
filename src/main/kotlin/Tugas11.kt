//fun main() {
//    val userInput = "malam"
//    val s1=userInput
//    var reverse:String=""
//    var l:Int=s1.length-1
//    while(l!=-1) {
//        reverse+=s1[l--]
//    }
//    if(s1==reverse)println("Palindrome String");
//    else println("Not a Palindrome String");
//}

fun main() {
    palindrome("makan")
}

fun palindrome(words:String){
    val words1 = words
    var revers: String=""
    var words2: Int = words1.length-1

    while(words2!=-1){
        revers=revers+words1[words2--]
    }
    when{
        words1==revers -> println("palindrome string")
        else-> println("note palindrome string")
    }

}