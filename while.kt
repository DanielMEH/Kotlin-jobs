// ?? 2. Haga un algoritmo que solicite un número y si este es negativo lo convierta a positivo y lo imprima, realice este proceso
// ?? n cantidad de veces.

fun main(){

    var numero:Int
    var continuar = "si"

    do{

        print("Ingrese el numero: ")
        numero = readLine()!!.toInt()

        if(numero< 0){

            numero = numero*-1

        }
        println("El nuemro es positivo $numero")
        print("Deseas continuar (Si/No)")
        continuar = readLine()!!

    }while(continuar.uppercase() == "SI")
}





