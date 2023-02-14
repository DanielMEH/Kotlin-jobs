// ?? Algoritmo que calcule solicite el nombre y la materia de un estudiante, así como 3
// ??  notas parciales y con esto calcule el
// ?? promedio de notas, valide que si el estudiante saca un promedio mayor o igual
// ??  a 3.5 entonces indique que el estudiante ganó
// ?? la materia, de lo contrario indique que la perdió, en caso de perderla valide
// ??  si se perdió con una nota mayor a 2.5 entonces el
// ?? estudiante puede recuperar, el mensaje deberá mencionar el nombre y la materia 
// ?? del estudiante, debe validar que las notas
// ?? se encuentren en el rango de 0 a 5

fun main(){


    print("Ingrese la primera nota: ")
    
    var note1 = readLine()!!.toFloat()
    
    if(note1 >= 0 && note1 <= 5){
        print("Ingrese la segunda nota:")
        var note2 = readLine()!!.toFloat()

        if(note2 >= 0 && note2 <= 5){

            print("Ingrese la tercera nota: ")
            var note3 = readLine()!!.toFloat()
            if(note3>= 0 && note3 <= 5){

                var promedio = (note1+note2+note3)/3
        
                if(promedio >= 3.5 ){
        
                    println("El estudiante gano la mataria con $promedio")
                }else if( promedio > 2.5 && promedio < 3.5){
        
                    println("El estudiante perdio pero puede recuperara con $promedio")
                }else{
                    println("El estudiante perdio sin recuperar la nota $promedio")
            
                }
               
            }else{
                println("La nota3 no esta entre al rango 0 a 5")
            }
    
        }else{
            println("La nota2 no esta entre al rango 0 a 5")
        }
        
    }else{

        println("La nota1 no esta entre al rango 0 a 5")
    }


}