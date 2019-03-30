
public class Warrior extends Character{

	private boolean shield;		//private variable only for Warrior
	
	//constructor for warrior
	public Warrior(){
		
	}
	
	//default Warrior object
	public Warrior(boolean shield){
		this.shield = true;
		this.weapon = "steel sword";
		this.wardrobe = "heavy steel plated armor";
	}
	
	public Warrior(boolean shield, String we, String wa, int cash){
		this.shield = shield;
		this.weapon = we;
		this.wardrobe = wa;
		setMoney(cash);
	}
	
	//return boolean for shield
	public boolean getShield(){
		return shield;
	}
	
	//return weapon
	public String getWeapon(){
		return weapon;
	}
	
	//return wardrobe
	public String getWardrobe(){
		return wardrobe;
	}
	
	//return info for warrior
	public  void printWarrior(){
		System.out.println("WEAPON: " + getWeapon() + "\nWARDROBE: " + getWardrobe() 
		+ "\nEQUIPED WITH A SHIELD: " + getShield() + "\nMONEY: " + getMoney() 
		+ "gold" + "\nDATE CREATED: " + super.getDateCreated());
	}
}
