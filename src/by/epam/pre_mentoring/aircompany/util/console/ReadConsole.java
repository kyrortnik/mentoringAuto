package by.epam.pre_mentoring.aircompany.util.console;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadConsole {




    public String readString(){
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        return str;
    }
    public int readInt() throws InputMismatchException {
        int number = 0;
        try {
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
            return number;
        }catch (InputMismatchException e){
        }
        return  number;

    }
}
