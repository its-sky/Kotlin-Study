fun main() {
    b(::a)

    /*var c: (String)->Unit = { str -> println("$str 람다함수") }
    아래와 같이 축약 가능*/
    var c = {str: String -> println("$str 람다함수")}
    b(c)
}

fun a (str: String) {
    println("$str 함수 a")
}

fun b (function: (String)->Unit) {
    function("b가 호출한")
}