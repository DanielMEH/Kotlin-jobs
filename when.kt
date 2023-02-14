// ? 3. Haga un algoritmo que solicite el numero de horas trabajadas de un empleado, teniendo que el valor de la hora es igual
// ? a $2000 calcule el salario base y realicele un descuento del 10% por concepto de derechos medicos, posteriormente solicite
// ? el tipo de empleado y realice el aumento del salario basado en la siguiente tabla:
// ? Tipo A - Aumento del 30%
// ? Tipo B - Aumento del 20%
// ? Tipo C - Aumento del 10%
// ?  En caso de que el usuario no tenga un tipo definido, entonces no se le realizará ningún aumento, indique cual seria el
// ? salario final basado en los calculos anteriores.
// ** Con when

fun main(){
    print("Hola mundo")
    print("Ingrese el numero de horas trabajadas: ")
    var HorasTrabajadas = readLine()!!.toInt()
    var tarifaHora = 2000
    var salario = HorasTrabajadas* tarifaHora
    println("salario empleado es de: $salario")
    var descuentoPorc = 0.1
    var descuento = salario*descuentoPorc
    println("se realizo un descuento del 10% equivalente a: $descuento")
    var salarioTotal = salario-(descuento)
    println("Salario neto a pagar es: $salarioTotal")
    print("Ingrese el tipo emleado para realizar el descuento (A,B,C)")
    var opcionTipoEmpleado = readLine()
    var porcAumento= 0.0

    when(opcionTipoEmpleado){
        "a","A"->{
            porcAumento= 30.0
            print("Se realizara un descuento del: $porcAumento")


        }
        "b","B"->{
            porcAumento= 20.0
            print("Se realizara un descuento del: $porcAumento")


        }
        "c","C"->{
            porcAumento= 10.0
            print("Se realizara un descuento del: $porcAumento")

        }
        else ->{
            porcAumento= 0.0
            print("No se realizara un descuento del: $porcAumento")
        }


    }

    if(porcAumento != 0.0){

        var aumento = salarioTotal*(porcAumento/100)
        salarioTotal = salarioTotal+aumento
        println("Se realizo un aumento de $aumento del equivalente al $porcAumento%")
        println("Salario final quedo en $salarioTotal")
    }

}


