fun main() {

    for (i in 1..10) {
        if (i % 3 == 0) continue
        println(i)
    }

    loop@for (i in 1..10) {
        for (j in 1..10) {
            if (i == 3 && j == 4) break@loop
            println("i : $i, j : $j")
        }
    }
    /*기존의 언어들에서는 중첩반복문 내에서 탈출하려면 내부 반복문을 탈출한 이후에도
    조건을 한번 더 확인해주어야 했었는데 여기서는 label 기능을 통해 특정 조건이
    성립되면 중첩 반복문 모두를 탈출할 수 있다.*/

    var a = 6
    var b = 4

    println(a > 5 && b > 5)
}