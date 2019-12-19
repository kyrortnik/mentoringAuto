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
import by.epam.pre_mentoring.aircompany.util.console.ReadConsole;
import by.epam.pre_mentoring.aircompany.util.exceptions.NotValidDataTypeException;



import java.util.Collections;
import java.util.InputMismatchException;



public class Main {
    public static void main(String[] args) throws InputMismatchException, NotValidDataTypeException {


        AirCompany company = new AirCompany();
        ReadConsole console = new ReadConsole();



        company.add(new Airplane(750, 10000, "China Inc.", "China", "white", 300000, 730, 300, 500, 20000));
        company.add(new Airplane(950, 20000, "AirBUS Inc.", "Netherlands", "orange", 400000, 550, 600, 1000, 20000));
        company.add(new Airplane(1000, 15000, "Plane LLC.", "Belarus", "green", 300000, 440, 250, 700, 12000));
        company.add(new Airplane(1000, 15000, "Boeing", "USA", "red", 300000, 737, 450, 700, 15000));

        Collections.sort(company.getCompany());


        int grossSeat;
        int grossTon;
            System.out.println("                    Hello and Welcome!");
            System.out.println("============================================================== |");
            System.out.println("What actions would you like to perform?");
            System.out.println("1.View All Airplanes in database.");
            System.out.println("2.Find a particular Airplane.");
            System.out.println("3.Add an Airplane");
            System.out.println("4.Remove airplane form DB.");
            System.out.println("============================================================== |");
            System.out.println("Type number of the action you would like to perform:");
            System.out.println("============================================================== |");
            switch (console.readInt()) {
                case 1:
                    System.out.println(company.toString());
                    break;
                case 2:
                    System.out.println("Type by which characteristics you would like to search for plane:");
                    System.out.println("1. Plane Model");
                    System.out.println("2.Number of seats");
                    System.out.println("3.Tonnage");
                    System.out.println("4.Flight Distance");
                    System.out.println("5.Producer");
                    System.out.println("6.Country of origin");
                    System.out.println("7.Color");
                    System.out.println("8.Cost");
                    System.out.println("9.Speed");
                    System.out.println("10. Height of Flight");
                    System.out.println("============================================================== |");
                    System.out.println("Type the number of characteristics you would like to perform:");
                    System.out.println("============================================================== |");
                    // method on finding plane

                        switch (console.readInt()){
                            case 1:
                                System.out.println("Enter model:");
                                int mdl = console.readInt();

                                try{
                                    Search.findByModel(company.getCompany(),mdl);
                                }catch (NullPointerException e){
                                    System.out.println("No such record.");
                                }
                                break;

                            case 2:
                                System.out.println("Enter number of seats:");
                                int seats = console.readInt();

                                try {
                                    Search.findBySeatsNum(company.getCompany(),seats);
                                }catch (NullPointerException e){
                                    System.out.println("null exception");
                                }
                                break;

                            case 3:
                                System.out.println("Enter number of tonnage:");
                                int ton = console.readInt();

                                try {
                                    Search.findByTonnage(company.getCompany(),ton);
                                }catch (NullPointerException e){
                                    System.out.println("null exception");
                                }
                                break;

                            case 4:
                                System.out.println("Enter number of distance:");
                                int dis = console.readInt();

                                try {
                                    Search.findByDistance(company.getCompany(),dis);
                                }catch (NullPointerException e){
                                    System.out.println("null exception");
                                }
                                break;

                            case 5:
                                System.out.println("Enter number of producer:");
                                String prd = console.readString();


                                try {
                                    Search.findByProducer(company.getCompany(),prd);
                                }catch (NullPointerException e){
                                    System.out.println("null exception");
                                }
                                break;
                            case 6:
                                System.out.println("Enter number of country:");
                                String country = console.readString();

                                try {
                                    System.out.println(Search.findByCountry(company.getCompany(),country));
                                }catch (NullPointerException e){
                                    System.out.println("null exception");
                                }
                                break;

                            case 7:
                                System.out.println("Enter number of color:");
                                String clr = console.readString();

                                try {
                                    System.out.println(Search.findByColor(company.getCompany(),clr));
                                }catch (NullPointerException e){
                                    System.out.println("no such value color");
                                }
                                break;

                            case 8:
                                System.out.println("Enter number of cost:");
                                int cost = console.readInt();

                                try {
                                    Search.findByCost(company.getCompany(),cost);
                                }catch (NullPointerException e){
                                    System.out.println("null exception");
                                }
                                break;


                            case 9:
                                System.out.println("Enter number of speed:");
                                int spd = console.readInt();

                                try {
                                    Search.findBySpeed(company.getCompany(),spd);
                                }catch (NullPointerException e){
                                    System.out.println("null exception");
                                }
                                break;

                            case 10:
                                System.out.println("Enter height:");
                                int high = console.readInt();

                                try {
                                    Search.findByHeight(company.getCompany(),high);
                                }catch (NullPointerException e){
                                    System.out.println("null exception");
                                }
                                break;

                        }

                    break;
                case 3:
                    // method on adding a plane
                    break;
                case 4:
                    // method on removing a plane
                    break;
                default:
                    System.out.println("no such action. please re-enter action number.");
            }
            System.out.println("after switch");


            //System.out.println("Here all planes of the company (sorted by flight distance:)");



        /*for (Airplane pl : company.getCompany()) {
            System.out.println(pl.toString());
        }*/

        /*grossSeat = company.grossSeatNum(company.getCompany());
        System.out.println("Gross Seats number on all planes is: " + grossSeat);

        grossTon = company.grossTonnage(company.getCompany());
        System.out.println("Gross tonnage of all planes is: : " + grossTon);*/


            /*System.out.println("Do you want to find a particular plane? \nType \"Yes\" to continue, \"No\" to Exit from application:");*/

/*

        while (console.readCheck()) {
            getModel(company.getCompany());



            System.out.println("Do you want to find a particular plane? \"Type \"Yes\" to continue, \"No\" to Exit from application:");
            //some change
            //some more change


        }
*/


    }
    /*public static void getModel(ArrayList<Airplane> company)  {
        ReadConsole console = new ReadConsole();
        int number;
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
*/

}




