package by.epam.pre_mentoring.task1.util.performance;


import by.epam.pre_mentoring.task1.bean.AirCompany;
import by.epam.pre_mentoring.task1.bean.Airplane;

public class Performance {
    AirCompany company = new AirCompany();
    long startTime = System.nanoTime();


    public void test(){
        for (int i = 0;i<10000;i++){
            company.add(new Airplane());
        }

    }
}
