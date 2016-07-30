package jetFleet;

public class PersonalJet extends Jets {
	
	private int maxPassengers;
	private int bottlesChapagne;
	
	
	
	
	public PersonalJet() {
		// TODO Auto-generated constructor stub
	}

	public PersonalJet(String model, double speed, double range, float price, int maxPassengers, int bottlesChampagne) {
		super(model, speed, range, price);
		this.bottlesChapagne = bottlesChampagne;
		this.maxPassengers = maxPassengers;
		// TODO Auto-generated constructor stub
	}

	public int getMaxPassengers() {
		return maxPassengers;
	}

	public void setMaxPassengers(int maxPassengers) {
		this.maxPassengers = maxPassengers;
	}

	public int getBottlesChapagne() {
		return bottlesChapagne;
	}

	public void setBottlesChapagne(int bottlesChapagne) {
		this.bottlesChapagne = bottlesChapagne;
	}
	@Override
	public String toString() {
		return "Type: Personal Luxury Aircraft!  Model: " + getModel() + ",\nTop Speed = Mach " + 
				getMachSpeed(this.getSpeed()) + ", Max Range = " + getRange() + " miles, \nList Price = $" + getPrice() + 
				", Bottles of Champagne = " + bottlesChapagne + 
				", Maximum Occupancy = " + maxPassengers;
	}
}
