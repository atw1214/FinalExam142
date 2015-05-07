
public class MammalDriver {

	public static void main(String[] args) {
		
		Mammal mammal1;
		Human human1;
		
		mammal1 = new Mammal("red", 5, "Fido");
		human1 = new Human("white", 27, "Bob", 120);
		
		System.out.println(mammal1.toString());
		System.out.println(human1.toString());
		human1.setAge(28);
		System.out.println(human1.toString());
	}		

}
