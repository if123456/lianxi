package day5;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
//        int a=input.nextInt();
//        int b=input.nextInt();
//        int c=input.nextInt();

//        int temp=a<b?a:b;
//        int min=temp<c?temp:c;
//        System.out.println(min);
//        System.out.println(a+b+c);

//        int arr[]=new int[5];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = input.nextInt();
//        }
//        for (int i = 0; i < arr.length-1; i++) {
//            for (int j = 0; j < arr.length-i-1; j++) {
//                if(arr[j]>arr[j+1]){
//                    int t=arr[j];
//                    arr[j]=arr[j+1];
//                    arr[j+1]=t;
//                }
//            }
//        }
//
//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
        ArrayList<Integer> iin=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            iin.add(new Scanner(System.in).nextInt());
        }
        for (int i = 0; i < iin.size(); i++) {
            System.out.println(iin.get(i));
        }
    }
}
