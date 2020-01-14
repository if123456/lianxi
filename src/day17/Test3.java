package day17;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("D:\\a.txt");
        FileOutputStream fos=new FileOutputStream("D:\\a\\a_copy.txt");
        byte[]b=new byte[1024];
        int len;
        while ((len=fis.read(b))!=-1){
            fos.write(b,0,len);
        }
        fos.close();
        fis.close();
    }
}
