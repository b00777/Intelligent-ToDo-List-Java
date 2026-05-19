import java.util.ArrayList;

public class TaskManager {

    ArrayList<Task> tasks = new ArrayList<>();

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void displayTasks() {

        for(Task task : tasks) {
            System.out.println(task.getTitle() + " | Priority: " + task.getPriority());
        }
    }
}
