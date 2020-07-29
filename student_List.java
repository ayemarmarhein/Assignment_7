package Assignment_7;

import java.util.*;
import java.util.Map.Entry;


public class student_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char question;
		Scanner scanner = new Scanner(System.in);
		HashMap<String, Student> hashMap = new HashMap<String, Student>();
		Student stu_1 = new Student("Myia", "5CS-1", "09-778900456", "Ygn");
		Student stu_2 = new Student("Alucard", "5CS-2", "09-778900455", "Mdy");
	    Student stu_3 = new Student("Freya", "5CS-3", "09-425637895", "Ygn");
	    Student stu_4 = new Student("Gord", "5CS-4", "09-42563897", "MLM");
	    Student stu_5 = new Student("Nana", "5CS-5", "09-76532148", "PLO");
	    Student stu_6 = new Student("Alice", "5CS-6", "09-365489755", "PLO");
	    
		hashMap.put("Myia", stu_1);
		hashMap.put("Alucard", stu_2);
		hashMap.put("Freya", stu_3);
		hashMap.put("Gord", stu_4);
		hashMap.put("Nana", stu_5);
		hashMap.put("Alice", stu_6);
		
		do {   
		
			Set set = hashMap.entrySet();
			Iterator iterator = set.iterator();
		
			System.out.println("Find Name: ");
		    String find_name = scanner.nextLine();
		    find_name = find_name.toLowerCase();
	 	    
		    while(iterator.hasNext()) {
		    		Map.Entry entry = (Entry) iterator.next();
		    		String start_name = (String) entry.getKey();
			    
		    			if(start_name.toLowerCase().startsWith(find_name))  {
		    				Student student = (Student) entry.getValue();
		    				System.out.println(student.show_List());
		    			}
		    	}
		    
		    System.out.println("\nContinue[y/n] : ");
			question = scanner.nextLine().charAt(0);
			
		}while(question != 'n');
		scanner.close();			

	}

}
