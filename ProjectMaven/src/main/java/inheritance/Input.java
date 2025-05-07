package inheritance;

import java.util.Scanner;

public class Input {
	Float basicpay;
	Float deduction;
	Float bonus;
	
	void getinput()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Basic Pay");
		basicpay = sc.nextFloat();//for importing next value
		System.out.println("Enter Deduction");
		deduction = sc.nextFloat();
		System.out.println("Enter Bonus");
		bonus = sc.nextFloat();
		
	}
}
