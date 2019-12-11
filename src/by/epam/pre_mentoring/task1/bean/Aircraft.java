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

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getCountryOfOrigin() {
        return countryOfOrigin;
    }

    public void setCountryOfOrigin(String countryOfOrigin) {
        this.countryOfOrigin = countryOfOrigin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
