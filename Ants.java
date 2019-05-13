public class Ants extends Person{

  private int health = 1;
  private int damage = 1;


  public Ants(){
    health = 1;
    damage = 1;

  }

  public Ants(int health, int damage) {
    this.health = health;
    this.damage = damage;
  }

  public int getHealth() {
    return health;
  }

  public void setHealth(int health) {
    this.health = health;
  }//end of health

  public int getDamage() {
    return damage;
  }

  public void setDamage(int damage) {
    this.damage = damage;
  }//end of damage

}//end of Ants class
