package `1 Getting Started`

fun main() {
    /**
     * variable Types :
     * numbers(Byte, Short, Int, long, Double, Float) & Unsigned Types
     * Characters
     * Booleans
     * Arrays
     * String
     * Decimals [0-9]
     * Octals [0-7] kotlin tarafından desteklenmiyor.
     * Binary [0-1]
     * Hexadecimals [8-9A-Fa-f]
     */

    val number: Int? = null
    /**
     * kotlin' de Primitive tipler direkt olarak tanımlanmazlar.
     * Ancak yazdığınız program makina koduna derlenirken primitive tiplere dönüştürülür.
     * Eğer değişken "nullable" veya "generic" olarak tanımlanırsa referans tipli olarak dönüştürülürler.
     * Bundan dolayı performas olarak java' dan farklı değildir.
     * kontrol etmek için:
     * 1- Bir programı çalıştırın.
     * 2- Ctrl+ Shift + A -> show Kotlin Bytecode
     * 3- İsterseniz de Compiler diyerek Java kodundaki karşığını da görebilirsiniz.
     */

    /**
     * Multi thread programlama yaparken performans artışı sağlamak için olabildiğince val değişken kullanılır.
     * Best Practice olarak alışkanlığınız val tanımlamak şeklinde olsun.
     * Eğer değişkenin değerini sonradan değişmeniz gerekirse var 'a çevirebilirsiniz.
     */

    /*--------------------------------------------------------------------------------------------------*/
    val inmutableValue: String = "Değişmez Değişken"
    var mutableVariable: String = "Değişebilir Değişken"

    // inmutable = "val ifadesi ile tanımlanan değişken sonradan değiştirilemez.
    mutableVariable="var ifadesiile tanımlanan değişkene ise yeniden değer atanabilir."

    /*----------------------------------------------------------------------------------------------------*/
    /**
     * Değişken tanımı sırasında değer ataması yapılırsa,değişken tipi gereksizdir.
     */
    val name = "Gökhan" //Kotlin tip çıkarımını destekler. (Type inference) -> string
    val age = 29        //Kotlin tip çıkarımını destekler.(Type inference)  -int

    /*------------------------------------------------------------------------------------------------------*/


    /**
     * Değişken tanımı yapıldıktan sonra atama yapılabilir.
     */
    val surname:String
    surname ="Ay"

    /**
     * Ancak, değer ataması sonradan yapılacaksa değişken tipi belirtilmelidir.
     * Aşağıdaki kod çalışmaz. Commit'i kaldir konrol et istersen melo
     */
    // val middlename
    // middlename="melo"
}