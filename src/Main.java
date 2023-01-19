public class Main {
    public static void main(String[] args) {


        Boss boss = new Boss(WeaponType.SWORD, "Galiaf", 50, 600);

        System.out.println(boss.info());

        Skeleton skeleton1 = new Skeleton(WeaponType.BOWANDARROWS, "Skeleton 1",
                10, 50, 50);
        Skeleton skeleton2 = new Skeleton(WeaponType.BOWANDARROWS, "Skeleton 2",
                13, 50, 35);
        System.out.println(skeleton1.info());
        System.out.println(skeleton2.info());

    }


}