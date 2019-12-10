package by.epam.pre_mentoring.task1.util.console;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadConsole {

    public boolean readCheck(){
        boolean check;
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();

        if (str.equals("Yes")){
            check = true;
        }else check = str.equals("yes");
        return  check;
    }

    public String readString(){
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        return str;
    }
    public int readInt() throws InputMismatchException {
        int number = 0;
        Scanner sc = new Scanner(System.in);
        try {
            number = sc.nextInt();
            return number;
        }catch (InputMismatchException e){

        }
        return  number;

    }
}
