  package com.example.myapplication

//fun printIt() {
//    println("Hello")
//}

fun main() {
//    printIt()
//    val name = "Ludwig"
//    print("Hallo $name")
//    var myAge = 19;
//    print(myAge)

//    var result = 5 + 3
//      val a = 5
//      val b = 3
//    var resultDouble: Double
//    resultDouble = a / b
//    print(resultDouble)

//    var isEqual = a != b
//    var isNotEqual = 5 != 5
//    println("isEqual ist $isEqual")
//    println("isEqual ist $isNotEqual")
//    println("$a is groesser $b is ${a > b}")

//    var myNumber = 4
//    myNumber += 3
//    println(myNumber)
//    myNumber -= 3
//    println(myNumber)
//    myNumber *= 3
//    println(myNumber)
//    myNumber ++
//    println(myNumber)
//    myNumber %= 2
//    println(myNumber)

//      println(myNumber)
//      println(myNumber++)
//      println(++myNumber)

//    var season = 5
//    when(season){
//        1-> println("Frühling")
//        2-> println("Sommer")
//        3-> println("Herbst")
//        4-> println("Winter")
//        else -> println("Ungültig")
//    }
//
//    var month = 7
//    when(month){
//        1,2,3-> println("Frühling")
//        4,5,6-> println("Sommer")
//        in 7..9-> println("Herbst")
//        in 10..12-> println("Winter")
//        else -> println("Ungültig")
//    }

//    var age = 18
//    when (age) {
//        in 0..15 -> println("du darfst garnichts")
//        16 -> println("du darfst anfangen")
//        17 -> println("du darfst begleitet")
//        else  -> println("du darfst alles")
//    }

//    var x: Any = 140
//    when (x) {
//        is Int -> println("int")
//        is Double -> println("Double")
//        is String -> println("String")
//        else -> println("lappen")
//    }

//    var x = 1
//    while (x<=10)
//        println("${++x}")
//     var y = 1
//    while (y<=10)
//        println("${y++}")
//     var z = 1
//    do
//        println("${++z}")
//    while (z<=10)
//     var v = 1
//    do
//        println("${v++}")
//    while (v<=10)

//    for (num in 1..10)
//        println("$num")
//    for (num in 1 until 10)
//        println("$num")
//    for (i in 10 downTo 0 step 2)
//        print("$i")

//    for (num in 0..10000) {
//        if (num > 9000) {
//            println(" $num ist Über 9000")
//        }
//        println(num)
//    }
//
//    var feuchtigkeitsLvl = 80
//    var feuchtigkeit = "feucht"
//
//    while (feuchtigkeit == "feucht") {
//        feuchtigkeitsLvl -= 5
//        println("feuchtigkeit nimmt ab")
//        if(feuchtigkeitsLvl < 60){
//            println("Nun ist es angenehm")
//            feuchtigkeit = "angenehm"
//        }
//    }

//    var name: String = "Lol"
//    name = null => fehler weil String nicht null sein kann

//    var nameNull: String? = "lol"
//    nameNull = null
//
//    var len = name.length
//    var len2 = nameNull.length => fehler weil könnte null sein
//    if(nameNull != null) {
//        var len2 = nameNull.length
//    } sehr lang also:

//    var len2 = nameNull?.length


//    var nullName: String? = null
//    println(nullName?.toLowerCase())
//    nullName?.let {println(it.length)}
//    var newName = nullName ?: "Gast"
//    println(newName)

    var nullAge: Int? = 21
    var age:Int = nullAge!!
    println(age)

}
