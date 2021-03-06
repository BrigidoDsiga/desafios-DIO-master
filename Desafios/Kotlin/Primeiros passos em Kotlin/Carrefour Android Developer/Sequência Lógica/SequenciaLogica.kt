/*

Detalhe

Desenvolva um programa capaz de ler um valor inteiro N. N * 2 linhas de saída vão ser apresentadas na execução do programa, seguindo a lógica do exemplo mais abaixo. Para os valores com mais de seis dígitos, todos os dígitos devem ser apresentados.

Entrada

O arquivo de entrada contém um número inteiro positivo N (1 < N < 1000).

Saída

Imprima a saída conforme o exemplo fornecido.

*/

fun main() {
    val n = 1..(readLine() ?: return).toInt()
    val ee = 2
    val eee = 3
    n.forEach {
	    /*println("$it ${(it.toDouble().pow(2)).toInt()} ${(it.toDouble().pow(3)).toInt()}")*/
        println("$it ${(Math.pow(it.toDouble(), ee.toDouble()).toInt())} ${(Math.pow(it.toDouble(), eee.toDouble()).toInt())}")
        println("$it ${(Math.pow(it.toDouble(), ee.toDouble()).toInt() + 1)} ${(Math.pow(it.toDouble(), eee.toDouble()).toInt() + 1)}")
    }
}

