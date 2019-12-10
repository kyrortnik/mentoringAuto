package by.epam.pre_mentoring.task1.bean;


import by.epam.pre_mentoring.task1.util.exceptions.NotValidDataTypeException;


import java.util.ArrayList;


public class AirCompany {

    private ArrayList<Airplane> company;



    public AirCompany() {
        this.company = new ArrayList<>();
        company.add(new Airplane());

    }

    public void add(Airplane plane){
        this.company.add(plane);
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

    public ArrayList<Airplane> findByModel(ArrayList<Airplane> company, int model) throws NotValidDataTypeException{
        ArrayList<Airplane> list = new ArrayList<>();
        for ( Airplane pl: company){
            if (pl.getSeatsNum()== model){
                list.add(pl);
            }
            if (list.isEmpty()){
                throw new NotValidDataTypeException("No such records!");
            }
        }
        return list;
    }

    public ArrayList<Airplane> findByDistance(ArrayList<Airplane> company, int flightDistance) throws NotValidDataTypeException{
        ArrayList<Airplane> list = new ArrayList<>();
        for ( Airplane pl: company){
            if (pl.getSeatsNum()== flightDistance){
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
            if (pl.getSeatsNum()== cost){
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
            if (pl.getSeatsNum()== speed){
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
            if (pl.getSeatsNum()== height){
                list.add(pl);
            }
            if (list.isEmpty()){
                throw new NotValidDataTypeException("No such records!");
            }
        }
        return list;
    }

    public ArrayList<Airplane> findByProducer(ArrayList<Airplane> company, int producer) throws NotValidDataTypeException{ //EDIT!!!!!1
        ArrayList<Airplane> list = new ArrayList<>();
        for ( Airplane pl: company){
            if (pl.getSeatsNum()== producer){
                list.add(pl);
            }
            if (list.isEmpty()){
                throw new NotValidDataTypeException("No such records!");
            }
        }
        return list;
    }
    public ArrayList<Airplane> findByCountry(ArrayList<Airplane> company, int country) throws NotValidDataTypeException{ //EDIT!!!!!1
        ArrayList<Airplane> list = new ArrayList<>();
        for ( Airplane pl: company){
            if (pl.getSeatsNum()== country){
                list.add(pl);
            }
            if (list.isEmpty()){
                throw new NotValidDataTypeException("No such records!");
            }
        }
        return list;
    }

    public ArrayList<Airplane> findByColor(ArrayList<Airplane> company, int color) throws NotValidDataTypeException{ //EDIT!!!!!1
        ArrayList<Airplane> list = new ArrayList<>();
        for ( Airplane pl: company){
            if (pl.getSeatsNum()== color){
                list.add(pl);
            }
            if (list.isEmpty()){
                throw new NotValidDataTypeException("No such records!");
            }
        }
        return list;
    }




    public String toString(){
        String str;
        StringBuilder out = new StringBuilder();
        for (Airplane pl : company){
            str = pl.toString();
            out.append(str).append("\n");
            System.out.println(str);
        }
        return out.toString();

    }




}


