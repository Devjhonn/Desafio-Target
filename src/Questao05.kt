
fun main() {
    // 5) Escreva um programa que inverta os caracteres de um string.
    //IMPORTANTE:
    //a) Essa string pode ser informada através de qualquer entrada de sua preferência ou pode ser previamente definida no código;
    //b) Evite usar funções prontas, como, por exemplo, reverse;
    println("Insira a String que deseja Reverter: ")
    val entrada = readLine()?:""

    val reverteString = CharArray(entrada.length)
    for (i in entrada.indices){
        reverteString[i] = entrada.lowercase()[entrada.length - 1 -i]
    }

    println(reverteString)
}

