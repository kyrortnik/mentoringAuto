package by.epam.pre_mentoring.task1.bean;

import by.epam.pre_mentoring.task1.logic.Flying;

abstract class FlyingObject implements Flying {

     boolean manMade; // true - man-made, false - natural flying object (birds,etc.)
     int speed; // KpH
     int heightOfFlight;

      FlyingObject(boolean manMade, int speed, int heightOfFlight){
         this.manMade = manMade;
         this.speed = speed;
         this.heightOfFlight = heightOfFlight;
     }

     FlyingObject(){
     }

}
