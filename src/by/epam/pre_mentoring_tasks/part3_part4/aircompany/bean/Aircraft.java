package by.epam.pre_mentoring_tasks.part3_part4.aircompany.bean;

public abstract class Aircraft  extends FlyingObject {

    String producer;
    String countryOfOrigin;



    public Aircraft(int heightOfFlight, String producer, String countryOfOrigin) {
        super(true,heightOfFlight);
        this.producer = producer;
        this.countryOfOrigin = countryOfOrigin;

    }

    public Aircraft() {
        super();
        producer = null;
        countryOfOrigin = null;


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

}
