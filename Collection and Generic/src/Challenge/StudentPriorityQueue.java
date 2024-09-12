package Challenge;

import java.util.Comparator;
import java.util.PriorityQueue;

class StudentPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Student> pq=new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGrade()-o2.getGrade();
            }
        });
        pq.add(new Student("Prashant",'B'));
        pq.add(new Student("Sanchit",'A'));
        pq.add(new Student("Ram",'A'));
        pq.add(new Student("Mohan",'B'));
        pq.add(new Student("Shyam",'D'));
        pq.add(new Student("Karan",'E'));
        System.out.printf("Got %s\n",pq.poll());
        System.out.printf("Got %s\n",pq.poll());
        System.out.printf("Got %s\n",pq.poll());
        System.out.printf("Got %s\n",pq.poll());
        System.out.printf("Got %s\n",pq.poll());
        System.out.printf("Got %s\n",pq.poll());
    }
   private static class Student{
       private final   String name;
       private final char grade;

       public Student(String name, char grade) {
           this.name = name;
           this.grade = grade;
       }

       public String getName() {
           return name;
       }

       public char getGrade() {
           return grade;
       }

       @Override
       public String toString() {
           return name+": "+grade;
       }
   }

}
