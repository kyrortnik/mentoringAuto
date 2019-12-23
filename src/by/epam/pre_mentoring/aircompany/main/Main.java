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
import by.epam.pre_mentoring.aircompany.util.i_oStreams.InOutStreams;
import by.epam.pre_mentoring.aircompany.util.work_withDB.DBconnection;


import java.io.IOException;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws InputMismatchException, NotValidDataTypeException, IOException {


        AirCompany company = new AirCompany();
        ReadConsole console = new ReadConsole();
        boolean check = false;



        company.add(new Airplane(10000, "China Inc.", "China", 737, 300, 500, 20000));
        company.add(new Airplane(20000, "AirBUS Inc.", "Netherlands", 550, 600, 1000, 20000));
        company.add(new Airplane(15000, "Plane LLC.", "Belarus",  440, 250, 700, 12000));
        company.add(new Airplane(15000, "Boeing", "USA", 737, 450, 700, 15000));

        Collections.sort(company.getCompany());


        int grossSeat;
        int grossTon;
            System.out.println("                    Hello and Welcome!");
            System.out.println("============================================================== |");
            do {


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
                        DBconnection dBconnection = new DBconnection();
                        dBconnection.showAllDB();
                        //System.out.println(company.toString());
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
                        System.out.println("Type the number of characteristics you would like to perform:");
                        System.out.println("============================================================== |");
                        // method on finding plane

                        switch (console.readInt()) {
                            case 1:
                                System.out.println("Enter model:");
                                int mdl = console.readInt();

                                try {
                                    Search.findByModel(company.getCompany(), mdl);
                                } catch (NullPointerException e) {
                                    System.out.println("No such record.");
                                }
                                break;

                            case 2:
                                System.out.println("Enter number of seats:");
                                int seats = console.readInt();

                                try {
                                    Search.findBySeatsNum(company.getCompany(), seats);
                                } catch (NullPointerException e) {
                                    System.out.println("null exception");
                                }
                                break;

                            case 3:
                                System.out.println("Enter number of tonnage:");
                                int ton = console.readInt();

                                try {
                                    Search.findByTonnage(company.getCompany(), ton);
                                } catch (NullPointerException e) {
                                    System.out.println("null exception");
                                }
                                break;

                            case 4:
                                System.out.println("Enter number of distance:");
                                int dis = console.readInt();

                                try {
                                    Search.findByDistance(company.getCompany(), dis);
                                } catch (NullPointerException e) {
                                    System.out.println("null exception");
                                }
                                break;

                            case 5:
                                System.out.println("Enter number of producer:");
                                String prd = console.readString();


                                try {
                                    Search.findByProducer(company.getCompany(), prd);
                                } catch (NullPointerException e) {
                                    System.out.println("null exception");
                                }
                                break;
                            case 6:
                                System.out.println("Enter number of country:");
                                String country = console.readString();

                                try {
                                    Search.findByCountry(company.getCompany(), country);
                                } catch (NullPointerException e) {
                                    System.out.println("null exception");
                                }
                                break;

                            case 7:
                                System.out.println("Enter height:");
                                int high = console.readInt();

                                try {
                                    Search.findByHeight(company.getCompany(), high);
                                } catch (NullPointerException e) {
                                    System.out.println("null exception");
                                }
                                break;
                        }

                        break;
                    case 3:
                        Airplane plane = new Airplane();

                        System.out.println("Type plane model:");
                        int mdl = console.readInt();
                        plane.setPlaneModel(mdl);

                        System.out.println("Type plane tonnage:");
                        int tonnage = console.readInt();
                        plane.setTonnage(tonnage);

                        System.out.println("Type plane country:");
                        String country = console.readString();
                        plane.setCountryOfOrigin(country);

                        System.out.println("Type number of seats:");
                        int sets = console.readInt();
                        plane.setSeatsNum(sets);

                        System.out.println("Type plane producer:");
                        String producer = console.readString();
                        plane.setProducer(producer);

                        System.out.println("Type plane height of flight:");
                        int height = console.readInt();
                        plane.setHeightOfFlight(height);

                        System.out.println("Type plane flight distance:");
                        int distance = console.readInt();
                        plane.setFlightDistance(distance);

                        DBconnection dbconnection = new DBconnection();
                        dbconnection.addToDB(plane);


                        break;
                    case 4:
                        // method on removing a plane
                        System.out.println("Type by which characteristics you would like to search for plane:");
                        System.out.println("1. Plane Model");
                        System.out.println("2.Number of seats");
                        System.out.println("3.Tonnage");
                        System.out.println("4.Flight Distance");
                        System.out.println("5.Producer");
                        System.out.println("6.Country of origin");
                        System.out.println("7. Height of Flight");
                        System.out.println("============================================================== |");
                        System.out.println("Type the number of characteristics of plane you would like to remove :");
                        System.out.println("============================================================== |");


                        switch (console.readInt()) {
                            case 1:
                                System.out.println("Enter model:");
                                int model = console.readInt();
                                String str = Integer.toString(model);

                                try {
                                    DBconnection dB1 = new DBconnection();
                                    dB1.remoteFromDB(str, "plane_model");
                                } catch (NullPointerException e) {
                                    System.out.println("No such record.");
                                }
                                break;

                            case 2:
                                System.out.println("Enter number of seats:");
                                int seats = console.readInt();

                                try {
                                    Search.findBySeatsNum(company.getCompany(), seats);
                                } catch (NullPointerException e) {
                                    System.out.println("null exception");
                                }
                                break;

                            case 3:
                                System.out.println("Enter number of tonnage:");
                                int ton = console.readInt();

                                try {
                                    Search.findByTonnage(company.getCompany(), ton);
                                } catch (NullPointerException e) {
                                    System.out.println("null exception");
                                }
                                break;

                            case 4:
                                System.out.println("Enter number of distance:");
                                int dis = console.readInt();

                                try {
                                    Search.findByDistance(company.getCompany(), dis);
                                } catch (NullPointerException e) {
                                    System.out.println("null exception");
                                }
                                break;

                            case 5:
                                System.out.println("Enter number of producer:");
                                String prd = console.readString();


                                try {
                                    Search.findByProducer(company.getCompany(), prd);
                                } catch (NullPointerException e) {
                                    System.out.println("null exception");
                                }
                                break;
                            case 6:
                                System.out.println("Enter number of country:");
                                String cnt = console.readString();

                                try {
                                    Search.findByCountry(company.getCompany(), cnt);
                                } catch (NullPointerException e) {
                                    System.out.println("null exception");
                                }
                                break;

                            case 7:
                                System.out.println("Enter height:");
                                int high = console.readInt();

                                try {
                                    Search.findByHeight(company.getCompany(), high);
                                } catch (NullPointerException e) {
                                    System.out.println("null exception");
                                }
                                break;

                        }
                        break;
                    default:
                        System.out.println("no such action. please re-enter action number.");
                }
                System.out.println("would you like to perform another action? Type Yes to do so:");
                String s = console.readString();

                if(s.equals("Yes")|| s.equals("yes")){
                    check = true;
                }else {
                    check = false;
                }
            }while (check);

            System.out.println("Check of IO");
        InOutStreams strm = new InOutStreams();
        strm.streams();



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




