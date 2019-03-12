/**
 * @author Tushar Bansal
 *
 */

/*
* MyQueue Interface
*/

import java.util.PriorityQueue;

public interface MyQueue {
	void addStudent(Student student);
	void serveStudent();
	PriorityQueue<Student> getRemainingStudents();
}
