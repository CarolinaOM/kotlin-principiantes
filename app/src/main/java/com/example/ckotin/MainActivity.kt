package com.example.kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // parte 1
        //variablesYConstantes()

        // parte 2
        //tiposDeDatos()

        // parte 3
        //sentenciasIf()

        // parte 4
        //sentenciasWhen()

        // parte 5
        //arrays()

        // parte 6
        //maps()

        // parte 7
        //loops()

        // parte 8
        //nullSafety()

        // parte 9
        //funciones()

        // parte 10
        clases()
    }

    /*
    Variables y constantes
    */
    private fun variablesYConstantes(){

        // Variables

        var myFirstVariable = "Hello Word"
        var myFirstNumber = 1

        println(myFirstVariable)

        myFirstVariable = "Bienvenidos"

        println(myFirstVariable)

        // No se puede asigar un tipo INT a una variable STRING
        //myFirstVariable = 1

        var mySecondVariable = "Aqui estamos"

        println(mySecondVariable)

        mySecondVariable = myFirstVariable

        println(mySecondVariable)

        myFirstVariable = "Seguimios aqui"

        println(myFirstVariable)
        // Constantes

        val myFirstConst = "hola de nuevo"

        println(myFirstConst)

        // Una constante no puede modificar su valor
        //myFirstConst = "Sigues aqui, que bien"

        val mySecondConst = myFirstVariable

        println(mySecondConst)
    }

    // Aqui estan los tipos de datos
    private fun tiposDeDatos(){

        // String

        val myString: String = "Holis!"
        val myString2 = "Holis de nuevo"
        val myString3: String = myString + " " + myString2
        println(myString3)

        // Enteros (Byte, Short, Int, Long)

        val myInt: Int = 1
        val myInt2 = 2
        val myInt3:Int = myInt + myInt2
        println(myInt3)

        // Decimales (Float, Double)

        val myFloat: Float = 1.5f
        val myDouble = 1.5
        val myDouble2 = 2.6
        val myDouble3 = 1 // En realidad este es un INT
        val myDouble4: Double = myDouble + myDouble2 + myDouble3
        println(myDouble4)

        // Boolean (Bool)
        val myBool: Boolean = true
        val myBool2 = false
        //val myBool3 = myBool + myBool2
        println(myBool == myBool2)
        println(myBool && myBool2)
    }

    //Aqui tenemos las sentencias if
    private fun sentenciasIf(){
        val myNumber = 71
        // Operadores condicionales
        // > mayor que
        // < menor que
        // >= mayor o igual que
        // <= menor o igual que
        // == igualdad
        // != desigual

        // Operadores logicos
        // && operador y
        // || operador o
        // ! operador no

        if (!(myNumber <= 10 && myNumber > 5) || myNumber == 53) {
            println("$myNumber es menor o igual que 10 y menor que 5 o es igual a 53")
        }else if(myNumber ==60){
            // Sentenscia else if
            println("$myNumber es igual a 60")
        }else if(myNumber !=70){
            // Sentenscia else if
            println("$myNumber no es igual a 70")
        }else {
            // Sentencia else
            println("$myNumber es mejor que 10 o menor igual que 5 no es igual a 53")
        }

    }
    // Aqui esta la sentencias when
    fun sentenciasWhen(){
        // when con string
        val country = "Colombia"

        when(country){
            "España", "Peru", "Colombia", "Argentina" -> {
                println("El idioma es Español")
            } "EEUU" -> {
            println("El idioma es Ingles")
        } "Frnacia" -> {
            println("El idioma es Frances")
        } else -> {
            println("No conocemos el idioma")
        }
        }

        // When con INT
        val age = 100

        when (age){
            0, 1, 2 -> {
                println("Eres un bebe")
            } in 3..10 -> {
            println("Eres un niño")
        } in 11..17 -> {
            println("Eres un adolescente")
        } in 18..69 -> {
            println("Eres un adulto")
        } in 70..99 -> {
            println("Eres un viejo")
        } else -> {
            println(":)")
        }
        }
    }
    // Aqui estan los arrays o arreglos
    fun arrays(){

        val name = "Caro"
        val surname = "Isa"
        val company = "Carito"
        val age = "30"

        // Creacion de un array
        val myArray = arrayListOf<String>()

        // Añadir datos de uno en uno

        myArray.add(name)
        myArray.add(surname)
        myArray.add(company)
        myArray.add(age)

        println(myArray)

        // Añadir un conjunto de datos

        myArray.addAll(listOf("Hola", "Bienvenido"))
        println(myArray)

        // Acceso a datos
        val myCompany: String = myArray[2]
        println(myCompany)

        // Modificar datos
        myArray[5] = "ven"
        println(myArray)

        // Eliminar datos
        myArray.removeAt( 4)
        println(myArray)

        // Recorrer datos

        myArray.forEach {
            println(it)
        }

        // Otras operaciones

        println(myArray.count())
        myArray.clear()
        println(myArray.count())

        myArray.first()
        myArray.last()

        myArray.sort()
    }

    // Aqui se va a hacer los maps, tambien llamados diccionarios
    fun maps(){

        // Sintesis
        var myMap: Map<String,Int> = mapOf()
        println(myMap)

        // Añadir valores
        myMap = mutableMapOf("Brais" to 1, "Pedro" to 2, "Sara" to 5)
        println(myMap)

        // Añadir un solo valor
        myMap["Ana"] = 7
        myMap.put("Maria",8)
        println(myMap)

        // Actualizacion de un dato
        myMap.put("Brais",3)
        myMap["Brais"] = 4
        println(myMap)

        myMap.put("Marcos",3)
        println(myMap)

        // Acceso a un dato
        println(myMap["Brais"])

        // Eliminar un dato
        myMap.remove("Brais")
        println(myMap)
    }

    // Aqui se va a tener los loops, tambien llamados bucles
    private fun loops(){

        // Bucles
        val myArray: List<String> =  listOf("Hola", "Bienvenidos", "Hola de nuevo")
        val myMap: MutableMap<String,Int> = mutableMapOf("Brais" to 1, "Pedro" to 2, "Sara" to 5)

        // For
        for (myString in myArray){
            println(myString)
        }
        for (myElement: MutableMap.MutableEntry<String,Int> in myMap){
            println("${myElement.key}-${myElement.value}")
        }
        for (x: Int in 0..10){
            println(x)
        }
        for (x: Int in 9 until 30){
            println(x)
        }
        for (x: Int in 0..10 step 2){
            println(x)
        }
        for (x: Int in 10 downTo 0 step 3){
            println(x)
        }
        val myNumericArray: IntRange = (0..20)
        for (myNum: Int in myNumericArray){
            println(myNum)
        }

        // While
        var x = 0

        while(x < 10) {
            println(x)
            x += 2
        }
    }

    // Aqui estan la seguridad contra nuelos (Null Safety)
    fun  nullSafety() {
        var myString = "Carito"
        //myString = null    Esto dara error de compilacion
        println(myString)

        // Variable null safety
        var mySafetyString: String? = "Hola null safety"
        mySafetyString = null
        println(mySafetyString)

        mySafetyString = "Ven aqui"
        //println(mySafetyString)

        /*if(mySafetyString != null){
            println(mySafetyString!!)
        }else {
            println(mySafetyString)
        }*/

        // Safe call
        println(mySafetyString?.length)

        mySafetyString?.let {
            println(it)
        }?: run{
            println(mySafetyString)
        }

    }

    // Aqui estan las funciones
    fun funciones(){
        sayHello()
        sayHello()
        sayHello()

        sayMyName("Caro")
        sayMyName("Pedro")
        sayMyName("Sara")

        sayMyNameAndAge("Caro", 30)

        val sumResult: Int = sumTwoNumbers(10, 5)
        println(sumResult)

        println(sumTwoNumbers(15, 9))

        println(sumTwoNumbers(10, sumTwoNumbers(5, 5)))
    }
    // Funcion Simple
    fun sayHello(){
        println("Hola")
    }

    // Funciones con parametro de entrada
    fun sayMyName(name: String){
        println("Hola, mi nombre es $name")
    }

    // Funciones con parametro de entrada
    fun sayMyNameAndAge(name: String, age: Int){
        println("Hola, mi nombre es $name y mi edad es $age")
    }

    // Funciones con valor de retorno
    fun sumTwoNumbers(firsNumber: Int, secondNumber: Int) :Int {
        val sum = firsNumber + secondNumber
        return sum
    }

    //Aqui estan las clases
    fun clases(){

        val caro = Programmer( "Caro", 30, arrayOf(Programmer.Language.KOTLIN, Programmer.Language.PHP))
        println(caro.name)

        caro.age = 40
        caro.code()

        val sara = Programmer("Sara", 35, arrayOf(Programmer.Language.JAVA), arrayOf(caro))
        sara.code()

        println("${sara.friends?.first()?.name} es amigo de ${sara.name}")
    }
}