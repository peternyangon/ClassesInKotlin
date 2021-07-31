fun main() {
    println("welcome to labda cladd")

    val printMessage = {messege:String -> println(messege)}
    printMessage("hey there")

    val sum = {val1:Int,val2:Int ->
        val total=val1+val2
        total.toString()
    }
    println(sum(34,78))

    val product={ x:Int, y:Int->
        val product1=x+y
        product1.toString()
    }

   println(product(67,89))
}