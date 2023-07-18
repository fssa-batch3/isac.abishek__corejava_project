package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Accounts implements Comparable<Accounts> {

	private int id;
	private String name;
	private int priority;
	private LocalDate date; 

	public Accounts(int id, String name, LocalDate date, int priority) {

		this.id = id;
		this.name = name;
		this.date = date;
		this.priority=priority;
	} 

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setProprity(int priority) {
		this.priority = priority;
	}
	public int getPriority() {
		return priority;
	}

	public void setName(String name) {
		this.name = name;
	}


	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate input) {
		this.date = input;
	}

	@Override
	public int compareTo(Accounts o) {

		if (this.date.equals(o.getDate())) {
			
			if(this.priority==o.getPriority()) {
				return 0;
				
			}
			else if(this.priority>o.getPriority()) {
				
				return -1;
			}
			else {
				return 1;
			} 
		
		} else {
			if (this.date.isBefore( o.getDate())) {
				return -1;
			} else {
				return 1;
			}
			
		}
	}

	@Override
	public String toString() {
		return "Accounts [id" + id + ", name=" + name + ", date=" + date + "]";
	}

}

public class SortByDateAndPrority {
	public static void main(String[] args) {
         LocalDate input=LocalDate.of(2023,2,22);
		Accounts acct1 = new Accounts(1, "Naresh", input,5);
		 LocalDate input1=LocalDate.of(2023,2,24);
		Accounts acct2 = new Accounts(2, "Arun", input1,5);
		 LocalDate input2=LocalDate.of(2023,2,23);
		Accounts acct3 = new Accounts(4, "Karthik", input2,5);
		 LocalDate input3=LocalDate.of(2023,2,23); 
			Accounts acct4 = new Accounts(4, "kingston", input2,4);
 
		List<Accounts> list = new ArrayList<Accounts>();
		list.add(acct1);
		list.add(acct2);
		list.add(acct3);
		list.add(acct4);

		Collections.sort(list);
		
		//Printing numbers sorted by balance
		System.out.println(list);

	}

}
