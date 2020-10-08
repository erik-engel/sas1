package sas1.project.demo.model;

import java.util.Random;

public class GunControl {
    private int damage;

    public int getDamage() {
        return damage;
    }

    //set to public because its needed for tests to be run
    public int getRandomNumber(){
        Random rand = new Random();
        return rand.nextInt(20) + 1;
    }

    public void setDamage(Ship ship, Ammunition ammo) {
        Random rand = new Random();
        // int random mellem 1-20 fro at se om der crittes ved 1 & 2 eller over 2 som er almindelig canon damage pr canon.
        int roll = getRandomNumber();//rand.nextInt(20) + 1;
        // switch på ternings roll som bestemmer damage på modstander skib, ammunition skal opdateres så man kan få criteffect fra listen
        switch (roll){
            case 1:
                this.damage = ammo.getCritEffect().get(0);
            break;
            case 2:
                this.damage = ammo.getCritEffect().get(1);
            break;
            default:
                // dividere med 2 så det kun er canons fra den ene side, da currentGunCapacity tager udgangspunkt i alle canons
                this.damage = ship.currentGunCapacity() / 2;
            break;
        }
    }
}
