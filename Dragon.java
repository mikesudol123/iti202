public class Dragon extends Person{

	private int health = 10;
	private int damage = 7;


	public Dragon(){
		health = 10
		damage = 7;

	}

  public Dragon(int health, int damage) {

	this.health = health;
	this.damage = damage;

  }
	public void setHealth(int health){
		this.health = health;
	}
	public void setDamage(int damage){
		this.damage = damage;
	}
	public int getHealth(){
		return this.health;
	}
	public int getDamage(){
		return this.damage;
	}
