package superkeyword;

public class Dog extends Animal{
	void sound()
	{
		System.out.println("bow bow");
		super.sound();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog obj = new Dog();
		obj.sound();
	}

}
