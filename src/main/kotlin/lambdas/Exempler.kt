package lambdas

// Syntax
// int som parameter og retunerer int
val that : (Int) -> Int = { three -> three }

// int og string som parameter og retunerer int og string
val more : (String, Int) -> String = { str, int -> str + int }

// int som parameter og retunerer null
val noReturn : (Int) -> Unit = { num -> println(num) }

//ELM: lambdaFunction = \x y -> x + y

// simpel lambda
val square = { number: Int -> number * number }
val nine = square(3)

// Type Inference - Kotlin ved at den her lambda har typen (Int) -> String
val magnitude100String = { input : Int ->
    val magnitude = input * 100
    magnitude.toString()
}


fun main(args: Array<String>) {

    print(magnitude100String(nine))
}