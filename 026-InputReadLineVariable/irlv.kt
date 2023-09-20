fun main(){
    var nama:String
    var jeniskelamin:Char
    var usia:Int
    var alamat:String

    println("--------------------------------------------------------")
    println("Latihan Input Data Ke Variable : Zhilvani Azzuar")
    println("--------------------------------------------------------")
    println("INPUT DATA :")

    print("input nama : ")
    var inputdatanama = readLine()

    print("input jenis kelamin : ")
    var inputdatajeniskelamin = readLine()

    print("input usia : ")
    var inputdatausia = readLine()

    print("input alamat : ")
    var inputdataamalat = readLine()

    nama = inputdatanama ?:"Nama Belum di Input"
    jeniskelamin = inputdatajeniskelamin ?.first()?:'L'
    usia = inputdatausia?.toInt()?:0
    alamat = inputdataamalat ?:"Alamat belum di input"

    println("\n--------------------------------------------------------")
    println("BIODATA SINGKAT")
    println("Nama : $nama")
    println("Jenis Kelamin : $jeniskelamin")
    println("Usia : $usia")
    println("Alamat : $alamat")
    println("--------------------------------------------------------")
}