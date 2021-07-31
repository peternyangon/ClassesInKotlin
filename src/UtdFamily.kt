open class UtdFamily (var names:String?,var age:Int?,var birtDate:String?,var identity:Int?){

    override fun toString(): String {
        return "Utd family member is $names, and is $age years old born in $birtDate"
    }

   open fun copy( family:UtdFamily){
        this.names=family.names
        this.birtDate=family.birtDate
        this.age=family.age
    }
}