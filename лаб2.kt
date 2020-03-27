/*1*/
fun main(args: Array<String>) {
    val language = if (args.size == 0) "EN" else args[0]
    println(when (language) {
        "EN" -> "Hello!"
        "FR" -> "Salut!"
        "IT" -> "Ciao!"
        else -> "Sorry, I can't greet you in $language yet"
    })
}
/*2*/
fun main(args: Array<String>) {
    val a1 = 3
    val a2 = 3L
    val a3 = 3f
    val a4 = 3.0
    val a5 = "Unknown"
    val a6 = "3"
    val a7 = "Long"
    val a8 = '3'
    println(a1::class)
    println(a2::class)
    println(a3::class)
    println(a4::class)
    println(a5::class)
    println(a6::class)
    println(a7::class)
    println(a8::class)
}
/*3*/
fun main(args: Array<String>) {
    val a1 = 3
    val a2 = 3L
    val a3 = 3f
    val a4 = 3.0
    val a5 = "Unknown"
    val a6 = "3"
    val a7 = "Long"
    val a8 = '3'
    println(describe(a1))                     
    println(describe(a2))
    println(describe(a3))
    println(describe(a4))
    println(describe(a5))
    println(describe(a6))
    println(describe(a7))
    println(describe(a8))

}
fun describe(obj: Any): String =
    when (obj) {
        1          -> "One"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
}
/*4*/
fun main(args: Array<String>) {
    val a1 = 3
    val a2 = 3L
    val a3 = 3f
    val a4 = 3.0
    val a5 = "Unknown"
    val a6 = "3"
    val a7 = "Long"
    val a8 = '3'
    println(describe(-7))
    println(describe(6L))
    println(describe(5.0))
    println(describe("wferfsdfdfsdfykul"))
    println(describe(4))
    println(describe("Hello"))
    println(describe(2))

}

fun describe(obj: Any): String =
    when (obj) {
        1          -> "One"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
}

/*5*/
class EventManager {
    companion object FirebaseManager {
    } }
fun declaration(obj: Any): String
{
    var a = when (obj) {
        1          -> "One"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
    }
    return a
}
/*7*/
fun main(args: Array<String>) {
    val x = 10
    val y = 9
    if (x in 1..y+1) {
        println("fits in range")
    } else {
        println("out of range")
    } }
fun main(args: Array<String>) {
    val x = 10 /// out of range
    val y = 9
    if (x in 1..y-1) {
        println("fits in range")
    } else {
        println("out of range")
    }
}

/*8*/
fun main(args: Array<String>) {

    test(5)
    test(11)
    test(25)
    test(15)
}
fun test(x: Any)
{
    val validNumbers = arrayOf(1,11,111,1111)
    when (x) {
        in 1..10 -> println("x is in the range")
        in validNumbers -> println("x is valid")
        !in 10..20 -> println("x is outside the range")
        else -> println("none of the above")
    }
}
/*9*/
fun main(args: Array<String>) {
    var items = arrayOf("orange","apple")
    when {
        "orange" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
}
/*10*/
fun main(args: Array<String>) {
    println(hasPrefix("prefixhsdajkl"))
}
fun hasPrefix(x: Any) = when(x) {
    is String -> x.startsWith("pref")
    else -> false
}
