
public class Rogue extends Character{
	
	private boolean mask;	//private variable only for Rogue
	
	//Constructor for Rogue
	public Rogue(){
		
	}
	
	//default Rogue object
	public Rogue(boolean mask){
		this.mask = true;
		this.weapon = "dagger";
		this.wardrobe = "black cloak with leather armor";
	}
	
	public Rogue(boolean mask, String we, String wa, int cash){
		this.mask = mask;
		this.weapon = we;
		this.wardrobe = wa;
		setMoney(cash);
	}
	
	//return boolean for mask
	public boolean getMask(){
		return mask;
	}
	
	//return weapon
	public String getWeapon(){
		return weapon;
	}
	
	//return wardrobe
	public String getWardrobe(){
		return wardrobe;
	}
	
	//return info for Rogue
	public  void printRogue(){
		System.out.println("WEAPON: " + getWeapon() + "\nWARDROBE: " + getWardrobe() 
		+ "\nWEARS A MASK: " + getMask() + "\nMONEY: " + getMoney() + "gold" +
		"\nDATE CREATED: " + super.getDateCreated());
	}
}
