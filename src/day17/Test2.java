package day17;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {
    public static void main(String[] args) throws IOException {
        File file =new File("D:\\a.txt");
        FileOutputStream file2=new FileOutputStream(file);
        byte[] b="asdf123456".getBytes();
        file2.write(97);
        file2.write(98);
        file2.write(99);
        file2.write("\r\n".getBytes());
        file2.write(b);
        FileInputStream file3=new FileInputStream(file);
        int a;
        while((a=file3.read())!=-1){
            System.out.print((char)a);
        }

        file2.close();
    }
}
