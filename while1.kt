// ?? Haga un algoritmo que solicite el nombre de n cantidad de personas e imprima 
// ?? un saludo, el usuario ingresará la
// ?? cantidad de personas a validar.


fun main(){

    print("Ingrese la cantidad de personas que deseas saludar: ")
    var cantPersonas = readLine()!!.toInt()
    var contador =1

    do{
        print("Nombre de la persona que sea saludar $contador: ")
        var nombre = readLine()!!
        println("Hola $nombre !Bienvenido(a)")
        contador++

    }while(contador <= cantPersonas)

}