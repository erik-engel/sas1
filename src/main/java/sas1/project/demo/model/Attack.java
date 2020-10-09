package sas1.project.demo.model;

import java.util.Random;

public class Attack {
    private int damage;

    public int getDamage() {
        return damage;
    }

    //set to public because its needed for tests to be run
    public int getRandomNumber(){
        Random rand = new Random();
        return rand.nextInt(20) + 1;
    }

    public void setDamage(Ship attackerShip, Ship targetShip, int hitChance) {
        // int random mellem 1-20 fro at se om der crittes ved 1 & 2 eller over 2 som er almindelig canon damage pr canon.
        int roll = getRandomNumber();//rand.nextInt(20) + 1;
        // switch på ternings roll som bestemmer damage på modstander skib, ammunition skal opdateres så man kan få criteffect fra listen
        if(hitChance == 40){
            switch (attackerShip.getSelectedAmmo()) {
                case 1:
                    switch (roll) {
                        case 1:
                            targetShip.setHullHP(0);
                            break;
                        case 2:
                            targetShip.setCanTurn(false);
                            break;
                        default:
                            // dividere med 2 så det kun er canons fra den ene side, da currentGunCapacity tager udgangspunkt i alle canons
                            targetShip.setHullHP(targetShip.getHullHP()-(int) Math.ceil((attackerShip.currentGunCapacity() / 2) * 0.1));
                            break;
                    }
                    break;
                case 2:
                    switch (roll) {
                        case 1:
                            targetShip.setSailsHP(0);
                            break;
                        case 2:
                            targetShip.setSailsHP((int)(targetShip.getSailsHP() * 0.66));
                            break;
                        default:
                            targetShip.setSailsHP(targetShip.getSailsHP()-(int) Math.ceil((attackerShip.currentGunCapacity() / 2) * 0.4));
                            break;
                    }
                    break;
                case 3:
                    switch (roll) {
                        case 1:
                            targetShip.setSailors(targetShip.getSailors() / 2);
                            break;
                        case 2:
                            targetShip.setSailors(targetShip.getSailors() / 4);
                            break;
                        case 3:
                            targetShip.setSailors(targetShip.getSailors()-(int) Math.ceil((attackerShip.currentGunCapacity() / 2) * 0.4));
                            break;
                    }
                    break;
                default:
                    break;
            }
            } else {
            switch (attackerShip.getSelectedAmmo()) {
                case 1:
                    switch (roll) {
                        case 1:
                            targetShip.setHullHP(0);
                            break;
                        case 2:
                            targetShip.setCanTurn(false);
                            break;
                        default:
                            // dividere med 2 så det kun er canons fra den ene side, da currentGunCapacity tager udgangspunkt i alle canons
                            targetShip.setHullHP(targetShip.getHullHP()-(int) Math.ceil((attackerShip.currentGunCapacity() / 2) * 0.1));
                            break;
                    }
                    break;
                case 2:
                    switch (roll) {
                        case 1:
                            targetShip.setSailsHP(0);
                            break;
                        case 2:
                            targetShip.setSailsHP((int)(targetShip.getSailsHP() * 0.66));
                            break;
                        default:
                            targetShip.setSailsHP(targetShip.getSailsHP()-(int) Math.ceil((attackerShip.currentGunCapacity() / 2) * 0.1));
                            break;
                    }
                    break;
                case 3:
                    switch (roll) {
                        case 1:
                            targetShip.setSailors(targetShip.getSailors() / 2);
                            break;
                        case 2:
                            targetShip.setSailors(targetShip.getSailors() / 4);
                            break;
                        case 3:
                            targetShip.setSailors(targetShip.getSailors()-(int) Math.ceil((attackerShip.currentGunCapacity() / 2) * 0.1));
                            break;
                    }
                    break;
                default:
                    break;
            }
        }
    }
}
