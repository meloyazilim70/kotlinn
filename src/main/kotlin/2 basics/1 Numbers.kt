package `1 Getting Started`.`2 basics`

fun main() {
    val minByteValue: Byte = Byte.MIN_VALUE
    val maxByteValue: Byte = Byte.MAX_VALUE

    val minShortValue: Short = Short.MIN_VALUE
    val maxShortValue: Short = Short.MAX_VALUE

    val minIntValue: Int = Int.MIN_VALUE
    val maxIntValue: Int = Int.MAX_VALUE

    val minLongValue: Long = Long.MIN_VALUE
    val maxLongValue: Long = Long.MAX_VALUE

    val minFloatValue: Float = Float.MIN_VALUE
    val maxFloatValue: Float = Float.MAX_VALUE

    val minDoubleValue: Double = Double.MIN_VALUE
    val maxDoubleValue: Double = Double.MAX_VALUE

    println("minByteValue :" + minByteValue)
    println("maxByteValue :" + maxByteValue)
    println("minShortValue :" + minShortValue)
    println("maxShortValue :" + maxShortValue)
    println("minIntValue :" + minIntValue)
    println("maxIntValue :" + maxIntValue)
    println("minLongValue :" + minLongValue)
    println("maxLongValue :" + maxLongValue)
    println("minFloatValue :" + minFloatValue)
    println("maxFloatValue :" + maxFloatValue)
    println("minDoubleValue :" + minDoubleValue)
    println("maxDoubleValue :" + maxDoubleValue)

    val longNumber = 1586L
    //val longNumber2 = 1586l  //calismaz. 1 ile l harfinin karismamasi icin.
    val floatNumber1 = 19.90F
    val floatNumber2 = 13f
    val doubleNumber = 3.14
    val doubleNumber2 = 3.14e10
    val decimalNumber = 1987
    //val octalNumber = 0197  //calismaz. 0 ile baslatilamaz
    val hexadecimal = 0x759
    val binaryNumber = 0b01000011

    val oneMillion = 1_000_000 //1000000
    val creditCardNumber = 1234_5678_9874_3211
    val bytes = 0b01000011_01110101010_01010101010_0001110101

    val number: Int = 10000 //int
    println(number === number) //true
    val boxedNumber: Int? = number
    val anotherboxedNumber: Int? =number
    println(boxedNumber === anotherboxedNumber)//false

    val number2: Int =10000
    println(number2 == number2)//true
    val boxedNumber2: Int? =number2
    val anotherboxedNumber2: Int? = number2
    println(boxedNumber2 == anotherboxedNumber2)//true
}