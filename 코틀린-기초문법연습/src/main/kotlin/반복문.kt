fun main() {
    var a = 0

    while (a < 5)
        println(a++)

    a = 0

    do {
        println(a++)
    } while (a < 5)

    for (i in 9 downTo 0 step 3)
        print(i)

    for (i in 'a'..'e')
        print(i)
}