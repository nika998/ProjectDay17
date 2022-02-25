package domain;

public class AirPlane implements FlyParameters {

	private String name;
	private double weight;
	private double power;
	int age;

	@Override
	public double velocity(double weight, double power) {
		// TODO Auto-generated method stub
		return power * 100 - age * 10;
	}

	public AirPlane(String name, double weight, double power, int age) {
		super();
		this.name = name;
		this.weight = weight;
		this.power = power;
		this.age = age;
	}

	@Override
	public int capacity(double weight, int age) {
		// TODO Auto-generated method stub
		return (int) weight / 100 - age;
	}

}
