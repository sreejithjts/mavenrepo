package string;

public class PalindromEg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PalindromEg1 obj1=new PalindromEg1();
		obj1.isPal("java");
		obj1.isPal("malayalam");
	}
		public void isPal(String a)
		{
			StringBuilder str=new StringBuilder(a);//String "a" to String Builder str
			String s1=str.reverse().toString();//toString()is used to convert String Builder to String
			boolean flag=s1.equalsIgnoreCase(a);
			if(flag)
			{
				System.out.println("The String is Palindrome");
			}
			else {
				System.out.println("The String is not Palindrome");
			}
		
		
	}

}