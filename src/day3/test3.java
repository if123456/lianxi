package day3;

public class test3 {
    public static void main(String[] args) {
        int sum=0;
        for(int i=1;i<100;i++){
            if(i%5==0&&i%3==0){
                System.out.println(i);
                sum+=i;
            }
        }
        System.out.println("1-100之间既是3的倍数又是5的倍数的数字之和："+sum);
    }
}
