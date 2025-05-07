package aggregation;

public class Student {

	public static void main(String[] args) {
		Address obj1=new Address("tvm","Kerala");
		Student obj2=new Student("Sreejith",22,obj1);
		obj2.displaydetails();
		}
		String name;
		int rollnumber;
		Address address;//create a new object has a relationship between class A and class B(Class A has ClassB)
	Student(String name,int rollnumber,Address address)
	{
			this.name=name;
			this.rollnumber=rollnumber;
			this.address=address;
	}
		void displaydetails()
		{
			System.out.println(name);
			System.out.println(rollnumber);
			System.out.println(address.city);
			System.out.println(address.state);
		}
	}


