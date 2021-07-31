class Students( names:String="", age:Int=0, birtDate:String="", identity:Int=0,var
numOfClasses:Int?=0):UtdFamily(names,age,birtDate,identity) {
    override fun toString(): String {
        return super.toString() + "\n Id of the student is $identity" +
                " and student is currently taking $numOfClasses classes"
    }

    fun fullTimeStudent():String{
        val creditHours:Int? = numOfClasses
        if (creditHours != null) {
            return if(creditHours>12){
                "Full time student"
            } else{
                "Not full time student"
            }
        }
        else
            return "un initialize class"

    }

    fun copy(family: Students) {


        this.names=family.names
        this.age = family.age
        this.numOfClasses=family.numOfClasses
        this.identity=family.identity
        this.birtDate=family.birtDate
    }

}