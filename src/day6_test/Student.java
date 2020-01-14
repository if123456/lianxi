package day6_test;

public class Student {
    private String name;
    private int age;
    static int num;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return  name + ","+age ;
    }

    public static void run(){
        System.out.println("aa");
    }
}
