fun main() {
    var a = Animal("하나", 5, "개")
    var b = Dog("하나", 5)

    a.introduce()
    b.introduce()

    b.bark()

    var c = Cat("둘", 7)
    c.meow()
}

open class Animal (var name:String, var age:Int, var type:String) {
    fun introduce() {
        println("${type}이고 나이는 ${age}인 ${name}입니다")
    }
}

class Dog (name:String, age:Int) : Animal (name, age, "개") {
    fun bark() {
        println("멍멍")
    }
}

class Cat (name:String, age:Int) : Animal (name, age, "고양이") {
    fun meow() {
        println("냐옹")
    }
}