package day06.practice;

import java.util.ArrayList;
import java.util.List;

public class DuplicateRemover {
  public static void main(String[] args) {
	  List<String> cityList = new ArrayList<String>();
	
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");
		cityList.add("Bangalore");
		
		for(int i=0;i<cityList.size();i++) {
			
			for(int j=i+1;j<cityList.size();j++) {  
				
				if(cityList.get(i).equals(cityList.get(j))) {
					cityList.remove(j);  //removing the duplicate items
					
				}
			}
		}
		System.out.println(cityList);
  }
}
