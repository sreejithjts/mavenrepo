package aggregation;

public class Car{ //Class A
	Engine obj = new Engine();
	void stop() {
		obj.start();
		System.out.println("Car Stops");
	}
}

