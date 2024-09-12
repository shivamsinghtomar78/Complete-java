package Challenge;

public class Course {
    static int maxCapacity=100;
    String courseName;
    int enrollments;
    Course(String courseName){
        this.courseName=courseName;
        this.enrollments=0;
       this.enrolledStudents=  new String[maxCapacity];

    }
    String[] enrolledStudents;
    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity=maxCapacity;

    }
    void enrolledStudent(String studentName){
        enrolledStudents[enrollments]=studentName;
        enrollments++;
    }
    void unEnrolledStudent(String studentName){
        System.out.println("Student removed");
        enrollments--;
    }


}
