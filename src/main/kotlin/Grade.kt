fun main() {
    var matek = 79
    var bing = 89
    var ipa = 92
    var ips = 67

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