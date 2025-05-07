package string;

public class StringBufferex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer a = new StringBuffer("Hello ");

a.append("World");
System.out.println(a);

a.insert(11," Hi");
System.out.println(a);

a.replace(5, 9, " Wow");
System.out.println(a);

a.delete(5, 9);
System.out.println(a);

System.out.println(a.length());

System.out.println(a.reverse());

	}

}
