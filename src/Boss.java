public class Boss {
    private int health;
    private int damage;
    private  String armorType;

    public Boss(int health, int damage, String armorType) {
        this.health = health;
        this.damage = damage;
        this.armorType = armorType;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setArmorType(String armorType) {
        this.armorType = armorType;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getArmorType() {
        return armorType;
    }
}