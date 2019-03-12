/**
 * @author Tushar Bansal
 *
 */

/*
* Main
*/


import java.util.PriorityQueue;
import java.util.Scanner;

public class Application{
	public static void main(String args[]){
		MyQueue myStudentQueue = new MyQueueImpl();
		Scanner myScanner = new Scanner(System.in);
		int i = myScanner.nextInt(); 
		while(i-->0) {
			String task = myScanner.next();
			if(task.equals("ENTER")) {
				myStudentQueue.addStudent(new Student(myScanner.next(), myScanner.nextDouble(), myScanner.nextLong()));
			}
			else if(task.equals("SERVED")) {
				myStudentQueue.serveStudent();
			}
		}
		myScanner.close();
		
		//Getting Remianing Students
		PriorityQueue<Student> myStudents = myStudentQueue.getRemainingStudents();
		if(myStudents.isEmpty()) {
			System.out.println("EMPTY");
		}
		else{
			while(!myStudents.isEmpty()) {
				System.out.println(myStudents.poll().getName());
			}
		}
	}
}
