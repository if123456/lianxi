package day3;

public class test9 {
    public static void main(String[] args) {
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                if(j==i||j==6-i){
                System.out.print("0");}
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
