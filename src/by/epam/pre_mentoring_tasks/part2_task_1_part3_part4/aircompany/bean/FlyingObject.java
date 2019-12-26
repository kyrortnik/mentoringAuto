package by.epam.pre_mentoring_tasks.part2_task_1_part3_part4.aircompany.bean;

import by.epam.pre_mentoring_tasks.part2_task_1_part3_part4.aircompany.logic.IFlying;

abstract class FlyingObject implements IFlying {

    boolean manMade; // true - man-made, false - natural flying object (birds,etc.)
    int heightOfFlight;

    FlyingObject(boolean manMade, int heightOfFlight){
        this.manMade = manMade;
        this.heightOfFlight = heightOfFlight;
    }

    FlyingObject(){
        manMade = false;
        heightOfFlight = 0;
    }

    public boolean isManMade() {
        return manMade;
    }

    public void setManMade(boolean manMade) {
        this.manMade = manMade;
    }


    public int getHeightOfFlight() {
        return heightOfFlight;
    }

    public void setHeightOfFlight(int heightOfFlight) {
        this.heightOfFlight = heightOfFlight;
    }
}
