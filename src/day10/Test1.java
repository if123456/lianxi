package day10;

public class Test1 {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder();
        StringBuffer sb2=new StringBuffer();
        long start=System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            sb1.append(i);
        }
        long end=System.currentTimeMillis();
        System.out.println(end-start);

        long start1=System.currentTimeMillis();
        for (int i = 0; i < 10000000; i++) {
            sb2.append(i);
        }
        long end1=System.currentTimeMillis();
        System.out.println(end1-start1);
    }
}
