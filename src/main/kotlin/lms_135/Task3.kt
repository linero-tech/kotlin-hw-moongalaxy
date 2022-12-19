package lms_135

class Student(val grades: MutableList<Double>) {

    fun gpa(): Double {
        val totalGrade = grades.sum()
        val grade = grades.size
        return totalGrade / grade
    }

    fun bonus() {
        grades.forEachIndexed{index, grade ->
            grades[index] = grade + 1
        }
    }

    fun lowest() = grades.minOrNull()

    fun highest() = grades.maxOrNull()

}