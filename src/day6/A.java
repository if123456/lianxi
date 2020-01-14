package day6;

public interface A {
    int num = 10;

   // void show();

    default void method() {
        System.out.println("我是A中method");
    }

    static void print() {
        System.out.println("print方法");
    }
}
