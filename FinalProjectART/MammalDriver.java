
public class MammalDriver {

	public static Mammal mammalLogic;
	public static Mammal mammalAge;
	public static Mammal petOne;
	public static Mammal petTwo;
	public static Mammal petThree;
	public MammalDriver() {
		
	}

	public static void main(String[] args) {
		                  
			Mammal partColor = new Mammal("Red", "Brown", "White");         
			setMammalAge(new Mammal("15", "2", "7"));         
			setMammalLogic(new Mammal("Yes", "No"));                  
			System.out.println("Data for part color: " + partColor.toString());         
			Object Red = partColor;
			partColor.setColor(Red);         
			System.out.println("Data for part color: " + partColor.toString());     
			} 
	/**
	 * @return the mammalLogic
	 */
	public static Mammal getMammalLogic() {
		return mammalLogic;
	}

	/**
	 * @param mammalLogic the mammalLogic to set
	 */
	public static void setMammalLogic(Mammal mammalLogic) {
		MammalDriver.mammalLogic = mammalLogic;
	}
	/**
	 * @return the mammalAge
	 */
	public static Mammal getMammalAge() {
		return mammalAge;
	}

	/**
	 * @param mammalAge the mammalAge to set
	 */
	public static void setMammalAge(Mammal mammalAge) {
		MammalDriver.mammalAge = mammalAge;
	}
	/**
	 * @return the petOne
	 */
	public static Mammal getPetOne() {
		return petOne;
	}

	/**
	 * @param petOne the petOne to set
	 */
	public static void setPetOne(Mammal petOne) {
		MammalDriver.petOne = petOne;
	}
	/**
	 * @return the petTwo
	 */
	public static Mammal getPetTwo() {
		return petTwo;
	}

	/**
	 * @param petTwo the petTwo to set
	 */
	public static void setPetTwo(Mammal petTwo) {
		MammalDriver.petTwo = petTwo;
	}
	/**
	 * @return the petThree
	 */
	public static Mammal getPetThree() {
		return petThree;
	}

	/**
	 * @param petThree the petThree to set
	 */
	public static void setPetThree(Mammal petThree) {
		MammalDriver.petThree = petThree;
	}
	{ 
	}

}
