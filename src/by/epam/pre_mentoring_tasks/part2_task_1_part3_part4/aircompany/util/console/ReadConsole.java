package by.epam.pre_mentoring_tasks.part2_task_1_part3_part4.aircompany.util.console;

import by.epam.pre_mentoring_tasks.part2_task_1_part3_part4.aircompany.util.exceptions.NotValidDataTypeException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadConsole {

    public String readString(){
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        return str;
    }

    public int readInt() throws InputMismatchException, NotValidDataTypeException {
        int number = 0;
        try{
            Scanner sc = new Scanner(System.in);
            number = sc.nextInt();
            return number;

        }catch (InputMismatchException e){
            System.out.println("Only integers");

        }
        return  number;


    }


    public boolean check(String str) throws  NotValidDataTypeException{
        boolean ch = false;

        try {
            //throw new NotValidDataTypeException("INCORRECT INPUT!");
            ch = str.matches("\\d+");
        }catch (InputMismatchException e){
            System.out.println("Not valid!");
        }
        return ch;

    }
}
