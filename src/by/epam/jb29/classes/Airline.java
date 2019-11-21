package by.epam.jb29.classes;

/**
 * 10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и метод toString().
 * Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и методами.
 * Задать критерии выбора данных и вывести эти данные на консоль.
 * Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
 * Найти и вывести:
 * a) список рейсов для заданного пункта назначения;
 * b) список рейсов для заданного дня недели;
 * c) список рейсов для заданного дня недели, время вылета для которых больше заданного.
 */
public class Airline {

    private String destination;
    private int flightNum;
    private String planeType;
    private int departTime;
    private String weekDay;

    public Airline(String destination, int flightNum, String planeType, int departTime, String weekDay) {

        this.destination = destination;
        this.flightNum = flightNum;
        this.planeType = planeType;
        this.departTime = departTime;
        this.weekDay = weekDay;

    }
    public Airline(){

        destination = "New-York";
        flightNum = 0;
        planeType = null;
        departTime = 1200;
        weekDay = "Monday";

    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getFlightNum() {
        return flightNum;
    }

    public void setFlightNum(int flightNum) {
        this.flightNum = flightNum;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public int getDepartTime() {
        return departTime;
    }

    public void setDepartTime(int departTime) {
        this.departTime = departTime;
    }

    public String getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }

    public String toString(){
        String airLine = "destination: " + destination + ", flight Number: " + flightNum + ", type: " + planeType + ", department time: " + departTime + ", weekday: "+ weekDay;
        return airLine;
    }


}
