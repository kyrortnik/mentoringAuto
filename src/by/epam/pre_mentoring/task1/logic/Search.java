package by.epam.pre_mentoring.task1.logic;


import by.epam.pre_mentoring.task1.bean.Airplane;
import by.epam.pre_mentoring.task1.util.exceptions.NotValidDataTypeException;


import java.util.ArrayList;

public abstract class Search {

    public static void findByTonnage(ArrayList<Airplane> company, int tonnage)  {

        for ( Airplane pl: company){
            if (pl.getTonnage()== tonnage){
                System.out.println(pl.toString());
            }

        }


    }
    public static void  findBySeatsNum(ArrayList<Airplane> company, int seats)  {

        for ( Airplane pl: company){
            if (pl.getSeatsNum()== seats){
                System.out.println(pl.toString());
            }
        }

    }

    public static void findByModel(ArrayList<Airplane> company, int model) throws NotValidDataTypeException{

        for ( Airplane pl: company){
            if (pl.getPlaneModel() == model){
                System.out.println(pl.toString());
            }

        }

    }

    public static void findByDistance(ArrayList<Airplane> company, int flightDistance) {

        for ( Airplane pl: company) {
            if (pl.getFlightDistance() == flightDistance) {
                System.out.println(pl.toString());
            }
        }
    }

    public static void findByCost(ArrayList<Airplane> company, int cost) {

        for ( Airplane pl: company){
            if (pl.getCost()== cost){
               System.out.println(pl.toString());
            }
        }

    }

    public static void findBySpeed(ArrayList<Airplane> company, int speed) {

        for ( Airplane pl: company) {
            if (pl.getSpeed() == speed) {
                System.out.println(pl.toString());
            }
        }

    }
    public static void  findByHeight(ArrayList<Airplane> company, int height) {

        for ( Airplane pl: company){
            System.out.println(pl.toString());
            if (pl.getHeightOfFlight()== height){
                System.out.println(pl.toString());
            }
        }

    }

    public static void findByProducer(ArrayList<Airplane> company, String producer) {

        for ( Airplane pl: company){
            if (pl.getProducer().equals(producer)){
                System.out.println(pl.toString());
            }
        }

    }
    public static void findByCountry(ArrayList<Airplane> company, String country) {

        for ( Airplane pl: company){
            if (pl.getCountryOfOrigin().equals(country)){
                System.out.println(pl.toString());
            }

        }

    }

    public static void findByColor(ArrayList<Airplane> company, String color) {

        for ( Airplane pl: company){
            if (pl.getColor().equals(color)){
                System.out.println(pl.toString());
            }

        }

    }


}
