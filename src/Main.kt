//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    // Arithmetic operators (+, -, *, /, %)
    var a = 10
    var b = 20

    var ans1 = a + b
    var ans2 = a - b
    var ans3 = a * b
    var ans4 = b / a
    var ans5 = a % b

    println(ans1)
    println(ans2)
    println(ans3)
    println(ans4)
    println(ans5)
    // Comparison operators (==, !=, <, >, <=, >=)
    var isCompare = a < b
    var isCompare1 = a > b
    var isCompare2 = a == b
    var isCompare3 = a != b
    var isCompare4 = a <= b
    var isCompare5 = a >= b

    println(isCompare)
    println(isCompare1)
    println(isCompare2)
    println(isCompare3)
    println(isCompare4)
    println(isCompare5)
    // Assignment operators (+=, -=, *=, /=, &=)
    var ourAnswer = 2
        ourAnswer = ourAnswer + 1
        ourAnswer *= 4

    println(ourAnswer)
    // increment and decrement (++, --)
    ourAnswer --
    println(ourAnswer)
}