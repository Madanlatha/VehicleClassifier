package Vehcile;

abstract class vehicle{
	abstract void start();
	{
		System.out.println("Vehicle Started");
	}
	abstract void stop();{
		System.out.println("Vehicle Stopped");
	}
	
}
class car extends vehicle{
	@Override
	public void start() {
		System.out.println("Car Started");
	}
	@Override
	public void stop() {
		System.out.println("Car stopped");
	}
}
class  Motorcycle extends vehicle {
	@Override
	public void start() {
		System.out.println("Motorcycle started");
	}
	@Override
	public void stop() {
		System.out.println("Motorcycle stopped");
	}
}

public class vehiclemodel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Motorcycle motorcycle=new Motorcycle();
		motorcycle.start();
		motorcycle.stop();
		
		car Car=new car();
		Car.start();
		Car.stop();

	}

}
