fun main(){

    var promedio:Double
    print("Ingrese el nombre")
    var nombre = readLine()
    print("Ingrese la primera nota")
    var note1 = readLine()!!.toDouble()
    print("Ingrese la segunda nota")
    var note2 = readLine()!!.toDouble()
    print("Ingrese tercera nota nota")
    var note3 = readLine()!!.toDouble()

    promedio = (note1+note2+note3)/3

    if(promedio > 3.0){

        println("El estudiante $nombre gano la materia  con $promedio")
    }else{
        
        println("El estudiante $nombre perdio la materia con  $promedio")
    }


}
