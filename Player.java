public class Player extends Person {

    private int health = 25;
    private int damage = 5;

    public Player(){
      health = 25;
      damage = 5;

    }

    public Player(int health, int damage)
    {
      this.health = health;
      this.damage = damage;
    }
    public int getHealth()
    {
      return health;
    }
    public void setHealth(int health)
    {
      this.health = health;
    }//health

    public int getDamage()
    {
      return damage;
    }
    public void setDamage(int damage)
    {
      this.damage = damage;
    }//damage


  }//end of Player






