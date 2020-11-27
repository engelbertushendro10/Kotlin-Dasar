fun main(){
    var n = segitiga(5)
    println(n)
}

fun segitiga(num:Int){
    for (i in num downTo 1){
        for(j in 1..i){
            print(5)
        }
        println(" ")
    }
}