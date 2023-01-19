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

        System.out.println(boss2.info());

        Skeleton skeleton1=new Skeleton(WeaponType.BOWANDARROWS, "Skeleton 1",
                10, 50, 50);
        Skeleton skeleton2=new Skeleton(WeaponType.BOWANDARROWS, "Skeleton 2",
                13, 50, 35);
        System.out.println(skeleton1.info());
        System.out.println(skeleton2.info());

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