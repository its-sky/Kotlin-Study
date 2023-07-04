fun main() {

    var price = 5000

    var a = Book("코틀린", 10000).apply {
        name = "[초특가]" + name
        discount()
    }

    a.run {
        println("상품명: ${name}, 가격: ${price}원")
    }
    /*run 함수가 인스턴스 내의 price 필드보다 main의 price 변수를 우선해서
    5000으로 되게 됨. 해결 방법으로 apply->also, run->let으로 사용하여
    it을 파라미터처럼 사용하면 됨*/

    var n = with(a) {
        println("상품명: ${name}, 가격: ${price}원")
        name
    }
    println("이름은 ${n}입니다")

    a.also {
        println("상품명: ${it.name}, 가격: ${it.price}원")
    }

    a.let {
        println("상품명: ${it.name}, 가격: ${it.price}원")
    }
}

class Book(var name:String, var price: Int) {
    fun discount() {
        price -= 2000
    }
}