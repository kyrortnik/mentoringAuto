package by.epam.pre_mentoring_tasks.part2_task_1_part3_part4.aircompany.util.json;



import by.epam.pre_mentoring_tasks.part2_task_1_part3_part4.aircompany.bean.Airplane;
import org.json.simple.JSONObject;

public class ToJSON {

    public JSONObject writeToJSON(Airplane plane){
        JSONObject obj = new JSONObject();
        obj.put("modelNumber",plane.getPlaneModel());
        obj.put("tonnage", plane.getTonnage());
        obj.put("country",plane.getCountryOfOrigin());
        obj.put("seatsNumber", plane.getSeatsNum());
        obj.put("producer", plane.getProducer());
        obj.put("flightHeight",plane.getHeightOfFlight());
        obj.put("flightDistance", plane.getFlightDistance());
        return  obj;



    }





}
