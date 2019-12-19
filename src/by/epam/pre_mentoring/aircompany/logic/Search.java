package by.epam.pre_mentoring.aircompany.logic;


import by.epam.pre_mentoring.aircompany.bean.Airplane;
import by.epam.pre_mentoring.aircompany.util.exceptions.NotValidDataTypeException;


import java.lang.reflect.Array;
import java.util.ArrayList;

public abstract class Search {

    public static void findByTonnage(ArrayList<Airplane> company, int tonnage)  {

        for ( Airplane pl: company){
            if (pl.getTonnage()== tonnage){
                System.out.println(pl.toString());
            }else

        }


    }
    public static void  findBySeatsNum(ArrayList<Airplane> company, int seats)  {

        for ( Airplane pl: company){
            if (pl.getSeatsNum()== seats){
                System.out.println(pl.toString());
            }
        }

    }

    public static Arr findByModel(ArrayList<Airplane> company, int model) throws NotValidDataTypeException{

        for ( Airplane pl: company){
            if (pl.getPlaneModel() == model){
                System.out.println(pl.toString());
            }

        }

    }

    public static ArrayList<Airplane> findByDistance(ArrayList<Airplane> company, int flightDistance) {
        ArrayList<Airplane> list = new ArrayList<>();

        for ( Airplane pl: company) {
            if (pl.getFlightDistance() == flightDistance) {
                list.add(pl);
            }else {
                throw new NullPointerException("no such distance");
            }
        }
        return list;
    }

    public static ArrayList<Airplane> findByCost(ArrayList<Airplane> company, int cost) {
        ArrayList<Airplane> list = new ArrayList<>();

        for ( Airplane pl: company){
            if (pl.getCost()== cost){
               list.add(pl);
            }else {
                throw new NullPointerException(" no such cost.");
            }
        }
        return list;

    }

    public static ArrayList<Airplane> findBySpeed(ArrayList<Airplane> company, int speed) {
        ArrayList<Airplane> list = new ArrayList<>();

        for ( Airplane pl: company) {
            if (pl.getSpeed() == speed) {
               list.add(pl);
            }else {
                throw new NullPointerException("no such speed.");
            }
        }
        return list;

    }
    public static ArrayList<Airplane>  findByHeight(ArrayList<Airplane> company, int height) {
        ArrayList<Airplane> list = new ArrayList<>();

        for ( Airplane pl: company){
            if (pl.getHeightOfFlight()== height){
                list.add(pl);
            }else{
                throw new NullPointerException("no such company.");
            }
        }
        return  list;

    }

    public static ArrayList<Airplane> findByProducer(ArrayList<Airplane> company, String producer) {
        ArrayList<Airplane> list = new ArrayList<>();

        for ( Airplane pl: company){
            if (producer.equals(pl.getProducer())){
                list.add(pl);
            }else{
                throw new NullPointerException("no such producer.");
            }

        }
        return list;

    }
    public static ArrayList<Airplane> findByCountry(ArrayList<Airplane> company, String country) {
        ArrayList<Airplane> list = new ArrayList<>();

        for ( Airplane pl: company){
            if (country.equals(pl.getCountryOfOrigin())){
                list.add(pl);
            }else {
                throw new NullPointerException("no such country.");
            }

        }
        return list;

    }

    public static ArrayList<Airplane> findByColor(ArrayList<Airplane> company, String color) {
        ArrayList<Airplane> list = new ArrayList<>();


            for (Airplane pl: company){
                if (color.equals(pl.getColor())){
                    list.add(pl);
                }else {
                    throw new NullPointerException("no such value");
                }
            }
        return list;
    }



}
