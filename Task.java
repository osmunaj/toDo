public class Task {
    private String task;
    private String dueDate;
    private boolean complete = false;
    private int priority;

    
   
    

    public Task (String task, String dueDate, boolean complete, int priority){
        this.task = task;
        this.dueDate = dueDate;
        this.complete = complete;
        this.priority = priority;
        
        taskList[totalTasks] = this.getTask();
        totalTasks += 1;
    }

    

    public String getTask(){
        return this.task + ", due " + this.dueDate + ", completion status: " + this.complete + ", priority: " + this.priority; 
    }

    public String getTaskList(){
        String allTasks = "";
        for (int i = 0; i < taskList.length; i++){
            allTasks += taskList[i];
        }
        return allTasks;
        
    }

    public int getTaskCount(){
        return totalTasks;
    }

    public void changeTask(String task){
        this.task = task;
    }
    public void changeDueDate(String dueDate){
        this.dueDate = dueDate;
    }

    public void complete(){
        this.complete = true;
    }

    public void changePriority(int priority){    
        this.priority = priority;
    }
    

 
}