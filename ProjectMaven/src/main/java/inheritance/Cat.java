package inheritance;

public class Cat extends Animal//Child Class of Animal
{
	void eat() {
		System.out.println("Cat eat");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat obj1 = new Cat();
		obj1.sound();
		obj1.eat();
	}

}
