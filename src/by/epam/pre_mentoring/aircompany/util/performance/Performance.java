package by.epam.pre_mentoring.aircompany.util.performance;


import by.epam.pre_mentoring.aircompany.bean.AirCompany;
import by.epam.pre_mentoring.aircompany.bean.Airplane;

public class Performance {
    AirCompany company = new AirCompany();
    long startTime = System.nanoTime();


    public void test(){
        for (int i = 0;i<10000;i++){
            company.add(new Airplane());
        }

    }
}
