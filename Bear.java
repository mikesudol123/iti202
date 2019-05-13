public class Bear extends Person {

	private int health = 5;
	private int damage = 5;

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
	}//health

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
	}//damage



}//end of Bear
