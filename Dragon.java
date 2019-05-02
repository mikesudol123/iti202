public class Dragon extends Person{
	
	private int health;
	private int damage;
	private int defense;
	  
	
  public Dragon(int health, int damage, int defense) { 
	
	this.health = health; 
	this.damage = damage;
	this.defense = defense; 
  }
	public void setHealth(int health){
		this.health = health; 
	}
	public void setDamage(int damage){
		this.damage = damage;
	}
	public void setDefense(int defense){
		this.defense = defense;
	}
	public int getHealth(){
		return this.health;
	}
	public int getDamage(){
		return this.damage;
	}
	public int getDefense(){
		return this.defense;
	}
