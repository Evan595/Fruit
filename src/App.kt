fun main() {
//    var x = 3
//    val name = "Evan"
//    x = x * 10
//    println("x is $x")
//
//    println("x before the while loop is: $x")
//    while (x > 20) {
//        x = x - 1
//        println("$x-")
//    }
//    println("x AFTER the while loop is:$x")
//
//    for (i in 1..10) {
//        x = x + 1
//        print("$x+")
//    }
//    println("x AFTER the FOR loop is: $x")
//
//    if (x == 20) {
//        println("x must be twenty")
//    } else {
//        println("x isn't twenty")
//    }
//
//    var y = 9
//    if (x < y) {
//        println("x is SMALL")
//    } else if (x > y) {
//        println("x is Large")
//    }
//
//    x = 3
//    y = 1


    var x = 0
    var y: Int
    val fruit = arrayOf("Apple", "Banana", "Cherry", "Blueberry", "Pomegranate")
    val index = arrayOf(1, 3, 4, 2)


    while (x < 4) {

        y = index[x]
        println("Fruit = ${fruit[y]}")
        x = x + 1
    }
}