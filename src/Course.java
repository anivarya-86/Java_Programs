public class Course {
    static int maxCapacity = 100;

    String courseName;

    int enrollment;
    Course(String courseName){
        this.courseName = courseName;
        this.enrollment = 0;
        this.enrolledStudent= new String[maxCapacity];

    }
    String[] enrolledStudent = new String[maxCapacity];

    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity = maxCapacity;

    }

    void enrolledStudents(String studentName ){
        enrolledStudent[enrollment] = studentName;
        enrollment ++;

    }
    void unrolledStudents( String studentsName){
        System.out.println("Student removed" + studentsName);
        enrollment--;
    }
}
 public void main(String[] args) {
    Course student = new Course("Computer Science");
    student.enrolledStudents("Shiv , Deva");
    student.unrolledStudents("Deva");


 }