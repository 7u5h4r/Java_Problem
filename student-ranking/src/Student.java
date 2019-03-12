/**
 * @author Tushar Bansal
 *
 */

/*
* Student POJO
*/

class Student{
	public String name;
	private double cgpa;
	private long token;
	
	Student(){}
	
	Student(String name, double cgpa, long token){
		this.name=name;
		this.cgpa = cgpa;
		this.token = token;
	}
	
	// Getters
	
	public String getName() {
		return name;
	}

	public double getCgpa() {
		return cgpa;
	}

	public long getToken() {
		return token;
	}
	
}

