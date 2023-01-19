public class Hero {
    private String name;
    private int health;
    private int damage;
    private String superpower;

    public Hero(String name,int health, int damage, String superpower) {
        this.name=name;
        this.health = health;
        this.damage = damage;
        this.superpower = superpower;
    }

    public Hero(String name,int health, int damage) {
        this.name=name;
        this.health = health;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperpower() {
        return superpower;
    }
}