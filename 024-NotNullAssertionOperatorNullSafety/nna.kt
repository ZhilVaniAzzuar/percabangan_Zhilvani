fun main(){
    var nama:String?="Zhilvani"
    var panjangkarakter:Int

    println("----------------------------------------------------------------")
    println("Latihan Operator not-null assertion (Null Safety) : Zhilvani Azzuar")
    println("----------------------------------------------------------------\n")

    panjangkarakter = nama!!.length
    println("Panjang Karakter dari Variable Nama : $nama")
    println("Panjang Karakter : $panjangkarakter")

    // nama = null
    // panjangkarakter = nama!!.length

    println("----------------------------------------------------------------")
}