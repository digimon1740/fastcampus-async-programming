package thread

fun main() {
    for (i in 0..5) {
        val thread = Thread(Runnable {
            println("current-thread-name : ${Thread.currentThread().name}")
        })
        thread.start()
    }
    println("current-thread-name : ${Thread.currentThread().name}")
}
