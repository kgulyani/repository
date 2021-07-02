package personalInfo;

import classObject.Car;

public class Person {
	
	private String FN;
	private String LN;
	private int phn;
	private Car car;
	
	public String getFN() {
		return FN;
	}
	public void setFN(String fN) {
		FN = fN;
	}
	public String getLN() {
		return LN;
	}
	public void setLN(String lN) {
		LN = lN;
	}
	public int getPhn() {
		return phn;
	}
	public void setPhn(int phn) {
		this.phn = phn;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}

}
