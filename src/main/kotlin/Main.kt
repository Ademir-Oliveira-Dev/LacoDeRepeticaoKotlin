fun main(args: Array<String>) {
    /*2 - Ler 10 números e imprimir quantos são pares e quantos são ímpares.
     */

    var arrayNum: Array<Int> = arrayOf(2,5,12,17,24,31,38,45,52,57)
    var par = 0
    var impar = 0

    for (x in arrayNum){
        if (x%2 == 0){
            par++
        }else
            impar++
    }
    println("A quantidade de numéros pares é $par")
    println("A quantidade de numéros impares é $impar")
}