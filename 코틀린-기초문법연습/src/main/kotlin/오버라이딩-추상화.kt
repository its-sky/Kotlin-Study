fun main() {
    var t = Tiger()
    t.eat()

    var e = Eagle()
    e.hunt()

    var l = Lion()
    l.eat()
}

open class Beast {
    open fun eat() {
        println("음식을 먹는다")
    }
}

class Tiger : Beast() {
    override fun eat() {
        println("고기를 먹습니다")
    }
}

/*자바와 다르게 상속이나 오버라이딩을 하려면 open을 해줘야 하고 자식 클래스에서는
override 키워드를 붙여야 함.*/

abstract class Bird {
    abstract fun hunt()

    fun sniff() {
        println("냄새를 맡는다")
    }
}

class Eagle : Bird() {
    override fun hunt() {
        println("사냥을 시작한다")
    }
}

interface Runner {
    fun run()
}

interface Eater {
    fun eat() {
        println("음식을 먹습니다")
    }
}

class Lion : Runner, Eater {
    override fun run() {
        println("달립니다")
    }

    override fun eat() {
        println("이 사자는 밥을 먹고 있습니다")
    }
}