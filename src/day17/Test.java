package day17;

import java.io.File;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException{
        File file=new File("D:\\bb.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(file.exists());
        file.delete();
        System.out.println(file.exists());

        File file1=new File("aaa.txt");
        file1.createNewFile();
    }
}
