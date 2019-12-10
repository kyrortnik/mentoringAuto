package by.epam.pre_mentoring.task1.bean;

import by.epam.pre_mentoring.task1.logic.IFlying;

abstract class FlyingObject implements IFlying {

    boolean manMade; // true - man-made, false - natural flying object (birds,etc.)
    int speed; // KpH
    int heightOfFlight;

    FlyingObject(boolean manMade, int speed, int heightOfFlight){
        this.manMade = manMade;
        this.speed = speed;
        this.heightOfFlight = heightOfFlight;
    }

    FlyingObject(){
        manMade = false;
        speed = 0;
        heightOfFlight = 0;
    }

}
