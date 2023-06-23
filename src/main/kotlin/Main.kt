fun main() {
    val dog: Animal = Animal("Barby")
    println(dog.Name)
    dog.bark()
}

fun isEven(x: Int): Boolean {
    return x % 2 == 0
}
fun Int.isOdd(): Boolean {
    return this % 2 == 1
}
fun print10nums() {
    for(i in 1..10) {
        println(i)
    }
}