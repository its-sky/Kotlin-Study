fun main() {
    var test1 = "Test.Kotlin.String"

    println(test1.length)

    println(test1.uppercase())

    println(test1.lowercase())

    var test2 = test1.split(".")
    println(test2)

    println(test2.joinToString())
    println(test2.joinToString("."))

    println(test1.substring(5..10))

    var nullString: String? = null
    var emptyString = ""
    var blankString = " \t\r\n"
    var normalString = "a"

    println(nullString.isNullOrEmpty())
    println(emptyString.isNullOrEmpty())
    println(blankString.isNullOrEmpty())
    println(normalString.isNullOrEmpty())

    println(nullString.isNullOrBlank())
    println(emptyString.isNullOrBlank())
    println(blankString.isNullOrBlank())
    println(normalString.isNullOrBlank())

    var test3 = "kotlin.kt"
    var test4 = "java.java"

    println(test3.startsWith("java"))
    println(test4.startsWith("java"))

    println(test3.endsWith(".kt"))
    println(test4.endsWith(".kt"))

    println(test3.contains("lin"))
    println(test4.contains("lin"))
}