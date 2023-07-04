fun main() {
    var a: String? = "Kotlin Exam"

    println(a?.uppercase()) // null-safe operator로 null이면 뒤의 연산을 수행하지 않음

    println(a?:"default".uppercase()) // elvis operator로 null이면 바로 뒤에 있는 값으로 뒤의 연산을 수행함

//    println(a!!.uppercase()) // null-assertion operator로 null인 것을 알면서 런타임시 Null Pointer Exception이 나도록 하는 연산자임

    a?.run {
        println(uppercase())
        println(lowercase())
    } // a가 null일 시 전체가 실행되지 않음
}