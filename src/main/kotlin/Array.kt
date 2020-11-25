fun main() {
    val members : Array<String> = arrayOf("Tino", "Rajen", "Stiki")

    //akses array
    members.set(0, "Bertus")
    println(members[0])

    val nilai: Array<Int> = arrayOf(10, 9, 7)
    println(nilai[0])
    println(nilai[1])
    println(nilai[2])

    val name :Array<String?> = arrayOfNulls(5)
    name[0] = "Tino"
    name[1] = "Rajen"
    name[2] = "Apriliano"
    name[3] = "Jexsen"
    name[4] = "Ganteng"

    println(name[0])

}