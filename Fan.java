package project1;

public class Fan {
	
	//state
	private String make;
	private int speed;
	private String colour;
	private boolean isOn;
	
	//constructors
	Fan(String make,int speed,String colour,boolean isOn){
		this.make=make;
		this.speed=speed;
		this.colour=colour;
		this.isOn=isOn;
	}
	
	//methods
	
	//setters
	void switchOn() {
		this.isOn = true;
	}
	
	void switchOff() {
		this.isOn = false;
	}
	
	void changeSpeed(int speed) {
		this.speed=speed;
	}
	
	//getters
	void fanState() {
		System.out.println(this.isOn);
	}
	
	void getSpeed() {
		System.out.println(this.speed);
	}

}
