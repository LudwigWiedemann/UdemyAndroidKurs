fun main(args: Array<String>){
    var myList = ArrayList<Double>(5)
    myList.add(1.0)
    myList.add(9.0)
    myList.add(8.0)
    myList.add(4.0)
    myList.add(7.0)
    var gesamt = 0.0
    for (i in myList){
        gesamt += i
    }
    println(gesamt / myList.size)
}