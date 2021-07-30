class Students( names:String, age:Int, birtDate:String, identity:Int,var
numOfClasses:Int):UtdFamily(names,age,birtDate,identity) {
    override fun toString(): String {
        return super.toString() + "/n Id of the student is $identity" +
                " and student is currently taking $numOfClasses classes"
    }

    fun fullTimeStudent():String{
        val creditHours:Int = numOfClasses*3
        return if(creditHours>12){
            "Full time student"
        } else{
            "Not full time student"
        }

    }

}