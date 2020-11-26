fun main() {
    var matek = 89
    var bing = 90
    var ipa = 90
    var ips = 90

    var nilai = arrayOf(matek,bing,ipa,ips)
    var average = nilai.average()
    println(average)

    when{
        average>90-> println("grade : A")
        average>80-> println("grade : B")
        average>70-> println("Grade : C")
        average>60-> println("Grade : D")
        else -> println("Grade : E")
    }
}