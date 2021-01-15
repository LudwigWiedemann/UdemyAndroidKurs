package com.example.klassen

fun main(){
    var meinHandy = Mobiltelefon("Android", "Honnor", "P20 Pro")
    var meinHandy2 = Mobiltelefon( marke ="Samsung", modell ="Galaxy")
    meinHandy.ladeBatterie(45)
    meinHandy2.ladeBatterie(23)
}

class Mobiltelefon(betriebssystem: String = "Android", marke: String, modell: String){
    var batterie = (Math.random()*51).toInt()
    init {
        println("Das Telefon $modell von $marke nutzt $betriebssystem als Betriebssystem")
    }
    fun ladeBatterie(geladenUm: Int){
        println("Vor dem Laden ist die Batterie zu $batterie % geladen")
        println("Wird um $geladenUm geladen")
        batterie += geladenUm
        println("Die Batterie ist nun zu $batterie % geladen")
    }
}