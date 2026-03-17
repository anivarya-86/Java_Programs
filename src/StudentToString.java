import java.util.Scanner;

public class StudentToString {
   String name;

   int age;

   String rollNumber;

   String house;

    public StudentToString(int age, String house, String name, String rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.house = house;

    }

    @Override
    public String toString() {
        return "Student Details :{name: "+ name
                +", age: "+  age
                +" , roll number:"+ rollNumber
                +" , house:"+  house  +" }";
    }
    public static void main(String[] args) {
        StudentToString stu = new StudentToString(19 ,
                "Saini House",
                "Anivarya " ,"240619107017");
        System.out.println(stu);
    }
}

