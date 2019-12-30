package by.epam.pre_mentoring_tasks.part2_task_1_part3_part4.aircompany.logic;


import by.epam.pre_mentoring_tasks.part2_task_1_part3_part4.aircompany.bean.Airplane;
import by.epam.pre_mentoring_tasks.part2_task_1_part3_part4.aircompany.util.exceptions.NoValueException;


import java.util.ArrayList;

abstract class Search {

    static void findByTonnage(ArrayList<Airplane> company, int tonnage)  {

        for ( Airplane pl: company){
            if (pl.getTonnage()== tonnage){
                System.out.println(pl.toString());
            }

        }


    }
    static void  findBySeatsNum(ArrayList<Airplane> company, int seats)  {

        for ( Airplane pl: company){
            if (pl.getSeatsNum()== seats){
                System.out.println(pl.toString());
            }
        }

    }

    static void findByModel(ArrayList<Airplane> company, int model) throws NoValueException {


            for ( Airplane pl: company){
                if (pl.getPlaneModel() == model){
                    System.out.println(pl.toString());
                }else {
                    throw new NoValueException("no value");
                }


            }


    }

    static void findByDistance(ArrayList<Airplane> company, int flightDistance) {

        for ( Airplane pl: company) {
            if (pl.getFlightDistance() == flightDistance) {
                System.out.println(pl.toString());
            }
        }
    }


    static void  findByHeight(ArrayList<Airplane> company, int height) {

        for ( Airplane pl: company){
            if (pl.getHeightOfFlight()== height){
                System.out.println(pl.toString());
            }
        }

    }

    static void findByProducer(ArrayList<Airplane> company, String producer) {

        for ( Airplane pl: company){
            if (producer.equals(pl.getProducer())){
                System.out.println(pl.toString());
            }
        }

    }
    static void findByCountry(ArrayList<Airplane> company, String country) {

        for ( Airplane pl: company){
            if (country.equals(pl.getCountryOfOrigin())){
                System.out.println(pl.toString());
            }

        }

    }


    }
