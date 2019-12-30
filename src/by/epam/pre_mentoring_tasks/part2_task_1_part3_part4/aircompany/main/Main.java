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
 */
import by.epam.pre_mentoring_tasks.part2_task_1_part3_part4.aircompany.bean.AirCompany;
import by.epam.pre_mentoring_tasks.part2_task_1_part3_part4.aircompany.logic.WorkWithArrayList;
import by.epam.pre_mentoring_tasks.part2_task_1_part3_part4.aircompany.util.console.ReadConsole;



import java.util.InputMismatchException;



public class Main {
    public static void main(String[] args) throws InputMismatchException {


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
                System.out.println("4.Remove airplane form DB.");
                System.out.println("5.Show gross seats number.");
                System.out.println("6.Show gross tonnage.");
                System.out.println("============================================================== |");
                System.out.println("Type number of the action you would like to perform:");
                System.out.println("============================================================== |");

                switch (console.readInt()) {
                    case 1:

                        WorkWithArrayList.showAllPlanes(company);
                        break;

                    case 2:
                        if (company.getCompany().isEmpty()){
                            System.out.println("No airplane records yet.");
                        }else{

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

                            WorkWithArrayList.findPlane(console.readInt(),company);
                        }

                        break;

                    case 3:

                        WorkWithArrayList.addPlane(company);

                        break;
                    case 4:

                        WorkWithArrayList.deletePlane(company);

                        break;
                    case 5:

                        WorkWithArrayList.grossSeatNum(company);

                        break;
                    case 6:

                        WorkWithArrayList.grossTonnage(company);

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




