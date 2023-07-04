fun main() {
    var a = Person("박보영", 1990)
    var b = Person("신민철", 1999)
    var c = Person("레넥톤", 132)

    a.introduce()
    b.introduce()
    c.introduce()

    var d = Person("애니비아")
    var e = Person("카밀")
}

class Person (var name:String, val birthYear: Int) {
    init {
        println("${birthYear}년생 ${name}입니다.")
    }

    constructor(name:String) : this(name, 1997) {
        println("${birthYear}년생 ${name}입니다.")
    }

    /*기본 생성자가 먼저 처리되고 그 다음 보조 생성자가 처리됨*/

    fun introduce() {
        println ("안녕하세요, ${birthYear}년생 ${name}입니다!")
    }
}