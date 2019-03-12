/**
 * @author Tushar Bansal
 *
 */

/*
* MyQueue Implementation
*/

import java.util.Comparator;
import java.util.PriorityQueue;

class MyQueueImpl implements MyQueue{
	
	PriorityQueue<Student> students= new PriorityQueue<Student>(Comparator.comparing(Student::getCgpa).reversed()
	.thenComparing(Student::getName).thenComparing(Student::getToken));
	
	MyQueueImpl(){}
	
	MyQueueImpl(PriorityQueue<Student> students){
		this.students=students;
	}
	
	public void addStudent(Student student){
		students.add(student);
	}
	
	public void serveStudent(){
		students.poll();
	}
	
	public PriorityQueue<Student> getRemainingStudents(){
		return students;
	}
}

