package by.epam.pre_mentoring_tasks.part1_task1.util;



/**
 * Написать простейший калькулятор – консольное приложение
 * (реализовать как минимум 4 операции: сложение, вычитание, умножение, деление) с вводом\выводом значений\результатов;
 */


public class Calculator {

    public int sum(int x, int y){
        return x +y;
    }

    public int diff(int x, int y){
        return x - y;
    }

    public int multiply(int x,int y){
        return x * y;
    }
    public double divide(int x,int y){
        double div;
        div = (double) x/(double) y;
        try {
            y = 0;
            div = x/y;
        }catch (Exception e){
            System.out.println("Division by zero forbidden!");
        }
        return div;
    }
}
