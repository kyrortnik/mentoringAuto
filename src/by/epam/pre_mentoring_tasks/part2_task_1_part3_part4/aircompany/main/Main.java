package by.epam.pre_mentoring_tasks.part2_task_1_part3_part4.aircompany.main;

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
 *
 * + Exceptions handeling
 * + I/O Streams
 * + JDBC
 * + JSON parsing
 */
import by.epam.pre_mentoring_tasks.part2_task_1_part3_part4.aircompany.bean.AirCompany;
import by.epam.pre_mentoring_tasks.part2_task_1_part3_part4.aircompany.logic.WorkWithArray;
import by.epam.pre_mentoring_tasks.part2_task_1_part3_part4.aircompany.util.console.ReadConsole;
import by.epam.pre_mentoring_tasks.part2_task_1_part3_part4.aircompany.util.exceptions.NotValidDataTypeException;


import java.util.InputMismatchException;



public class Main {
    public static void main(String[] args) throws InputMismatchException, NotValidDataTypeException {


        AirCompany company = new AirCompany();
        ReadConsole console = new ReadConsole();
        boolean check;

        System.out.println("                    Hello and Welcome!");

        do {
            System.out.println("============================================================== |");
            System.out.println("What actions would you like to perform?");
            System.out.println("1.View All Airplanes.");
            System.out.println("2.Find a particular Airplane.");
            System.out.println("3.Add an Airplane.");
            System.out.println("4.Remove airplane.");
            System.out.println("5.Show gross seats number.");
            System.out.println("6.Show gross tonnage.");
            System.out.println();
            System.out.println("Type number of the action you would like to perform:");
            System.out.println("============================================================== |");

            switch (console.readInt()) {
                case 1:
                    WorkWithArray.showAllPlanes(company);
                    break;

                case 2:
                    WorkWithArray.findPlane(company);
                    break;

                case 3:
                    WorkWithArray.addPlane(company);
                    break;

                case 4:
                    WorkWithArray.removePlane(company);
                    break;

                case 5:
                    WorkWithArray.grossSeatNum(company);
                    break;

                case 6:
                    WorkWithArray.grossTonnage(company);
                    break;

                default:
                    System.out.println("No such action. Please re-enter action number.");
            }
            System.out.println("Would you like to perform another action? Type Yes to do so. Type anything else to exit application.");
            String s = console.readString();

            check = s.equalsIgnoreCase("yes");
        }while (check);

    }


}

