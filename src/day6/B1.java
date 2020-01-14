package day6;

public interface B1 {
    //void show();

    default void method() {
        System.out.println("我是B中method");
    }
}
