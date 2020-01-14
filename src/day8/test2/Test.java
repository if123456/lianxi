package day8.test2;

public class Test {
    public static void main(String[] args) {
        A a=new B();
        a.showA();
        ((B)a).showB();
        A c=new C();
        c.showA();
        ((C) c).showC();
        System.out.println(a.getClass());

        System.out.println(a instanceof B);
    }

}
