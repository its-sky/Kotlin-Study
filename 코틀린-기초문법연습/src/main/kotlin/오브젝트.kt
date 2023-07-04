fun main() {
    println(Counter.count)

    Counter.countUp()
    Counter.countUp()

    println(Counter.count)

    Counter.clear()

    println(Counter.count)

    var a = FoodPoll("짜장")
    var b = FoodPoll("짬뽕")

    a.vote()
    a.vote()

    b.vote()
    b.vote()
    b.vote()

    println("${a.name} ${a.count}")
    println("${b.name} ${b.count}")
    println("${FoodPoll.total}")
}

object Counter {
    var count = 0

    fun countUp() {
        count++
    }

    fun clear() {
        count = 0
    }
} /*싱글톤 패턴을 언어적 차원에서 제공한다고 보면 된다.*/

class FoodPoll (val name:String) {
    companion object {
        var total = 0
    } /*static 멤버와 비슷한 기능이라고 생각하면 됨*/

    var count = 0

    fun vote() {
        total++
        count++
    }
}