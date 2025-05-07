package string;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="hello";
String b="Hello";
System.out.println(a.length());
System.out.println(a.equals(b));
System.out.println(a.equalsIgnoreCase(b));
System.out.println(a.charAt(0));
System.out.println(a.isEmpty());
System.out.println(a.toUpperCase());
System.out.println(b.toLowerCase());
System.out.println(a.contains("ll"));
System.out.println(a.concat(b.trim()));//Remove extra spaces
System.out.println(a.concat(" ").concat(a));
System.out.println(a.replace('h','i'));

	}

}
