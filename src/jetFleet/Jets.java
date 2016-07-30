package jetFleet;

public class Jets {
	//fields
	private String model;
	private double speed;
	private double range;
	private float price;
	private double machSpeed;
	
	// constructors
	public Jets(){
		
	}

	public Jets(String model, double speed, double range, float price) {
		super();
		this.model = model;
		this.machSpeed = (speed / 761.2);
		this.speed = machSpeed;
		this.range = range;
		this.price = price;
	}
//getters and setters
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getRange() {
		return range;
	}

	public void setRange(double range) {
		this.range = range;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public double getMachSpeed(double speed) {
		machSpeed = (speed / 767.289);
		return machSpeed;
	}

	public void setMachSpeed(double machSpeed) {
		machSpeed = (speed / 767.269);
		this.machSpeed = machSpeed;
	}

	@Override
	public String toString() {
		return "Model = " + model + ", Top Speed = Mach " + 
	machSpeed + ", Max Range = " + range + " miles, List Price = $" + price;
	}
	

	
}
