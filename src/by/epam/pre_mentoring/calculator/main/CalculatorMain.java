package by.epam.pre_mentoring.calculator.main;

import by.epam.pre_mentoring.calculator.util.Calculator;
import by.epam.pre_mentoring.calculator.util.ReadConsole;

public class CalculatorMain {
    public static void main(String[]args){

        Calculator calculator = new Calculator();
        ReadConsole console = new ReadConsole();
        int x;
        int y;
        char ch;
        int check;

        do {

            x = console.getX();
            y = console.getY();
            ch = console.getChar();


            if (ch == '+'){
                System.out.println("Answer: " + calculator.sum(x,y));
            }else if (ch == '-'){
                System.out.println("Answer: " + calculator.diff(x,y));
            }else if (ch == '*'){
                System.out.println("Answer: " + calculator.multiply(x,y));
            }else if (ch == '/'){
                System.out.println("Answer: " + calculator.divide(x,y));

            }

            System.out.println("To continue, enter a number. To stop Enter 0:");
            check = console.getCheck();
        }while (check !=0);


    }
}
