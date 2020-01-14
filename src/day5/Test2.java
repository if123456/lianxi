package day5;

import java.util.ArrayList;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        Scanner input = new Scanner(System.in);
//       String s=input.next();
//       int a=input.nextInt();
        Student s1 = new Student("明", 10);
        Student s2 = new Student("ning", 10);
//        Student s3=new Student(s,a);
        students.add(s1);
        students.add(s2);
//        students.add(s3);

        for (int i = 0; i < 3; i++) {
            String s=input.next();
            int a=input.nextInt();
        }


        for (int i = 0; i < students.size(); i++) {
            Student student = students.get(i);
//            System.out.println(students.get(i).getAge()+students.get(i).getName());
            System.out.println(student.getName() + "," + student.getAge());
        }
    }
}
