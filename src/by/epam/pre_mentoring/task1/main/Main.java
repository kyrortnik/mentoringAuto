package by.epam.pre_mentoring.task1.main;

/**
 * Спроектировать объектную модель для заданной предметной области. Использовать (продемонстрировать умение работать):
 * - классы (abstract классы – по возможности),
 * - интерфейсы,
 * - наследование,
 * - полиморфизм,
 * - инкапсуляция,
 * - коллекции.
 *
 * 5.Авиакомпания. Определить иерархию самолетов. Создать авиакомпанию. Посчитать общую вместимость и грузоподъемность.
 * Провести сортировку самолетов компании по дальности полета.
 * Найти самолет в компании, соответствующий заданному диапазону параметров.
 */
import by.epam.pre_mentoring.task1.bean.AirCompany;
import by.epam.pre_mentoring.task1.bean.Airplane;
import by.epam.pre_mentoring.task1.util.console.ReadConsole;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        ArrayList<Airplane> list = new ArrayList<>();
        AirCompany company = new AirCompany(list);
        String input = " ";
        Scanner sc = new Scanner(System.in);
        boolean check;
        ReadConsole console = new ReadConsole();
        int number;

        list.add(new Airplane(750, 10000, "China Inc.", "China", "white", 300000, 730, 300, 500, 20000));
        list.add(new Airplane(950, 20000, "AirBUS Inc.", "Netherlands", "orange", 400000, 550, 600, 1000, 20000));
        list.add(new Airplane(1000, 15000, "Plane LLC.", "Belarus", "green", 300000, 440, 250, 700, 12000));
        list.add(new Airplane(1000, 15000, "Boeing", "USA", "red", 300000, 737, 450, 700, 15000));


        System.out.println("Here all planes of the company (sorted by flight distance:)");

        Collections.sort(company.getCompany());

        for (Airplane pl : company.getCompany()) {
            System.out.println(pl.toString());
        }

        int grossSeat = company.grossSeatNum(company.getCompany());
        System.out.println("Gross Seats number on all planes is: " + grossSeat);

        int grossTon = company.grossTonnage(company.getCompany());
        System.out.println("Gross tonnage of all planes is: : " + grossTon);




            System.out.println("Do you want to find a particular plane? \"Type \"Yes\" to continue, \"No\" to Exit from application:");


        while (console.readCheck()) {

            System.out.println("Enter model:");
            number = console.readInt();
            for (Airplane pl : company.getCompany()) {
                if (pl.getPlaneModel() == number) {
                    System.out.println(pl.toString());
                    break;
                } else {

                }
            }

            System.out.println("Do you want to find a particular plane? \"Type \"Yes\" to continue, \"No\" to Exit from application");
            //some change
            //some more change


        }












        }

}