public class Main {
    public static void main(String[] args) {
      /*  Boss boss = new Boss(600, 50, "Physical");
        System.out.println("Boss's health: " + boss.getHealth() + "; damage: "
                + boss.getDamage() + "; armor type: " + boss.getArmorType());

        for (int i = 0; i < createHeroes().length; i++) {
            Hero hero = createHeroes()[i];
            System.out.println(hero.getName() + " Health: " + hero.getHealth() + " Damage: " + hero.getDamage());
        }
*/
        Boss2 boss2=new Boss2(WeaponType.SWORD, "Galiaf", 50, 600);
        System.out.println("Boss's health: " + boss2.getHealth() + "; damage: "
                + boss2.getDamage() + "; Weapon "+ boss2.getWeaponType() );



    }


    public static Hero[] createHeroes() {


        // reshil nazvat geroev  s bol'shoi bukvy (ne snimaite baly pojaluista)
        Hero Archer = new Hero("Archer! ", 200, 20, "Arrow of Justice!");
        Hero Jagernaut = new Hero("Jagernaut! ", 300, 10);
        Hero Healer = new Hero("Healer! ", 200, 0, "Heal a friend");

        Hero[] heroes = new Hero[3];
        heroes[0] = Archer;
        heroes[1] = Jagernaut;
        heroes[2] = Healer;


        return heroes;
    }


}