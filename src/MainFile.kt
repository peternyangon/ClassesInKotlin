fun main() {
    var student1 : UtdFamily
    student1=Students("Peter Nyangon",34,"07/27/1986",1234567,5)

    println(student1.fullTimeStudent())

    println(student1.toString())

    var student2=Students()
    student2.copy(student1)

    student2.age=33
    println(student2)
   // student2.copy(student1)

    println(student1.age)
}