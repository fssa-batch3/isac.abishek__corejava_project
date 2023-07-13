package day06.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Tasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan =new Scanner(System.in);
		String yes="yes";
		System.out.println("Add your tasks");
	     ArrayList<String> tasks= new ArrayList<String>();//new arraylist
	     ArrayList<String> prority= new ArrayList<String>();
		while (scan.hasNext()&& yes.equals("yes")) {
			
			String taskName=scan.nextLine();
			 tasks.add(taskName);
			 System.out.println("Add proirty level");
			 String prorityy=scan.nextLine();
			  prority.add(prorityy);
			  System.out.println("continue yes or no");
				 String yesorno=scan.nextLine();
				 
			   yes=yesorno;
			   if(yesorno.equals("yes")) {
				   System.out.println("Add your tasks");
			   }
			  
			 
			 
		}

			
			for(int j=0;j<tasks.size();j++) {  
				System.out.println(j+"  "+tasks.get(j)+"priority Level"+prority.get(j));
				
			}
		
		
	     

	}

}
