package jetFleet;

public class CombatJet extends Jets {
	//fields
	private int numberOfTurrets;
	private int numberOfBombs;


	//constructors
	public CombatJet() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CombatJet(String model, double speed, double range, float price,
	int numberOfTurrets, int numberOfBombs) {
		super(model, speed, range, price);
		this.numberOfBombs = numberOfBombs;
		this.numberOfTurrets = numberOfTurrets;
		// TODO Auto-generated constructor stub
	}
	public int getNumberOfTurrets() {
		return numberOfTurrets;
	}
	public void setNumberOfTurrets(int numberOfTurrets) {
		this.numberOfTurrets = numberOfTurrets;
	}
	public int getNumberOfBombs() {
		return numberOfBombs;
	}
	public void setNumberOfBombs(int numberOfBombs) {
		this.numberOfBombs = numberOfBombs;
	}

	
	@Override
	public String toString() {
		return "Type: Combat Jet!  Model: " + getModel() + ", \nTop Speed = Mach " + 
				getMachSpeed(this.getSpeed()) + ", Max Range = " + getRange() + " miles, \nList Price = $" + getPrice() + 
				", Total Number Of Turrets = " + numberOfTurrets + 
				", Total Number of Bombs = " + numberOfBombs;
	}
	//getters and setters
}
