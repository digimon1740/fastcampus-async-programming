package iteratorpattern


data class Car(val brand: String)

class CarIterable(val cars: List<Car> = listOf()) : Iterable<Car> {

    override fun iterator(): Iterator<Car> = CarIterator(cars)

}

class CarIterator(val cars: List<Car> = listOf(), var index: Int = 0) : Iterator<Car> {
    override fun hasNext(): Boolean {
        return cars.size > index
    }

    override fun next(): Car {
        return cars[index++]
    }

}

fun main() {
    val carIterable = CarIterable(listOf(Car("람보르기니"), Car("페라리")))

    val iterator = carIterable.iterator()

    while (iterator.hasNext()) {
        println("브랜드 : ${iterator.next()}")
    }

}