fun main(){
    var operand1:Int; var operand2:Int;
    var hasiloperasi:Boolean

    println("-------------------------------------------------------")
    println("Latihan Operasi Relasi / Perbandingan : Zhilvani Azzuar")
    println("-------------------------------------------------------")

    operand1 = 10; operand2 = 20;
    hasiloperasi = (operand1 < operand2)
    println("Operator Relasi < :\nHasil Operasi, $operand1 < $operand2 = $hasiloperasi\n")

    operand1 = 20; operand2 = 20;
    hasiloperasi = (operand1 > operand2)
    println("Operator Relasi > :\nHasil Operasi, $operand1 > $operand2 = $hasiloperasi\n")

    operand1 = 30; operand2 = 20;
    hasiloperasi = (operand1 >= operand2)
    println("Operator Relasi >= :\nHasil Operasi, $operand1 >= $operand2 = $hasiloperasi\n")
    
    operand1 = 40; operand2 = 20;
    hasiloperasi = (operand1 <= operand2)
    println("Operator Relasi <= :\nHasil Operasi, $operand1 <= $operand2 = $hasiloperasi\n")

    operand1 = 50; operand2 = 50;
    hasiloperasi = (operand1 == operand2)
    println("Operator Relasi == :\nHasil Operasi, $operand1 == $operand2 = $hasiloperasi\n")

    operand1 = 50; operand2 = 50;
    hasiloperasi = operand1 != operand2
    println("Operator Relasi != :\nHasil Operasi, $operand1 != $operand2 = $hasiloperasi\n")
}