package by.epam.pre_mentoring_tasks.part2_task_1_part3_part4.aircompany.bean;


import java.util.Objects;


public class Airplane  extends Aircraft implements Comparable<Airplane>{

    private int planeModel;
    private int seatsNum;
    private int tonnage;
    private int flightDistance;

    public Airplane( int heightOfFlight, String producer, String countryOfOrigin, int planeModel, int seatsNum, int tonnage, int flightDistance) {
        super(heightOfFlight,producer,countryOfOrigin);
        this.planeModel = planeModel;
        this.seatsNum = seatsNum;
        this.tonnage = tonnage;
        this.flightDistance = flightDistance;
    }

    public Airplane() {
        super();
        planeModel = 0;
        seatsNum = 0;
        tonnage = 0;
        flightDistance = 0;
    }



    public int getPlaneModel() {
        return planeModel;
    }

    public void setPlaneModel(int planeModel) {
        this.planeModel = planeModel;
    }

    public int getSeatsNum() {
        return seatsNum;
    }

    public void setSeatsNum(int seatsNum) {
        this.seatsNum = seatsNum;
    }

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    public int getFlightDistance() {
        return flightDistance;
    }

    public void setFlightDistance(int flightDistance) {
        this.flightDistance = flightDistance;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airplane airplane = (Airplane) o;
        return planeModel == airplane.planeModel &&
                seatsNum == airplane.seatsNum &&
                tonnage == airplane.tonnage &&
                flightDistance == airplane.flightDistance;
    }

    @Override
    public int hashCode() {
        return Objects.hash(planeModel, seatsNum, tonnage, flightDistance);
    }

    @Override
    public int compareTo(Airplane plane) {
        return (Integer.compare(this.getPlaneModel(), plane.planeModel));
    }

    @Override
    public String toString() {
        return "Airplane: " +
                "Plane Model = " + planeModel +
                ", Number of Seats = " + seatsNum +
                ", Tonnage = " + tonnage +
                ", Flight Distance = " + flightDistance +
                ", Producer = " + producer + '\'' +
                ", Country off Origin = " + countryOfOrigin + '\'' +
                ", Height of Flight = " + heightOfFlight ;
    }

    @Override
    public void takeOff() {
        System.out.println("Take off!");
    }

    @Override
    public void ascend() {
        System.out.println("Going up!");
    }

    @Override
    public void descend() {
        System.out.println("Going down!");

    }

    @Override
    public void landing() {
        System.out.println("And we've landed!");

    }
}

