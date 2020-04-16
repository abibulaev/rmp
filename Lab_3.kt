/*1*/
/*fun main(args:Array<String>){
    var x = 0
    val n = arrayOf<Int>(1, 2, 3, 4, 5)
    while (x < n.size){
        println("$x"+" "+ n[x])
        x++

    }
}*/

/*fun main(args: Array<String>) {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    for ((a, b) in numbers.withIndex()) {
        println(" $a равно $b")
    }}*/
/*
fun main(args: Array<String>) {
    val numbers = intArrayOf(1, 2, 3, 4, 5)
    for (a in numbers.indices) {
        println(" $a равно ${numbers[a]}")}}*/
/*2*/
/*fun main(args: Array<String>){
    var arr = emptyArray<String>()
    var i = 10
    while(i>0){
        arr += i.toString()
        i--
    }
    println(arr.size)
*/

/*3*/
/*fun main(args: Array<String>){
    var array = arrayOfNulls<String>(5)
    array.set(0, "a")
	array.set(1, "b")
    array.set(2, "c")
	array.set(3, "d")
    array.set(4, "e")
    println(array.get(0))
    println(array.get(4))
}*/

/*4*/
/*fun main(args: Array<String>){
   val myArray = Array(7, { i -> i * 2 })
    println(myArray[4])
    println(myArray[6]) 
}*/

/*5*/
/*fun main(args: Array<String>){
    val arr = arrayOf<Int>(1, 2, 3, 4, 5)
	arr.forEach {i -> println(i)}
}*/

/*6*/
/*fun main(args: Array<String>){
    val arr = arrayOf<Int>(1, 2, 3, 4, 5)
	arr.forEach {i -> println(i*(-1))}
}*/

/*7*//*
fun main(args: Array<String>){
    val num = setOf(1, 2, 3, 4, 5)
    val part = num.partition {
    	it % 2 == 0
	}	
    println(part)
}
*/
/*8*//*
fun main(args: Array<String>){
    val ihs = hashSetOf(7, 2, 3, 4, 5)
    
    ihs.add(6)
    println(ihs)
    
    println(ihs.contains(2))
    
    ihs.remove(3)
    println(ihs)
    
    println(ihs.indices)
    
    println(ihs.count())
    
    ihs.clear()
    println(ihs)
    
    println(ihs.isEmpty())
}*/

/*9*/

/*10*//*
fun main(args: Array<String>){
    val mp1 = mapOf("beverage" to 2.7, "meal" to 12.4)
    val mp2 = mp1.mapValues{it.value.toString() + "$"}
    println(mp2)
}*/

/*11*//*
fun main(args: Array<String>){
    val currenciesMutableMap:MutableMap<String, String> = mutableMapOf("Гривна" to "Украина", "Доллар" to "США", "Лира" to "Турция")
    println("Страны: ${currenciesMutableMap.values}")
    println("Валюты: ${currenciesMutableMap.keys}")
    
    println(currenciesMutableMap.containsKey("Гривна"))
    
    println(currenciesMutableMap.containsValue("Россия"))
    
    println(currenciesMutableMap.count())
}*/