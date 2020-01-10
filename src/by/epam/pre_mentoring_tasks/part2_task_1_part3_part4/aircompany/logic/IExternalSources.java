package by.epam.pre_mentoring_tasks.part2_task_1_part3_part4.aircompany.logic;

import by.epam.pre_mentoring_tasks.part2_task_1_part3_part4.aircompany.bean.Airplane;
import org.json.simple.JSONObject;

public abstract class IExternalSources {

   abstract JSONObject writeToJSON(Airplane plane);

   abstract public boolean checkDB();

   abstract  public void createDB();

   abstract public void addToDB(JSONObject plane);


}
