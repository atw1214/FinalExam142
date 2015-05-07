import Mammal


public class Human extends Mammal {
    
	private int iq;
	
	// Constructors     
		public Human(String Color, int Age, String Name, int IQ) {         
			super(Color, Age, Name);
			iq = IQ;
		}
		
		public String toString() {
			return this.getName() + " is " + this.getColor() + ", " + this.getAge() + "years old, and has an IQ of" + iq + ".";
		}
		
	// Accessors
		public int getIQ() {
			return iq;
		}
		
	// Mutators
		public void setIQ(int newIQ) {
			iq = newIQ;
		}
}
