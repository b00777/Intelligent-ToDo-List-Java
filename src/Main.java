public class Main {

    public static void main(String[] args) {

        System.out.println("Intelligent To-Do List with Prioritization");

        Task task1 = new Task("Complete Assignment", 5);

        TaskManager manager = new TaskManager();

        manager.addTask(task1);

        System.out.println("Task added successfully.");
    }
}
