public class StudentTest {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        student s = new student();
        s.name = "John";
        s.age = 23;
        s.faculty = "Applied Informatics";
        s.student_number = 230396;
        s.semester_number = 3;
        s.average_grade = 3.5;
        if (s.validation == false) {
            System.out.println("The student card is invalid");
        } else {
            System.out.println("The student card is invalid");
        }
        System.out.println("Name:" + s.name);
        System.out.println("Age:" + s.age);
        System.out.println("Faculty:"+s.faculty);
        System.out.println("Student ID is:" +s.student_number);
        System.out.println("Student number:"+s.student_number);
        System.out.println("Semester number:"+s.semester_number);
        System.out.println("Average grade:"+s.average_grade);
    }
}
