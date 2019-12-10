package by.epam.pre_mentoring.task1.util.console;

import java.util.Scanner;

public class ReadConsole {

    public boolean readCheck(){
        boolean check;
        Scanner sc = new Scanner(System.in);

            if (sc.next().equals("Yes")){
                check = true;
            }else{
                check = false;
            }
        return  check;
    }

    public String readString(){
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        return str;
    }
    public int readInt() {
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        return number;
    }
}
