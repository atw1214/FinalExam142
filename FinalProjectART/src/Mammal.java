//Ashlee Troop
//Final Project 142

public class Mammal {
    
	// Class for Mammals     
	private String color;     
	private int partAge;     
	private String partClass;
	private int age; 
	// 1 = ears 2= arms 3 = fingers, etc.
	
	// Constructors     
	public Mammal(String bodyColor, int string, String string2) {         
	String partColor = bodyColor;
	color = partColor;         
	age = string;         
	partClass = string2;     
	}          
	
	public Mammal(String bodyColor, String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	public Mammal(String string, String string2) {
		// TODO Auto-generated constructor stub
	}

	public String toString() {         
	  return "Part class: " + partClass + " is color " + color + "Age: " + age;
	
	
	}          
	
	// Accessors     
	public String getColor() {         
	  return color;     
	}          
	// likewise for the other two          
	// Mutators     
	public void setColor1(Object red) {            
	}          
	public void setAge(int newAge) {         
	  age = newAge;     
	}
	public int getPartAge() {
		return partAge;
	}
	public void setPartAge(int partAge) {
		this.partAge = partAge;

	}

	public void setColor(Object red) {
		// TODO Auto-generated method stub
		
	}               
}
