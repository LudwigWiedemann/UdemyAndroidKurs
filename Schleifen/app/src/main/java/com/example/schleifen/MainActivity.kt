package com.example.schleifen

fun main() {
    for (number in 0..10000) {
        if (number == 9001) {
            println("Über 9000!!!")
        }
    }

    var feuchtigkeitsLevel = 80
    var feuchtigkeit = "feucht"
    while (feuchtigkeit == "feucht") {
        feuchtigkeitsLevel -= 5
        println("Feuchtigkeit nimmt ab")
        if (feuchtigkeitsLevel <= 60) {
            feuchtigkeit = "angenehm"
            println("Nun ist es angenehm")
        }
    }
}
//    for(number in 80 downTo 0 step 5){
//        if(feuchtigkeit == "feucht") {
//            feuchtigkeitsLevel -= 5
//            println("Feuchtigkeit nimmt ab")
//        }
//        if(feuchtigkeitsLevel <= 60){
//            feuchtigkeit = "angenehm"
//            println("Nun ist es angenehm")
//        }
//    }
//}

