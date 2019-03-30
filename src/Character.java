
public class Character {
	protected String weapon;			
	protected String wardrobe;
	private java.util.Date dateCreated;
	private int money;
	
	//default Character object 
	public Character() {
		weapon = "rusty sword";
		wardrobe = "rag clothing";
		this.money = 0;
	}
	
	//Character object with specified money value
	public Character(String we, String wa, int cash){
		dateCreated = new java.util.Date();
		weapon = we;
		wardrobe = wa;
		this.money = cash;
	}
	
	// return weapon
	public String getWeapon(){
		return weapon;
	}
	
	//return wardrobe
	public String getWardrobe(){
		return wardrobe;
	}
	
	//return the date created
	public java.util.Date getDateCreated(){
		return dateCreated;
	}
	
	//return money
	public int getMoney(){
		return money;
	}
	
	// set money
	public int setMoney(int cash){
		return this.money;
	}
	
	//returns the starting gear of Character
	public String toString(){
		return ("WEAPON: " + getWeapon() + "\nWARDROBE: " + getWardrobe() + 
			   "\nMONEY: " + getMoney() + " gold" + "\nDATE CREATED: " 
			   + getDateCreated());
	}
}
