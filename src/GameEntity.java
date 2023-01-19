public class GameEntity {
    private String name;
    private static int health;
    private static int damage;
    private static WeaponType weaponType;


    public  WeaponType getWeaponType() {

        return weaponType;
    }

    public void setWeaponType(WeaponType weaponType) {
        GameEntity.weaponType = weaponType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public  int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public  int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
