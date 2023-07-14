package day06.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Tasks {
    
    private ArrayList<String> tasks;
    private ArrayList<String> priority;
    
    public Tasks() {
        tasks = new ArrayList<>();
        priority = new ArrayList<>();
    }
    
    public void addTasks() {
        Scanner scan = new Scanner(System.in);
        String yes = "yes";
        
        while (yes.equals("yes")) {
            System.out.println("Add your task:");
            String taskName = scan.nextLine();
            tasks.add(taskName);
            
            System.out.println("Add priority level:");
            String priorityLevel = scan.nextLine();
            priority.add(priorityLevel);
            
            System.out.println("Continue? (yes/no)");
            yes = scan.nextLine();
        }
        
        scan.close();
    }
    
    public void displayTasks() {
        for (int j = 0; j < tasks.size(); j++) {
            System.out.println(j + " " + tasks.get(j) + " Priority Level: " + priority.get(j));
        }
    }
    
    public static void main(String[] args) {
        Tasks taskManager = new Tasks();
        taskManager.addTasks();
        taskManager.displayTasks();
    }
}
