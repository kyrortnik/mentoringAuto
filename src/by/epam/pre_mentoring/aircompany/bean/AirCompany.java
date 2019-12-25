package by.epam.pre_mentoring.aircompany.bean;


import java.util.ArrayList;


public class AirCompany {

    private ArrayList<Airplane> company;



    public AirCompany() {
        this.company = new ArrayList<>();
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





    public String toString(){
        String str;
        StringBuilder out = new StringBuilder();
        for (Airplane pl : company){
            str = pl.toString();
            out.append(str).append("\n");
                    }
        return out.toString();

    }






}


