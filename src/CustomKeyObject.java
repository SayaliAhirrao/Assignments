import java.util.*;
import java.io.*;
  
// User defined class
public class CustomKeyObject {
  
    public static class Student {
  
        private int gpa;
        private String firstname;
        private String lastname;
  
        // Constructor
        public Student(int gpa, String name, String lastname)
        {
            this.gpa = gpa;
            this.firstname = name;
            this.lastname = lastname;
        }
        public String getname()
        {
            return this.firstname;
        }
        public String getlastname()
        {
            return this.lastname;
        }
  
        public int getgpa()
        {
            return this.gpa;
        }
  
        public void setname(String name)
        {
            this.firstname = name;
        }
  
        public void setmarks(int gpa)
        {
            this.gpa = gpa;
        }
        public void setlastname(String name)
        {
            this.lastname = name;
        }
     // Overriding the hashcode() function
        @Override
        public int hashCode()
        {
  
            // uses roll no to verify the uniqueness
            // of the object of Student class
  
            final int temp = 14;
            int ans = 1;
            ans = temp * ans + gpa;
            return ans;
        }
     // Equal objects must produce the same
        // hash code as long as they are equal
        @Override
        public boolean equals(Object o)
        {
            if (this == o) {
                return true;
            }
            if (o == null) {
                return false;
            }
            if (this.getClass() != o.getClass()) {
                return false;
            }
            Student other = (Student)o;
            if (this.gpa != other.gpa) {
                return false;
            }
            return true;
        }
    }
 // main method
    public static void main(String[] args)
        throws NumberFormatException,
               IOException
    {
        HashMap<Student, String> map = new HashMap<>();
  
        Student one = new Student(1, "Geeks1","xyz"); // key1
  
        Student two = new Student(2, "Geeks2","zxc"); // key2
  
        // put keys in map
        map.put(one, one.getname());
        map.put(two, two.getname());
  
        // changing key state so that
        // hashcode() should be calculated again
        one.setname("Not Geeks1");
        two.setname("Not Geeks2");
     // still prints Geeks1
        System.out.println(map.get(one));
  
        // still prints Geeks1
        System.out.println(map.get(two));
  
        // try with newly created key with same Rollno
        Student three = new Student(1, "Geeks3","uio");
  
        // we get Geeks1
        System.out.println(map.get(three));
    }
  
    // This code is contributed by Subhesh
}