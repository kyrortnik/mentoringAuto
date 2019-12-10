package by.epam;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class TestIO {
    public static void main(String[]args) throws IOException {
        FileInputStream  fis = null;
        InputStreamReader isr = null;
        int b;
        try{
            fis = new FileInputStream("C:/Users/Mikhail_Alarabi/Desktop/IO.txt");
            isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            while((b = isr.read())!= -1){
                System.out.print((char)b);

            };
        }catch (FileNotFoundException e){

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try
            {
                fis.close();
            }catch (IOException e){
                e.printStackTrace();
            }
            try{
                isr.close();
            }catch (IOException e){
                e.printStackTrace();
            }

        }

    }
}
