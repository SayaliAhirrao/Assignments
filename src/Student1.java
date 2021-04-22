public class Student1 {    
	String name; // instantiate name variable 
	public Student1(String name) 
	
	{        
	this.name = name;     
	}    
	public String getName()
	{         
		return name;    
	}    
	public void setName(String name) { 
		this.name = name;    
		}    
	public static void main(String[] args) {        
		Student1 s1 = new Student1("Shantam");         
		System.out.println("Name: " + s1.getName());     
		s1.setName("Raj");        
		System.out.println("Name: " + s1.getName());     
		} 
	}   
