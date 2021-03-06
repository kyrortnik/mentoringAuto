package by.epam.pre_mentoring_tasks.part2_task_1_part3_part4.aircompany.logic;

import by.epam.pre_mentoring_tasks.part2_task_1_part3_part4.aircompany.bean.AirCompany;
import by.epam.pre_mentoring_tasks.part2_task_1_part3_part4.aircompany.bean.Airplane;
import by.epam.pre_mentoring_tasks.part2_task_1_part3_part4.aircompany.util.exceptions.LimitValueException;
import by.epam.pre_mentoring_tasks.part2_task_1_part3_part4.aircompany.util.exceptions.NoValueException;
import by.epam.pre_mentoring_tasks.part2_task_1_part3_part4.aircompany.util.console.ReadConsole;
import by.epam.pre_mentoring_tasks.part2_task_1_part3_part4.aircompany.util.exceptions.NotValidDataTypeException;
import by.epam.pre_mentoring_tasks.part2_task_1_part3_part4.aircompany.util.json.ToJSON;
import by.epam.pre_mentoring_tasks.part2_task_1_part3_part4.aircompany.util.work_withDB.DBconnection;

import java.util.Comparator;
import java.util.InputMismatchException;

public abstract class WorkWithArray {

    private static ReadConsole console = new ReadConsole();

    public static void showAllPlanes(AirCompany company) throws NoValueException {

        Comparator<Airplane> airplaneComparator = new Comparator<>() {
            @Override
            public int compare(Airplane a1, Airplane a2) {
                return (a1.getFlightDistance() - a2.getFlightDistance());
            }
        };

            company.getCompany().sort(airplaneComparator);
            if (company.getCompany().isEmpty()){
               throw  new NoValueException();
            }
            System.out.println(company.toString());

    }


    public static void findPlane( AirCompany company) throws NotValidDataTypeException, NoValueException {
        if (company.getCompany().isEmpty()){
            throw  new NoValueException();
        }else {
            System.out.println("Type by which characteristics you would like to search for plane:");
            System.out.println("1. Plane Model");
            System.out.println("2.Number of seats");
            System.out.println("3.Tonnage");
            System.out.println("4.Flight Distance");
            System.out.println("5.Producer");
            System.out.println("6.Country of origin");
            System.out.println("7. Height of Flight");
            System.out.println();
            System.out.println("Type the number of characteristics you would like to perform:");
            System.out.println("============================================================== |");



            switch (console.readInt()) {
                case 1:
                    System.out.println("Enter model:");
                    int mdl = console.readInt();

                    try {
                        Search.findByModel(company.getCompany(), mdl);
                    } catch ( NoValueException e) {
                        System.out.println("No such plane model found.");
                    }
                    break;

                case 2:
                    System.out.println("Enter number of seats:");
                    int seats = console.readInt();

                    try {
                        Search.findBySeatsNum(company.getCompany(), seats);
                    } catch (NoValueException e) {
                        System.out.println("No such seats number found.");
                    }
                    break;

                case 3:
                    System.out.println("Enter number of tonnage:");
                    int ton = console.readInt();

                    try {
                        Search.findByTonnage(company.getCompany(), ton);
                    } catch (NoValueException e) {
                        System.out.println("No such tonnage found.");
                    }
                    break;

                case 4:
                    System.out.println("Enter number of distance:");
                    int dis = console.readInt();

                    try {
                        Search.findByDistance(company.getCompany(), dis);
                    } catch (NoValueException e) {
                        System.out.println("No such distance number found.");
                    }
                    break;

                case 5:
                    System.out.println("Enter number of producer:");
                    String prd = console.readString();


                    try {
                        Search.findByProducer(company.getCompany(), prd);
                    } catch (NoValueException e) {
                        System.out.println("No such producer found.");
                    }
                    break;
                case 6:
                    System.out.println("Enter number of country:");
                    String country = console.readString();

                    try {
                        Search.findByCountry(company.getCompany(), country);
                    } catch (NoValueException e) {
                        System.out.println("No such country record.");
                    }
                    break;

                case 7:
                    System.out.println("Enter height:");
                    int high = console.readInt();

                    try {
                        Search.findByHeight(company.getCompany(), high);
                    } catch (NoValueException e) {
                        System.out.println("No such flight height record.");
                    }
                    break;
            }
        }
    }

    public static void addPlane(AirCompany company) throws NotValidDataTypeException, InputMismatchException, LimitValueException {

            Airplane plane = new Airplane();

            System.out.println("Type plane model:");
            int mdl = console.readInt();
            try{
                plane.setPlaneModel(mdl);
            }catch (LimitValueException e){
                System.out.println("only  3 integers");
            }


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

            company.add(plane);
            System.out.println("Plane is added.");

            ToJSON json = new ToJSON();

            DBconnection dbconnection = new DBconnection();
            dbconnection.addToDB(json.writeToJSON(plane));

    }


    public static void removePlane(AirCompany company) throws NotValidDataTypeException, NoValueException {
        if(!company.getCompany().isEmpty()){
            System.out.println("Type by which characteristics you would like to search for plane to remove:");
            System.out.println("1. Plane Model");
            System.out.println("2.Number of seats");
            System.out.println("3.Tonnage");
            System.out.println("4.Flight Distance");
            System.out.println("5.Producer");
            System.out.println("6.Country of origin");
            System.out.println("7. Height of Flight");
            System.out.println("============================================================== |");


            switch (console.readInt()) {
                case 1:

                    System.out.println("Enter model:");
                    int model = console.readInt();

                    try {

                        company.getCompany().removeIf(pl -> model == pl.getPlaneModel());
                        System.out.println("Plane has been removed");


                    } catch (NullPointerException e) {
                        System.out.println("No such record.");
                    }
                    break;

                case 2:
                    System.out.println("Enter number of seats:");
                    int seats = console.readInt();

                    try {
                        Search.findBySeatsNum(company.getCompany(), seats);
                    } catch (NoValueException e) {
                        System.out.println("null exception");
                    }
                    break;

                case 3:
                    System.out.println("Enter number of tonnage:");
                    int ton = console.readInt();

                    try {
                        Search.findByTonnage(company.getCompany(), ton);
                    } catch (NullPointerException | NoValueException e) {
                        System.out.println("null exception");
                    }
                    break;

                case 4:
                    System.out.println("Enter number of distance:");
                    int dis = console.readInt();

                    try {
                        Search.findByDistance(company.getCompany(), dis);
                    } catch (NullPointerException | NoValueException e) {
                        System.out.println("null exception");
                    }
                    break;

                case 5:
                    System.out.println("Enter number of producer:");
                    String prd = console.readString();


                    try {
                        Search.findByProducer(company.getCompany(), prd);
                    } catch (NullPointerException | NoValueException e) {
                        System.out.println("null exception");
                    }
                    break;
                case 6:
                    System.out.println("Enter number of country:");
                    String cnt = console.readString();

                    try {
                        Search.findByCountry(company.getCompany(), cnt);
                    } catch (NullPointerException | NoValueException e) {
                        System.out.println("null exception");
                    }
                    break;

                case 7:
                    System.out.println("Enter height:");
                    int high = console.readInt();

                    try {
                        Search.findByHeight(company.getCompany(), high);
                    } catch (NullPointerException | NoValueException e) {
                        System.out.println("null exception");
                    }
                    break;

            }
        }else{
            throw new NoValueException("no airplane record yet.");
        }


    }

    public  static void grossSeatNum(AirCompany company) throws NoValueException {
        if (!company.getCompany().isEmpty()){
            int gross = 0;
            for (int i = 0;i<company.getCompany().size();i++){
                Airplane pl = company.getCompany().get(i);
                int seat = pl.getSeatsNum();
                gross = gross + seat;
            }
            System.out.println("Gross seats number: " + gross + " seats");
        }else {
            throw  new NoValueException();
        }

    }


    public static void  grossTonnage(AirCompany company) throws NoValueException {
        if (!company.getCompany().isEmpty()){
            int gross = 0;
            for (int i = 0;i<company.getCompany().size();i++){
                Airplane pl = company.getCompany().get(i);
                int tonnage = pl.getTonnage();
                gross = gross + tonnage;
            }
            System.out.println("Gross seats tonnage: " + gross + " tonnage");
        }else {
            throw  new NoValueException();
        }

    }


}
