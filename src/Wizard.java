
public class Wizard extends Character{

	private boolean book;		//private variable only for wizard
	
	//constructor for wizard
	public Wizard(){
		
	}
	
	//default Wizard object
	public Wizard(boolean book){
		this.book = false;
		this.weapon = "Pyro-Mancer's staff";
		this.wardrobe = "Mystical robes";
	}
	
	public Wizard(boolean book, String we, String wa, int cash){
		this.book = book;
		this.weapon = we;
		this.wardrobe = wa;
		setMoney(cash);
	}
	
	//return boolean for book
	public boolean getBook(){
		return book;
	}
	
	//return weapon
	public String getWeapon(){
		return weapon;
	}
	
	//return wardrobe
	public String getWardrobe(){
		return wardrobe;
	}
	
	//return info for wizard
	public  void printWizard(){
		System.out.println("WEAPON: " + getWeapon() + "\nWARDROBE: " + getWardrobe() 
		+ "\nCARRIES SPELL BOOK: " + getBook() + "\nMONEY: " + getMoney() + "gold"
		+ "\nDATE CREATED: " + super.getDateCreated());
	}
}
