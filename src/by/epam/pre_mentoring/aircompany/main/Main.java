package by.epam.pre_mentoring.aircompany.main;

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
import by.epam.pre_mentoring.aircompany.bean.AirCompany;
import by.epam.pre_mentoring.aircompany.bean.Airplane;
import by.epam.pre_mentoring.aircompany.logic.Search;
import by.epam.pre_mentoring.aircompany.logic.WorkWithArray;
import by.epam.pre_mentoring.aircompany.util.console.ReadConsole;
import by.epam.pre_mentoring.aircompany.util.exceptions.NotValidDataTypeException;
import by.epam.pre_mentoring.aircompany.util.i_oStreams.InOutStreams;
import by.epam.pre_mentoring.aircompany.util.work_withDB.DBconnection;


import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;



public class Main {
    public static void main(String[] args) throws InputMismatchException, NotValidDataTypeException, IOException {


        AirCompany company = new AirCompany();
        ReadConsole console = new ReadConsole();
        boolean check;



        /*company.add(new Airplane(10000, "China Inc.", "China", 737, 300, 500, 20000));
        company.add(new Airplane(20000, "AirBUS Inc.", "Netherlands", 550, 600, 1000, 20000));
        company.add(new Airplane(15000, "Plane LLC.", "Belarus",  440, 250, 700, 12000));
        company.add(new Airplane(15000, "Boeing", "USA", 737, 450, 700, 15000));*/


            System.out.println("                    Hello and Welcome!");

            do {
                System.out.println("============================================================== |");
                System.out.println("What actions would you like to perform?");
                System.out.println("1.View All Airplanes in database.");
                System.out.println("2.Find a particular Airplane.");
                System.out.println("3.Add an Airplane.");
                System.out.println("4.Remove airplane form DB.");
                System.out.println("5.Show gross seats number.");
                System.out.println("6.Show gross tonnage.");
                System.out.println("============================================================== |");
                System.out.println("Type number of the action you would like to perform:");
                System.out.println("============================================================== |");

                switch (console.readInt()) {
                    case 1:

                        WorkWithArray.showAllPlanes(company);
                        break;

                    case 2:

                        System.out.println("Type by which characteristics you would like to search for plane:");
                        System.out.println("1. Plane Model");
                        System.out.println("2.Number of seats");
                        System.out.println("3.Tonnage");
                        System.out.println("4.Flight Distance");
                        System.out.println("5.Producer");
                        System.out.println("6.Country of origin");
                        System.out.println("7. Height of Flight");
                        System.out.println("============================================================== |");
                        System.out.println();
                        System.out.println("Type the number of characteristics you would like to perform:");
                        System.out.println("============================================================== |");

                        WorkWithArray.findPlane(console.readInt(),company);
                        break;

                    case 3:

                        WorkWithArray.addPlane(company);

                        break;
                    case 4:

                        WorkWithArray.deletePlane(company);

                        break;
                    case 5:

                        WorkWithArray.grossSeatNum(company);

                        break;
                    case 6:

                        WorkWithArray.grossTonnage(company);

                        break;
                    default:
                        System.out.println("no such action. please re-enter action number.");
                }
                System.out.println("would you like to perform another action? Type Yes to do so:");
                String s = console.readString();

                check = s.equalsIgnoreCase("yes");
            }while (check);

    }


}




