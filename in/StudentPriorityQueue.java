package again;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentPriorityQueue {

    public static void main(String[] args) {
        PriorityQueue<student> queue = new PriorityQueue<>(new Comparator<student>() {
            @Override
            public int compare(student o1, student o2) {
                return o1.grade - o2.grade  ;
            }
        });
          queue.offer(new student("Anivarya", 'A'));
         queue.offer(new student("Anu", 'C'));
         queue.offer(new student("Sahab", 'B'));
        queue.offer(new student("Saini", 'A'));
        System.out.printf("Queue is %s" , queue);
    }


   private static class student{

       private final String name;

       private final char grade;

       public student(String name, char grade) {
           this.name = name;
           this.grade = grade;
       }

       @Override
       public String toString() {
           return "student{" +
                   "name='" + name + '\'' +
                   ", grade=" + grade +
                   '}';
       }
   }

}
