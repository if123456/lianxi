package day13;

public class Test2 {
    public static void main(String[] args) {
        try {
            int a=1/0;
            System.out.println(a);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
