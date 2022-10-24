package `1 Getting Started`.`2 basics`

fun main() {
    val schoolNumber =126.toByte()
    val convertedvalue: Short = schoolNumber.toShort()
    println("schoolNumber :"+schoolNumber)
    println("convertedValue :"+ convertedvalue)

    val tcIdentityNumber = 15455789645
    val convertedInt = tcIdentityNumber.toInt()
    println("converted :"+convertedInt)

    val totalValue: Long = tcIdentityNumber+schoolNumber //Long + Byte = Long
    val sameValue = 127+127 // Byte degil, Short degil, int olacaktir. sameValue=254
    val byte: String = "5"
    val IntValue =Integer.parseInt(byte)
}