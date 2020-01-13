package by.epam.pre_mentoring_tasks.part2_task_1_part3_part4.aircompany.util.exceptions;

/**
 * Exception which is being thrown when input doesn't match value pattern (e.g. Plane model consists of 3 integers)
 */
public class LimitException extends Exception{
    public LimitException(String message){
        super(message);
    }
}
