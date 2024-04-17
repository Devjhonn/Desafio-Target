import java.util.*

fun main(){
    /* Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores
    (exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número,
    ele calcule a sequência de Fibonacci e retorne uma mensagem avisando se o número informado pertence ou não a sequência.*/

    val entrada = Scanner(System.`in`)

    println("Digite o número que deseja calcular a sequencia: ")
    var numeroFibon = entrada.nextInt()

    while(numeroFibon < 1){
        println("Insira um número inteiro positivo maior de 0")
        numeroFibon = entrada.nextInt()
    }

    var a = 0
    var b = 1


    println("A sequencia de fibonati de $numeroFibon é = ")
    for (i in 1..numeroFibon + 1){
        println("$a ")
        val sum = a + b
        a = b
        b = sum
    }


}