package day14;

public class Test2 {
    public static void main(String[] args) {
        new Thread(()->{
            for (int i = 0; i <10 ; i++) {
                try {
                    Thread.sleep(5000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+i);
            }

        }).start();
    }
}
