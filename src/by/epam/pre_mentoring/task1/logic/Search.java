package by.epam.pre_mentoring.task1.logic;

import by.epam.pre_mentoring.task1.bean.AirCompany;
import by.epam.pre_mentoring.task1.bean.Airplane;
import by.epam.pre_mentoring.task1.util.exceptions.NotValidDataTypeException;

import java.util.ArrayList;

public abstract class Search {

    public ArrayList<Airplane> findByTonnage(ArrayList<Airplane> company, int tonnage) throws NotValidDataTypeException {
        ArrayList<Airplane> list = new ArrayList<>();
        for ( Airplane pl: company){
            if (pl.getTonnage()== tonnage){
                list.add(pl);
            }
            if (list.isEmpty()){
                throw new NotValidDataTypeException("No such records!");
            }
        }
        return list;

    }
    public ArrayList<Airplane> findBySeatsNum(ArrayList<Airplane> company, int seats) throws NotValidDataTypeException {
        ArrayList<Airplane> list = new ArrayList<>();
        for ( Airplane pl: company){
            if (pl.getSeatsNum()== seats){
                list.add(pl);
            }
            if (list.isEmpty()){
                throw new NotValidDataTypeException("No such records!");
            }
        }
        return list;
    }

    public static void findByModel(AirCompany company, int model) throws NotValidDataTypeException{
        ArrayList<Airplane> list = new ArrayList<>();
        for ( Airplane pl: company.getCompany()){
            if (pl.getPlaneModel()== model){
                list.add(pl);
            }
            if (list.isEmpty()){
                throw new NotValidDataTypeException("No such records!");
            }
        }
        for (Airplane pl : list){
            System.out.println(pl.toString());
        }
    }

    public ArrayList<Airplane> findByDistance(ArrayList<Airplane> company, int flightDistance) throws NotValidDataTypeException{
        ArrayList<Airplane> list = new ArrayList<>();
        for ( Airplane pl: company){
            if (pl.getFlightDistance()== flightDistance){
                list.add(pl);
            }
            if (list.isEmpty()){
                throw new NotValidDataTypeException("No such records!");
            }
        }
        return list;
    }

    public ArrayList<Airplane> findByCost(ArrayList<Airplane> company, int cost) throws NotValidDataTypeException{
        ArrayList<Airplane> list = new ArrayList<>();
        for ( Airplane pl: company){
            if (pl.getCost()== cost){
                list.add(pl);
            }
            if (list.isEmpty()){
                throw new NotValidDataTypeException("No such records!");
            }
        }
        return list;
    }

    public ArrayList<Airplane> findBySpeed(ArrayList<Airplane> company, int speed) throws NotValidDataTypeException{
        ArrayList<Airplane> list = new ArrayList<>();
        for ( Airplane pl: company){
            if (pl.getSpeed()== speed){
                list.add(pl);
            }
            if (list.isEmpty()){
                throw new NotValidDataTypeException("No such records!");
            }
        }
        return list;
    }
    public ArrayList<Airplane> findByHeight(ArrayList<Airplane> company, int height) throws NotValidDataTypeException{
        ArrayList<Airplane> list = new ArrayList<>();
        for ( Airplane pl: company){
            if (pl.getHeightOfFlight()== height){
                list.add(pl);
            }
            if (list.isEmpty()){
                throw new NotValidDataTypeException("No such records!");
            }
        }
        return list;
    }

    public ArrayList<Airplane> findByProducer(ArrayList<Airplane> company, String producer) throws NotValidDataTypeException{
        ArrayList<Airplane> list = new ArrayList<>();
        for ( Airplane pl: company){
            if (pl.getProducer().equals(producer)){
                list.add(pl);
            }
            if (list.isEmpty()){
                throw new NotValidDataTypeException("No such records!");
            }
        }
        return list;
    }
    public ArrayList<Airplane> findByCountry(ArrayList<Airplane> company, String country) throws NotValidDataTypeException{
        ArrayList<Airplane> list = new ArrayList<>();
        for ( Airplane pl: company){
            if (pl.getCountryOfOrigin().equals(country)){
                list.add(pl);
            }
            if (list.isEmpty()){
                throw new NotValidDataTypeException("No such records!");
            }
        }
        return list;
    }

    public ArrayList<Airplane> findByColor(ArrayList<Airplane> company, String color) throws NotValidDataTypeException{
        ArrayList<Airplane> list = new ArrayList<>();
        for ( Airplane pl: company){
            if (pl.getColor().equals(color)){
                list.add(pl);
            }
            if (list.isEmpty()){
                throw new NotValidDataTypeException("No such records!");
            }
        }
        return list;
    }


}
