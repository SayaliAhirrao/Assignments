import java.io.*;
public class StudentTest {

	
		
		public static void main(String args[]) {
		      /* Create two objects using constructor */
			Student_HashMap empOne = new Student_HashMap("JamesSmith");
			Student_HashMap empTwo = new Student_HashMap("Mary Anne");

		      // Invoking methods for each object created
		      empOne.gpa(78);
		      empOne.Firstname("aaa");
		      empOne.Lastname("bbb");
		     empOne.printEmployee();

		      empTwo.gpa(78);
		      empTwo.Firstname("cv");
		      empTwo.Lastname("kj");
		      empTwo.printEmployee();
		   }
		

}

	

