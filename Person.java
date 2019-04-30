package knight;

public abstract class Person {

	private int health;
	private int damage;
	private int defense;
	
	private abstract int getHealth();
	private abstract int getDamage();
	private abstract int getDefense();
	private abstract void setHealth();
	private abstract void setDamage();
	private abstract void setDefense();
}
