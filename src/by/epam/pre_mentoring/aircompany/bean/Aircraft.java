package by.epam.pre_mentoring.aircompany.bean;

public abstract class Aircraft  extends FlyingObject {

    String producer;
    String countryOfOrigin;
    int cost; // US Dollars


    public Aircraft(int speed,int heightOfFlight, String producer, String countryOfOrigin, String color, int cost) {
        super(true,speed,heightOfFlight);
        this.producer = producer;
        this.countryOfOrigin = countryOfOrigin;
        this.cost = cost;
    }

    public Aircraft() {
        super();
        producer = null;
        countryOfOrigin = null;
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


    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}
