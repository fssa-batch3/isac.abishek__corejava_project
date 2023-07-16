package day07.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

class Task {
	private int id;
	private String name;
	private LocalDate deadline;

	Task(int id, String name, LocalDate deadline) {
		this.id = id;
		this.name = name;
		this.deadline = deadline;
	}

	public int getId() { 
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getDeadline() {
		return deadline;
	}
	public int hashCode() {
	    return this.getId();
	}
	public boolean equals(Object obj) {
		Task e = null;
	    if(obj instanceof Task){
	        e = (Task) obj;
	    }
	    if(this.getId() == e.getId()){
	        return true;
	    } else {
	        return false;
	    }
	}

}

class Array2  {

	static ArrayList<Task> list = new ArrayList<>();

	static boolean add(Task task) {
		list.add(task);
		return true;
	}
	
	
}

class TreeSetDemo2 extends Array2 {



	static boolean printTasks() {
		HashSet<Task> set = new HashSet<>(list);
		for (Task task : set) {
		System.out.println("Task ID: " + task.getId());
		System.out.println("Task Name: " + task.getName());
		System.out.println("Task Deadline: " + task.getDeadline());
		System.out.println("---------------------------");
	}
		return true;
	}
} 

public class RemoveDuplicateTask {
	public static void main(String[] args) {

		LocalDate input1 = LocalDate.of(2022, 10, 03);
		Task task1 = new Task(1, "Study", input1);
		System.out.println();
		Array2.add(task1);
		
		Array2.add(new Task(1, "Study", input1));
		Array2.add(new Task(1, "Study", input1));
		


		LocalDate input2 = LocalDate.of(2022, 11, 07);
		Task task2 = new Task(2, "Bharu", input2);
		Array2.add(task2);
		Array2.add(new Task(2, "Bharu", input2));
		
		
		TreeSetDemo2.printTasks();

	}
}
