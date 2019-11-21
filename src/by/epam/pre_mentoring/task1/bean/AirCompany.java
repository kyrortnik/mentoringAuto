package by.epam.pre_mentoring.task1.bean;


import by.epam.pre_mentoring.task1.util.exceptions.NoValueException;


import java.util.ArrayList;
import java.util.StringJoiner;


public class AirCompany {

    private ArrayList<Airplane> company;

    public AirCompany(ArrayList<Airplane> company) {
        this.company = company;
    }

    public AirCompany() {

    }


    public ArrayList<Airplane> getCompany() {
        return company;
    }

    public void setCompany(ArrayList<Airplane> company) {
        this.company = company;
    }



    public  int grossSeatNum(ArrayList<Airplane> airCompany){
        int gross = 0;
        for (int i = 0;i<airCompany.size();i++){
            Airplane pl = airCompany.get(i);
            int seat = pl.getSeatsNum();
            gross = gross + seat;
        }

        return gross;
    }


    public int grossTonnage(ArrayList<Airplane> airCompany){
        int gross = 0;
        for (int i = 0;i<airCompany.size();i++){
            Airplane pl = airCompany.get(i);
            int tonnage = pl.getTonnage();
            gross = gross + tonnage;
        }
        return  gross;
    }



        public ArrayList<Airplane> findPlaneByTonnage(ArrayList<Airplane> airCompany, int tonnage) throws NoValueException {
        ArrayList<Airplane> list = new ArrayList<>();
        for ( Airplane plane: airCompany){
            if (plane.getTonnage()== tonnage){
                list.add(plane);
            }
            if (list.isEmpty()){
                throw new NoValueException("No such records!");
            }
        }
        return list;

    }
    public ArrayList<Airplane> findPlaneBySeatsNum(ArrayList<Airplane> airCompany, int seats) throws NoValueException {
        ArrayList<Airplane> list = new ArrayList<>();
        for ( Airplane plane: airCompany){
            if (plane.getSeatsNum()== seats){
                list.add(plane);
            }
            if (list.isEmpty()){
                throw new NoValueException("No such records!");
            }
        }
        return list;

    }




}


