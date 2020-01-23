package coroutines

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.runBlocking


suspend fun main() {
    GlobalScope.launch { //launch'er en ny coroutine og coroutines.main thread fortsætter
        printlnDelayed("World!")

    }

    println("Hello,")
    runBlocking {
    delay(2000L)
    }

}

suspend fun printlnDelayed(message: String) {
    delay(1000)
    println(message)
}