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
    /*
        type declaration
     */
    val sumB:(Int,Int)->Int={int,int1->int+int1}
    println(sumB(5,4))

    val that : (Int)-> Int = {three -> three}

    println(that(8))

    val more :(String,Int)->String={value1,value2->
        "value1 is $value1,value2 is $value2"
    }

    println(more("peter",27))

    val more1 :(Double,Double)->Double={value1,value2->
        value1*value2
    }

    println(more1(89.0,70.0))

    val more2: ()->Unit={ println("hey there how are you doing")}

    more2()

    /*
        lamdas as class extension
     */

    val another: String.(Int)->String={this + it}

    println(another("peter ",23))

    fun extendString(arg:String,num:Int):String{
        val another:String.(Int)->String={this + it}
        return arg.another(num)
    }

   println(extendString("welcome to america through gate ",2))



    val lambda1 ={
        println("hello world")
    }
    lambda1()

    val labda2 :(String)->Unit = {
        name:String -> println("my name is $name")
    }

    labda2("Peter")


    val student1:(firstName:String,secondName:String)->String={
        firstName, secondName ->  ("Student full name is $firstName $secondName")
    }

    println(student1("Peter","Nyangon"))


    val student2:(age:Int,name:String)->Int={
        age, name ->  age
    }

    println(student2(23,"peter"))



}