package day8.test1;

public interface A {
    void A();
    default void AA(){
        System.out.println("AA");
    }

    static void AAA(){
        System.out.println("AAA");
    }
}
