package sas1.project.demo.model;

import java.util.Random;

public class GunControl {
    private int damage;

    public int getDamage() {
        return damage;
    }

    public void setDamage(Ship ship, Ammunition ammo) {
        Random rand = new Random();
        int roll = rand.nextInt(20) + 1;

        switch (roll){
            case 1:
                this.damage = ammo.getCritEffect(0);
            break;
            case 2:
                this.damage = ammo.getCritEffect(1);
            break;
            default:
                this.damage = ship.currentGunCapacity() / 2;
            break;
        }
    }
}
