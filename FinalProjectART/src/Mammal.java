//Ashlee Troop
//Final Project 142

public class Mammal {
    
	// Class for Mammals     
	private String color;    
	private String name;
	private int age; 
	// 1 = ears 2= arms 3 = fingers, etc.
	
	// Constructors     
	public Mammal(String Color, int Age, String Name) {
	color = Color;         
	age = Age;         
	name = Name;     
	}

	public String toString() {         
	  return name + " is " + color + " and " + age + " years old.";
	
	
	}          
	
	// Accessors     
	public String getColor() {         
	  return color;     
	}
	public int getAge() {
		return age;
	}
	public String getName() {
		return name;
	}
	// likewise for the other two          
	// Mutators     
	public void setColor(String newColor) { 
		color = newColor;
	}          
	public void setAge(int newAge) {         
	  age = newAge;     
	}       
	public void setName(String newName) {
		name = newName;
	}
}
