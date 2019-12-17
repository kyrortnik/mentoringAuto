package by.epam.pre_mentoring.task1.bean;


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


