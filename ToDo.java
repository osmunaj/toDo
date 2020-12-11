import java.util.Scanner;
import java.util.io.*;

import jdk.tools.jlink.internal.TaskHelper;

public class ToDo {
    public static void main(String[] args){
        int totalTasks = 0;
        String[] taskList = new String[totalTasks + 1];

        System.out.println("Tasks: ");
        
        Task task1 = new Task("Finish coding project", "11/09/2020", false, 2);
        Task task2 = new Task("Do the dishes", "before mom gets home", false, 5);
        Task task3 = new Task("Math homework", "11/11/2020", false, 3);
        task1.changeDueDate("11/11/2020");
        task1.changePriority(4);
        task2.complete();


        System.out.println(task1.getTaskList());
    }
}
