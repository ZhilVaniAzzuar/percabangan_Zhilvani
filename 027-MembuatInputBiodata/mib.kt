fun main(){
    var nama_lengkap:String; var jenis_kelamin:String; var usia:Byte; var alamat:String; var sekolah:String; var kelas:String;
    var hobby:String; var cita_cita:String; var e_mail:String; var media_sosial:String;

    println("--------------------------------------------------------")
    println("Latihan Input Data Biodata : Zhilvani Azzuar")
    println("--------------------------------------------------------")
    println("-------------------FORM INPUT BIODATA-------------------")

    print("Isi Nama Lengkap : "); val input_nama_lengkap = readLine()
    nama_lengkap = input_nama_lengkap ?: "Nama Belum Diisi"

    print("Isi Jenis Kelamin : "); val input_jenis_kelamin = readLine()
    jenis_kelamin = input_jenis_kelamin ?: "Jenis Kelamin Belum Diisi"

    print("Isi Usia : "); val input_usia = readLine()
    usia = input_usia?.toByte() ?:0

    print("Isi Alamat : "); val input_alamat = readLine()
    alamat = input_alamat ?: "Alamat Belum Diisi"

    print("Isi Sekolah : "); val input_sekolah = readLine()
    sekolah = input_sekolah ?: "Sekolah Belum Diisi"

    print("Isi Kelas : "); val input_kelas = readLine()
    kelas = input_kelas ?: "Kelas Belum Diisi"

    print("Isi Hobby : "); val input_hobby = readLine()
    hobby = input_hobby ?: "Hobby Belum Diisi"

    print("Isi Cita-cita : "); val input_citacita = readLine()
    cita_cita = input_citacita ?: "Cita cita Belum Diisi"

    print("Isi e-mail : "); val input_email = readLine()
    e_mail = input_email ?: "e-mail Belum Diisi"

    print("Isi Media Sosial : "); val input_mediasosial = readLine()
    media_sosial = input_mediasosial ?: "Media Sosial Belum Diisi"


    println("\n--------------------------------------------------------")
    println("Biodata Teman Baru, Telah Ditambahkan :)")
    println("--------------------------------------------------------")
    println("Nama Lengkap : $nama_lengkap")
    println("Jenis Kelamin : $jenis_kelamin")
    println("Usia : $usia")
    println("Alamat : $alamat")
    println("Sekolah : $sekolah")
    println("Kelas : $kelas")
    println("Hobby : $hobby")
    println("Cita CIta : $cita_cita")
    println("e-mail : $e_mail")
    println("Media Sosial : $media_sosial")
    println("--------------------------------------------------------")
}