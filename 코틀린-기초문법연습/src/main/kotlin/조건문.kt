fun main() {
    var a = 7

    if (a > 10) {
        println("a는 10보다 크다.")
    } else {
        println("a는 10보다 작거나 같다.")
    }

    if (a is Int) println("a는 Int형 입니다.")

    doWhen(1)
    doWhen("Hello")
    doWhen(13L)
    doWhen(false)
    doWhen("ABC")
    // 여기서 여러 개의 조건에 만족하여도 제일 먼저 부합된 조건이 실행됨

    var tmp = valueWhen(1)
    println(tmp)
}

fun doWhen (a: Any) {
    when (a) {
        1 -> println("정수 1입니다.")
        "Hello" -> println("문자열 Hello입니다.")
        is Long -> println("Long 타입입니다.")
        !is String -> println("String 타입이 아닙니다.")
        else -> println("어떤 조건도 만족하지 않습니다.")
    }
}

fun valueWhen (a: Any): String {
    var result = when (a) {
        1 -> "정수 1입니다"
        "Hello" -> "문자열 Hello입니다."
        is Long -> "Long 타입입니다."
        !is String -> "String 타입이 아닙니다."
        else -> "어떤 조건도 만족하지 않습니다."
    }

    return result
}