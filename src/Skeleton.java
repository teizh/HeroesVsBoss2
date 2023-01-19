public class Skeleton extends Boss2{
    private int numberOfArrows;
    public Skeleton(WeaponType weaponType, String name, int damage, int health, int numberOfArrows) {
        super(weaponType, name, damage, health);

        this.setNumberOfArrows(numberOfArrows);
    }


    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }

    public String info() {

        return super.info()+" Number of arrows: "+this.numberOfArrows;
    }

}
