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
import java.util.InputMismatchException;



public class Main {
    public static void main(String[] args) throws InputMismatchException {

        ArrayList<Airplane> list = new ArrayList<>();
        AirCompany company = new AirCompany(list);
        ReadConsole console = new ReadConsole();

        int grossSeat;
        int grossTon;


        list.add(new Airplane(750, 10000, "China Inc.", "China", "white", 300000, 730, 300, 500, 20000));
        list.add(new Airplane(950, 20000, "AirBUS Inc.", "Netherlands", "orange", 400000, 550, 600, 1000, 20000));
        list.add(new Airplane(1000, 15000, "Plane LLC.", "Belarus", "green", 300000, 440, 250, 700, 12000));
        list.add(new Airplane(1000, 15000, "Boeing", "USA", "red", 300000, 737, 450, 700, 15000));
        //list.add(new Airplane());


        System.out.println("Here all planes of the company (sorted by flight distance:)");

        Collections.sort(company.getCompany());

        for (Airplane pl : company.getCompany()) {
            System.out.println(pl.toString());
        }

        grossSeat = company.grossSeatNum(company.getCompany());
        System.out.println("Gross Seats number on all planes is: " + grossSeat);

        grossTon = company.grossTonnage(company.getCompany());
        System.out.println("Gross tonnage of all planes is: : " + grossTon);


        System.out.println("Do you want to find a particular plane? \nType \"Yes\" to continue, \"No\" to Exit from application:");


        while (console.readCheck()) {
            getModel(company.getCompany());

            

            System.out.println("Do you want to find a particular plane? \"Type \"Yes\" to continue, \"No\" to Exit from application:");
            //some change
            //some more change


        }
        

        }
    public static void getModel(ArrayList<Airplane> company)  {
        ReadConsole console = new ReadConsole();
        int number ;
        int count = 0;

        System.out.println("Enter model number:");
        number = console.readInt();

        for (Airplane pl : company) {
            if (pl.getPlaneModel() == number) {
                System.out.println(pl.toString());
                count++;
            }
            }
            if (count == 0){
                System.out.println("No such model.Try again.");

            }
        }


    }




