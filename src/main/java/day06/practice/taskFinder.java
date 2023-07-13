package day06.practice;
import java.util.ArrayList;
class finder{
	static boolean findTaskByName(String name, ArrayList<String> tasks) {
		String taskname=name.toLowerCase();
		
		for(int i=0;i<tasks.size();i++) { //array is iterated
			if(tasks.get(i).equals(taskname)) {
				return true; //if task available return true
			}
	}
		return false;
	}
}
public class taskFinder {
	public static void main(String[] args) {
		  ArrayList<String> tasks= new ArrayList<String>();//new arraylist
		  tasks.add("bath"); //bath is added
		  //sent as param to method
		  System.out.println(finder.findTaskByName("bath", tasks));
		  
		  
	  }
}
