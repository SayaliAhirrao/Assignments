// Import the HashMap class
import java.util.HashMap;
public class Student_HashMap<Int> {

	public String firstname;
	String lastname;
	   int gpa;
	   
	   public Student_HashMap(String name) {
		this.firstname= name;
		
		// TODO Auto-generated constructor stub
	}
	
	public Student_HashMap(String string, String string2, Int integer) {
		// TODO Auto-generated constructor stub
	}

	public String Firstname() {
		return firstname;
	}
	
	public void Firstname(String last) {
	      firstname = last;
	   }
	public void gpa(int studentGpa) {
	      gpa = studentGpa;
	   }
	public void Lastname(String first) {
	      firstname = first;
	   }
	public void printEmployee() {
	      System.out.println("FirstName:"+ firstname );
	      System.out.println("Lastname:" + lastname );
	      System.out.println("GPA:" + gpa );
	      //System.out.println("Salary:" + salary);
	   }
}	


