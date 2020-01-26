fun main() {

    val student = Student()
    student.hasPassed(70)

}

class Student{

    fun hasPassed(marks : Int) : Boolean {
        return marks > 60
    }

}