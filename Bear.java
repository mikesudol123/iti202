public class Bear extends Person {

	private int health;
	private int damage;
	private int defense;

	public Bear(int health)
	{
		this.health = health;
	}
	public int getHealth() 
	{
		return health;
	}
	public void setHealth(int health) 
	{
		this.health = health;
	}

	public Bear(int damage)
	{
		this.damage = damage;
	}
	public int getDamage() 
	{
		return damage;
	}
	public void setDamage(int damage) 
	{
		this.damage = damage;
	}

	public Bear(int defense)
	{
		this.defense = defense;
	}
	public int getDefense() 
	{
		return defense;
	}
	public void setDefense(int defense) 
	{
		this.defense = defense;
	}

}//end of Bear
