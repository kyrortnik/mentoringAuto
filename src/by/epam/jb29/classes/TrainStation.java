package by.epam.jb29.classes;

import java.util.Scanner;

public class TrainStation {
    private Train[] trainStation;

    public TrainStation(Train[] trainStation) {
        this.trainStation = trainStation;
    }

    public TrainStation() {
        this.trainStation = null;
    }

    public Train[] getTrainStation() {
        return trainStation;
    }

    public void setTrainStation(Train[] trainStation) {
        this.trainStation = trainStation;
    }

    /////////////////////////////////////////////

    public static String information(int trNumber,Train [] trains){
        String answer = " ";
        for (int i = 0;i<trains.length;i++){
            if (trNumber == trains[i].getTrainNum()){
                answer = trains[i].toString();
                return answer;
            }else{
                answer = "No trains with such number";
                continue;

            }
        }
        return answer;
    }


    /////////////////////////////////////////////

    public static void sortNumber(Train[] list) {
        int min;
        int minIndex;
        Train temp;
        Train mini = new Train();
        for (int i = 0;i<list.length;i++){
            min = list[i].getTrainNum();
            minIndex = i;
            for (int j = i+1;j<list.length;j++){
                if (min> list[j].getTrainNum()){
                    min = list[j].getTrainNum();
                    mini = list[j];
                    minIndex = j;
                }
            }
            temp = list[i];
            list[i] = mini;
            list[minIndex] = temp;
            System.out.println(list[i]);
        }
    }


     public static Train[] sortDestination(Train[] list){
            Train mini;
            int min;
            int minIndex;
            Train temp;

            for (int i = 0;i<list.length;i++){

                min = list[i].getDestination().charAt(0);
                mini = list[i];
                minIndex = i;

                for (int j = i+1;j<list.length;j++){
                    if (min > list[j].getDestination().charAt(0)){
                        mini = list[j];
                        minIndex = j;
                        if (list[j].getDestination() == list[i].getDestination()){
                            if (list[j].getTime() < list[i].getTime()){
                                mini = list[j];
                                minIndex = j;
                            }
                        }
                    }
                }
                temp = list[i];
                list[i] = mini;
                list[minIndex] = temp;

            }
            return list;
        }


    public static void main (String[]args){
        Train tr1 = new Train("Moscow", 5, 1350);
        Train tr2 = new Train("Kiev", 2, 2300);
        Train tr3 = new Train("Riga", 4, 1200);
        Train tr4 = new Train("Aberdeen ", 56, 1430);
        Train tr5 = new Train("London", 23, 2319);
        Train trains[] = {tr1, tr2, tr3, tr4, tr5};

        sortNumber(trains);

        System.out.println();


        int input;
        System.out.println("Enter train number:");
        Scanner sc = new Scanner(System.in);
        input = sc.nextInt();
        System.out.println(information(input,trains));

        sortDestination(trains);

        for (int i = 0;i<trains.length;i++){
            System.out.println(trains[i]);
        }








    }

}
