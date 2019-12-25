package by.epam.pre_mentoring.aircompany.util.json;


import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import by.epam.pre_mentoring.aircompany.bean.Airplane;
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
