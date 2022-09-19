package com.lautaro.helloandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Lección 1
        //variablesYConstantes()

        //Lección 2
        //tiposDeDatos()

        //Lección 3
        //sentenciaIf()

        //Lección 4
        //sentenciaWhen()

        //Lección 5
        //arrays()

        //Lección 6
        //maps()

        //Lección 7
        //loops()

        //Lección 8
        //nullSafety()

        //Lección 9
        //funciones()

        //Lección 10
        clases()

    }

    private fun variablesYConstantes(){

        // Variables

        var myFirstVariable = "Hello Hackerman"
        var myFirstNumber = 1

        println(myFirstVariable)

        myFirstVariable = "Bienvenidos"

        println(myFirstVariable)

        var mySecondVariable = "Suscribete"

        println(mySecondVariable)

        mySecondVariable = myFirstVariable

        println(mySecondVariable)

        //Constantes

        val myFirstConstant = "Te ah gustado el tutorial?"

    }

    /*
    Aca van los tipos de datos
     */
    private fun tiposDeDatos(){

        // String

        val myString = "Hola Hackerman"
        val myString2 = "Bienvenidos"
        val myString3 = myString + " " +myString2

        println(myString3)

        // Enteros (Byte, Short, Int, Long)
        // Decimales (Float, Double)

        val myDouble = 1.5
        val myFloat = 1.5f

        // Boolean (Bool)

        val myBool = true
        val myBool2 = false

        println(myBool == myBool2) //myBool es igual a myBool2? devuelve verdadero o falso

    }

    private fun sentenciaIf(){

        // Operadores logicos
        // && operador "Y"
        // || operador "O"
        // ! operador "NO"

    }

    private fun sentenciaWhen(){

        //When con String
        val country = "Argentina"

        when (country){

            "Argentina", "Mexico", "Perú", "Colombia", "España" -> {
                println("El idioma es Español")
            }
            "EEUU" -> {
                println("El idioma es Inglés")
            }
            "Francia" -> {
                println("El idioma es Frances")
            }else -> {
            println("No conocemos el idioma")
        }
        }

        //When con Int
        val age = 10

        when (age){
            0, 1, 2 ->{
                println("Eres un bebé")
            } in 3..10 -> {
            println("Eres un niño")
        } in 11..17 -> {
            println("Eres un adolecente")
        } in 18..69 -> {
            println("Eres un adulto")
        } in 79..99 -> {
            println("Eres un anciano")
        } else -> {
            println("valor incorrecto")
        }
        }

    }

    fun arrays(){

        val name = "Brais"
        val surname = "Moure"
        val company = "CPC"
        val age = "32"

        //creación de un Array

        val  myArray : ArrayList<String> = arrayListOf()

        //Añadir datos de uno en uno

        myArray.add(name)
        myArray.add(surname)
        myArray.add(company)
        myArray.add(age)

        println(myArray)

        // Añadir conjunto de datos

        myArray.addAll(listOf("Hola", "Bienvenidos al tutorial"))

        println(myArray)

        //Acceso a datos

        val myCompany = myArray[2]

        println(myCompany)

        //Modificación de datos

        myArray[5] = "Suscribete"

        println(myArray)

        //Eliminar datos

        myArray.removeAt(4)

        println(myArray)

        //Recorrer datos

        myArray.forEach{
            println(it)
        }

        //Otras operaciones

        myArray.count() //me dice cuantos elementos hay en el array

        myArray.clear() //vacia el array

        myArray.first() //llama al primer elemento
        myArray.last() //llama al ultimo elemento

        myArray.sort() //para ordenar (hay mas que solo ese)

    }


    /*
    Aca hablamos de mapas, también llamados diccionarios
     */
    fun maps(){

        //Sintaxis
        var myMap: Map <String, Int> = mapOf()
        println(myMap)

        // Añadir elementos (destruye los elementos que ya estaban y carga los nuevos)
        myMap = mutableMapOf("Brais" to 1, "Pedro" to 2, "Sara" to 5)

        //Añadir un solo valor
        myMap["Ana"] = 7
        myMap.put("Maria",8)
        println(myMap)

        //actualización de un dato

        myMap.put("Brais", 3)
        myMap["Brais"] = 4
        println(myMap)

        myMap.put("Marcos", 3)

        //Acceso a un dato
        println(myMap["Brais"])

        //Eliminar dato
        myMap.remove("Brais")

    }

    private fun loops(){

        // Bucles
        val myArray = listOf("Hola", "Bienvenidos al tutorial")
        val myMap = mutableMapOf("Brais" to 1, "Pedro" to 2, "Sara" to 5)

        // For
        for (myString in myArray){
            println(myString)
        }

        for (myElement in myMap){
            println("${myElement.key}-${myElement.value}")
        }

        for (x in 0..10){
            println(x)
        }

        for (x in 0 until 10){ //detecta el rango sin tomar en cuenta el ultimo numero
            println(x)
        }

        for (x in 0..10 step 2){ //para cambiar el valor del incremento
            println(x)
        }

        for (x in 10 downTo 0 step 3){
            println(x)
        }

        val myNumericArray = (0..20)

        // While

        var x = 0

        while (x < 10){

            println(x)
            x++ //x += incremento   (para incrementar el valor que querramos)

        }

    }

    /*
     Aqui vamos a hablar de seguridad contra nulos (Null Safety)
    */

    fun nullSafety(){

        var myString = "MoureDev"
        //myString = null da error
        println(myString)


        //Variable null safety
        var mySafetyString:String? = "MoureDev null safety"
        mySafetyString = null
        println(mySafetyString)

        mySafetyString = "Suscribete"
        //println(mySafetyString)

       /* if( mySafetyString != null ){
           println(mySafetyString) //Obliga a que la variable no sea null con !!
        } else {
            println(mySafetyString)
        }*/

        //Safe call

        println(mySafetyString?.length) //en el caso que la variable sea null, no intenta ejecutar

        mySafetyString?.let {
            println(it)
        }?: run { this@MainActivity

            println(mySafetyString)

        }

    }


    /*
    Aquí vamos a hablar de funciones
    */
    fun funciones(){

        sayHello()
        sayHello()
        sayHello()

        sayMyName("Brais")
        sayMyName("Pedro")
        sayMyName("Sara")

        sayMyNameAndAge("Lautaro", 21)

        val sumResult = sumTwoNumbers(10 , 5)
        println(sumResult)

        println(sumTwoNumbers(15,9))

        println(sumTwoNumbers(10,sumTwoNumbers(5,5)))
    }

    //Función simple
    fun sayHello(){
        println("Hola")
    }

    //Funciones con parametros de entrada
    fun sayMyName(name:String){
        println("Hola, mi nombre es $name")
    }

    fun sayMyNameAndAge(name:String, age:Int){
        println("Hola, mi nombre es $name y mi edad es $age")
    }

    //Funciones con un valor de retorno
    fun sumTwoNumbers(firstNumber:Int, seconNumber:Int) : Int{

        val sum = firstNumber + seconNumber

        return sum

    }

    /*
    Aquí vamos a hablar de las clases

     */
    fun clases(){

        val brais = Programmer("Brais", 32, arrayOf(Programmer.Language.KOTLIN, Programmer.Language.SWIFT))
        println(brais.name)

        brais.age = 40
        brais.code()

        val sara = Programmer("Sara", 35, arrayOf(Programmer.Language.JAVA), arrayOf(brais))
        brais.code()

        println("${sara.friends?.first()?.name} es amigo de ${sara.name}")

    }
}