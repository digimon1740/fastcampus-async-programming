package thread

import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors

fun main() {
    val pool: ExecutorService = Executors.newFixedThreadPool(5)
    try {
        for (i in 0..5) {
            pool.execute {
                println("current-thread-name : ${Thread.currentThread().name}")
            }
        }
    } catch (e: Exception) {
        pool.shutdown()
    }
    println("current-thread-name : ${Thread.currentThread().name}")
}
