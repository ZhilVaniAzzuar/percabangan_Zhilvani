fun main(){
    var operand:Int

    println("-----------------------------------------------------")
    println("Latihan Operator Penugasan : Zhilvani Azzuar")
    println("-----------------------------------------------------")

    operand = 10
    println("Operator Penugasan = (menetapkan nilai pada operand): \nOperand = $operand\n")

    operand += 10
    println("Operand+=10=$operand\nOperator penugasan += (menambahkan nilai pada operand)")
    println("penyederhanaan : (operand = operand + 10) artinya (operand = 10 + 10) jadi operand = $operand\n")

    operand -= 10
    println("Operand-=10=$operand\nOperator penugasan -= (mengurangi nilai pada operand)")
    println("penyederhanaan : (operand = operand - 10) artinya (operand = 20 - 10) jadi operand = $operand\n")

    operand *= 10
    println("Operand*=10=$operand\nOperator penugasan *= (mengkalikan nilai pada operand)")
    println("penyederhanaan : (operand = operand * 10) artinya (operand = 10 * 10) jadi operand = $operand\n")

    operand /= 10
    println("Operand/=10=$operand\nOperator penugasan /= (membagi nilai pada operand)")
    println("penyederhanaan : (operand = operand / 10) artinya (operand = 100 / 10) jadi operand = $operand\n")

    operand %= 10
    println("Operand%=10=$operand\nOperator penugasan %= (mengurangi nilai pada operand)")
    println("penyederhanaan : (operand = operand % 10) artinya (operand = 10 % 10) jadi operand = $operand\n")
}