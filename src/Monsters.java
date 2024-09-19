//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Monsters{
    private double strength;
    private double health;

    public static void main(String[] args) {
        Monsters Ogre = new Monsters(25.0, 60.0);
        Monsters Giant = new Monsters(15.0, 100.0);

        System.out.println(Giant.getHealth());
        while (Ogre.isAlive() && Giant.isAlive()){
           Giant.takeDamage(Ogre.attack());
           Ogre.takeDamage((Giant.attack()));
           System.out.println(Giant.getHealth() + " " + Ogre.getHealth());
        }

        if (Ogre.isAlive()){
            System.out.println("Ogre is alive!");
        }
        else if (Giant.isAlive()){
            System.out.println("Giant is alive!");
        }
        else {
            System.out.println("Both have died");
        }

    }

    public Monsters(double strength, double health){
        this.strength = strength;
        this.health = health;
    }

    public boolean isAlive(){
        if (getHealth() > 0){
            return true;
        }
        return false;
    }

    public double attack(){
        return strength * Math.random();
    }

    public double takeDamage(double damage){
       return health -= damage;
    }

    public double getHealth(){
        return health;
    }
}