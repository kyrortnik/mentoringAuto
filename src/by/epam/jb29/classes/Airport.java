package by.epam.jb29.classes;

public class Airport {
    private Airline[] airport;

    public Airport(Airline[] airport) {
        this.airport = airport;
    }
    public Airport(){
        this.airport = null;
    }

    public Airline[] getAirport() {
        return airport;
    }

    public void setAirport(Airline[] airport) {
        this.airport = airport;
    }

     /////////////////////////////////////////////////
    public static void sortDestination(Airline[] airport, String destination){
        for (int i = 0; i < airport.length ; i++) {
            if (destination == airport[i].getDestination()){
                System.out.println(airport[i].toString());
            }
        }
    }
    ////////////////////////////////////////////////////
    public static void sortWeekDay(Airline[] airport, String weekDay){
        for (int i = 0; i <airport.length ; i++) {
            if (weekDay == airport[i].getWeekDay()){
                System.out.println(airport[i].toString());
            }
        }
    }
    ////////////////////////////////////////////////////
    public static void sortWeekDay_departTime(Airline[] airport, String weekDay,int departTime){
        for (int i = 0; i < airport.length ; i++) {
            if (weekDay == airport[i].getWeekDay() && departTime < airport[i].getDepartTime()){
                System.out.println(airport[i].toString());
            }
        }
    }

    public static void main(String[]args){

            Airline arl1 = new Airline("Minks",21,"boeing",1700,"Friday");
            Airline arl2 = new Airline("Brest", 34,"airbus",2343,"Monday");
            Airline arl3 = new Airline("Rome",11,"kukuruznik",1200,"Wednesday");

        Airline[] minskAir = {arl1,arl2,arl3};

        sortDestination(minskAir,"Brest");
        System.out.println();

        sortWeekDay(minskAir,"Monday");
        System.out.println();

        sortWeekDay_departTime(minskAir,"Friday",1600);



    }
}
