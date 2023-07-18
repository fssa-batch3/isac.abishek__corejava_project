package day09.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Account implements Comparable<Account> {//its an interface which has one method , 

	private int id;
	private String name;
	private LocalDate date;

	public Account(int id, String name, LocalDate date) {

		this.id = id;
		this.name = name;
		this.date = date;
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
	
	public int compareTo(Account o) {// 0,.,,,,1.....-1...
		//c0mparision   acct1...acct2
		
		if (this.date == o.getDate()) {
			return 0;
		} else {
			if (this.date.compareTo( o.getDate())<0) {
				return -1;
			} else {
				return 1;
			} 
			// return ( this.balance > o.getBalance()) ? 1: -1;
		}
	}

	@Override
	public String toString() {
		return "Account [id" + id + ", name=" + name + ", date=" + date + "]";
	}

}

public class SortByDate {
	public static void main(String[] args) {
         LocalDate input=LocalDate.of(2023,2,22);
		Account acct1 = new Account(1, "Naresh", input);
		 LocalDate input1=LocalDate.of(2023,2,24);
		Account acct2 = new Account(2, "Arun", input1);
		 LocalDate input2=LocalDate.of(2023,2,23);
		Account acct3 = new Account(4, "Karthik", input2);

		List<Account> list = new ArrayList<Account>();
		list.add(acct1);
		list.add(acct2);
		list.add(acct3);

		Collections.sort(list); //sort uses comparable interface
		
		//Printing numbers sorted by balance
		System.out.println(list); 

	}

}
