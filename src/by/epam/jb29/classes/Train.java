package by.epam.jb29.classes;

/**
 * Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
 * Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по номерам поездов.
 * Добавьте возможность вывода информации о поезде, номер которого введен пользователем. Добавьте возможность сортировки массив по пункту назначения,
 * причем поезда с одинаковыми пунктами назначения должны быть упорядочены по времени отправления.
 */
public class Train{
    private String destination;
    private int trainNum;
    private int time;


    public Train(String destination,int trainNum,int time){
        this.destination = destination;
        this.trainNum = trainNum;
        this.time = time;
    }

    public Train(){
        this.destination = "Magadan";
        this.trainNum = 111;
        this.time = 0000;
    }


    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getTrainNum() {
        return trainNum;
    }

    public void setTrainNum(int trainNum) {
        this.trainNum = trainNum;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }


    @Override
    public String toString(){
        String trn ="Destination: "+  destination + ", number:  " + trainNum +", time: " + time;
        return trn;
    }



}
