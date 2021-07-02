package classObject;

public class Car {
	
	private String Make;
	private String model;
	private String Year;
	private int Wheels;
	private int tires;
	private int mirrors;
	private String Engine;
	
	public Car(int wheels,int tires,int mirros,String model) {
		this.Wheels = wheels;
		this.tires = tires;
		this.mirrors = mirros;
		this.model=model;
	}
	public Car()
	{
		
	}
	public void eccelrate()	
	{
		System.out.println("moving the car "+model);
	}
	public int getWheels() {
		return Wheels;
	}
	public void setWheels(int wheels) {
		Wheels = wheels;
	}
	public int getTires() {
		return tires;
	}
	public void setTires(int tires) {
		this.tires = tires;
	}
	public int getMirrors() {
		return mirrors;
	}
	public void setMirrors(int mirrors) {
		this.mirrors = mirrors;
	}
	
	public void setEngine(String engine) {
		Engine = engine;
	}
	public String getMake() {
		return Make;
	}
	public void setMake(String make) {
		Make = make;
	}
	public String getYear() {
		return Year;
	}
	public void setYear(String year) {
		Year = year;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}

}
