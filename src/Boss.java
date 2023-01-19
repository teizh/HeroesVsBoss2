public class Boss extends GameEntity {

    public Boss(WeaponType weaponType, String name, int damage, int health) {
        super();
        this.setWeaponType(weaponType);
        this.setName(name);
        this.setDamage(damage);
        this.setHealth(health);
    }

    public String info() {

        return super.info();
    }
}
