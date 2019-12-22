package by.epam.pre_mentoring.aircompany.logic;


import by.epam.pre_mentoring.aircompany.bean.Airplane;
import by.epam.pre_mentoring.aircompany.util.exceptions.NotValidDataTypeException;



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
            //System.out.println("all = " + pl.toString());
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


    public static void  findByHeight(ArrayList<Airplane> company, int height) {

        for ( Airplane pl: company){
            if (pl.getHeightOfFlight()== height){
                System.out.println(pl.toString());
            }
        }

    }

    public static void findByProducer(ArrayList<Airplane> company, String producer) {

        for ( Airplane pl: company){
            if (producer.equals(pl.getProducer())){
                System.out.println(pl.toString());
            }
        }

    }
    public static void findByCountry(ArrayList<Airplane> company, String country) {

        for ( Airplane pl: company){
            if (country.equals(pl.getCountryOfOrigin())){
                System.out.println(pl.toString());
            }

        }

    }


    }
