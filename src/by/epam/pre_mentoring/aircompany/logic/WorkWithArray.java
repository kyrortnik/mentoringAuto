package by.epam.pre_mentoring.aircompany.logic;

import by.epam.pre_mentoring.aircompany.bean.AirCompany;
import by.epam.pre_mentoring.aircompany.bean.Airplane;
import by.epam.pre_mentoring.aircompany.util.console.ReadConsole;
import by.epam.pre_mentoring.aircompany.util.exceptions.NotValidDataTypeException;
import by.epam.pre_mentoring.aircompany.util.work_withDB.DBconnection;

public class WorkWithArray {
    ReadConsole console = new ReadConsole();
    public void findPlane(int number, AirCompany company){

        switch (number) {
            case 1:
                System.out.println("Enter model:");
                int mdl = console.readInt();

                try {
                    Search.findByModel(company.getCompany(), mdl);
                } catch (NullPointerException | NotValidDataTypeException e) {
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
    }

    public void addPlane(int number,AirCompany company){

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
    }
}
