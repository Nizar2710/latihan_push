package kotlin1

fun main(){

    // Tipe Data String
    val namaDepan : String = " Nizar "
    val namaBlakang = " Arya "
    var umur : Int = 20
    val result = " Nama Saya $namaDepan $namaBlakang Umur Saya $umur Tahun"

    //println("Nama Saya"+namaDepan + namaBlakang +" Umur Saya "+umur + "Tahun" )
    print(result)
    print(" Dia Sangat Tampan ")
    print(" Dan ")
    print(" Pemberani ")

    // Tipe Data Int
    // Bilangan Bulat
    val byte : Byte = 100
    val short : Short = 10000
    val nilai : Int = 20
    val long : Long = 100L


    // Bilangan Pecahan
    val float = 15.5F
    val double = 20.00000000


    // Tipe Data Char
    val char = 'S'


    val biodata = """
        |Berkulit Hitam
        |Berrambut Panjang 
        |Tampan
    """.trimMargin()


    // Tipe Data Boolean
    val nilaiBenar = true
    val nilaiSalah = false

}