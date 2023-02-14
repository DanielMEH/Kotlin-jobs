// ?? Fibonacci 0,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597\ldots \,}.

fun main(){

    print("fibonacci")
    print("Ingrese la cantidad de numeros")

    var n = readLine()!!.toInt()

    var num1 = 1
    var num2 = 0
    var suma = 0
    var fibonacci = arrayListOf<Int>()

    for(i in 1..n){

        fibonacci.add(num1)

        suma = num1 + num2
        num2 = num1
        num1 = suma

    }

    print(fibonacci)

}
