fun main() {
    var a: Int = 1
    a = 2

    val b: Int = 2
//    b = 3 -> 상수이므로 불가능

    var c: Byte = 10
    var d: Short = 10
    var e: Int = 10
    var f: Long = 10L

    var g: Float = 3.14f
    var h: Double = 3.14

    var i: Boolean = true

    var j: Char = 'a'

    var k: Int? = null

    var l: String = "Hello"
    var ll: String = """
        여러개의 문자열은
        이런식으로 나타낼 수 있습니다.
    """.trimIndent()

    var m: Int = 0x134 // 16진수
    var n: Int = 0b1010 // 2진수
//    참고로 8진수는 코틀린에서 제공해주지 않는다.

//    위의 명시적 타입 선언은 생략이 가능하다.
}