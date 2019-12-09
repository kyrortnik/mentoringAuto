package by.epam.pre_mentoring.task1.bean;

public abstract class Aircraft  extends FlyingObject {

     String producer;
     String countryOfOrigin;
     String color;
     int cost; // US Dollars


    public Aircraft(int speed,int heightOfFlight, String producer, String countryOfOrigin, String color, int cost) {
        super(true,speed,heightOfFlight);
        this.producer = producer;
        this.countryOfOrigin = countryOfOrigin;
        this.color = color;
        this.cost = cost;
    }

    public Aircraft() {
        super();
        producer = null;
        countryOfOrigin = null;
        color = null;
        cost = 0;

    }
}
