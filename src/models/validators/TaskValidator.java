package models.validators;

import java.util.ArrayList;
import java.util.List;

import models.Task;

public class TaskValidator {

    public static List<String> validate(Task t){

        List<String> errors = new ArrayList<String>();

        String task_error = validateTask(t.getContent());
        if(!task_error.equals("")) {
            errors.add(task_error);
        }

        return errors;
    }

    public static String validateTask(String task) {
        if (task == null || task.equals("")) {
            return "タスクを入力してください";
        }
        return "";
    }

}
