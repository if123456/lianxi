package day14.test;

public class Test {
    public static void main(String[] args) {
        Entity entity=new Entity();
//        Run1 run1=new Run1(entity);
//        Run2 run2=new Run2(entity);

        new Thread(new Run1(entity)).start();
        new Thread(new Run2(entity)).start();
    }
}
