package by.epam.pre_mentoring_tasks.part2_task_1_part3_part4.aircompany.util.exceptions;
/**
Exception which is being thrown when there are no values in collection which satisfy request
 */
public class NoValueException extends Exception {


    public NoValueException(String message) {
        super(message);
    }

    public NoValueException() {

    }
}
