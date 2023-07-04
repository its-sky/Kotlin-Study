fun main() {
    var a: Int = 1
    var b: Long = a.toLong()

    /*코틀린에서는 묵시적 형변환을 허용하지 않는다.
    * 그래서 다음과 같은 메소드를 제공한다.
    * toByte(), toShort(), toInt(), toLong()
    * toFloat(), toDouble(), toChar() */

    var intArr = arrayOf(1, 2, 3, 4, 5)
    var nullableArr = arrayOfNulls<Int>(5)

    intArr[2] = 2
    nullableArr[3] = 3

    println(add(3, 4, 5))
}

/*
fun add(a: Int, b: Int, c: Int): Int {
    return a + b + c
}
아래와 같이 코드를 줄일 수도 있다.
*/

fun add(a: Int, b: Int, c: Int) = a + b + c
