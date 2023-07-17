package day08.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Holdmethods{
	static HashMap<String, ArrayList<String>> countMap = new HashMap<String, ArrayList<String>>();
static	Scanner sc = new Scanner(System.in);
static	int count = 0;
	static boolean addMethods() {
		//HR=[]
		while (count < 5) {
	
			String s = sc.nextLine();
			String[] ar = s.split(",");
			int check = 0;
			for (String deptName : countMap.keySet()) {
				if (ar[0].equals(deptName)) {
					check = 1;
				}
			}//will not run at the very first time
			if (check == 1) {
				ArrayList<String> arr = countMap.get(ar[0]);
				arr.add(ar[1]);
				countMap.put(ar[0], arr);
			}
			else {
				ArrayList<String> arr = new ArrayList<String>();
				arr.add(ar[1]);
				countMap.put(ar[0], arr);
			}
			count++;
		}
		return true;
	}
	static boolean View() {
		System.out.println(countMap.keySet());
		for (String n : countMap.keySet()) {
			System.out.println(n + " : " + countMap.get(n));
		}
		return true;
	}
}
