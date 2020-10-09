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
        // If else med switch på hitChance, for at se om den skal gå ind i i 40% eller 10%
        if(hitChance == 40){
            /* Henter selected ammo på skibet, som bliver opdateret inden vi for skibet som parameter. ud fra hvilken amme der er valgt,
            går den ind i den givne case 1 = Canonball 2 = Chain og 3 = Grape Shot. Dernæst laver den random roll (1-20)
            som inner switchen køre på og går ind i case 1 eller 2 hvis der crittes og ellers overfører almindelig skade på alt over 2*/
            switch (attackerShip.getSelectedAmmo()) {
                case 1:
                    switch (roll) {
                        case 1: // CanonBall
                            // crittes der med 1 Sprænger skibet i luften og derfor sættes hullHp til 0 og skibet synker.
                            targetShip.setHullHP(0);
                            break;
                        case 2:
                            // Hvis canonball critter med 2 sættes can turn til false da det ødelægger roret
                            targetShip.setCanTurn(false);
                            break;
                        default:
                            // dividere med 2 så det kun er canons fra den ene side, da currentGunCapacity tager udgangspunkt i alle canons, ganger capacity med
                            // den givne hit chance for at beregne damage, dernæst trækkes den fra den nuværende mængde.
                            targetShip.setHullHP(targetShip.getHullHP()-(int) Math.ceil((attackerShip.currentGunCapacity() / 2) * 0.4));
                            break;
                    }
                    break;
                case 2: // Chain Shot
                    switch (roll) {
                        case 1:
                            // Crittes der med 1 sættes sailsHP til 0 og skibet synker
                            targetShip.setSailsHP(0);
                            break;
                        case 2:
                            // crittes der med 2 ganges nuværende sailsHP med 0.66 for at fjerne 33% af sails
                            targetShip.setSailsHP((int) Math.ceil(targetShip.getSailsHP() * 0.66));
                            break;
                        default:
                            // dividere med 2 så det kun er canons fra den ene side, da currentGunCapacity tager udgangspunkt i alle canons, ganger capacity med
                            // den givne hit chance for at beregne damage, dernæst trækkes den fra den nuværende mængde.
                            targetShip.setSailsHP(targetShip.getSailsHP()-(int) Math.ceil((attackerShip.currentGunCapacity() / 2) * 0.4));
                            break;
                    }
                    break;
                case 3: // Grape Shot
                    switch (roll) {
                        case 1:
                            // Hvis der crittes med 1 så divideres nuværende sailors med 2 da den slår halvdelen af sailors ihjel
                            targetShip.setSailors(targetShip.getSailors() / 2);
                            break;
                        case 2:
                            // Crittes der med 2 ganges nuværende sailors med 0.75 da der skal fjernes 25 %
                            targetShip.setSailors((int) Math.ceil(targetShip.getSailors() * 0.75));
                            break;
                        case 3:
                            /* dividere med 2 så det kun er canons fra den ene side, da currentGunCapacity tager udgangspunkt i alle canons, ganger capacity med
                             den givne hit chance for at beregne damage, dernæst trækkes den fra den nuværende mængde. */
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
                            targetShip.setSailsHP((int) Math.ceil(targetShip.getSailsHP() * 0.66));
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
                            targetShip.setSailors((int) Math.ceil(targetShip.getSailors() * 0.75));
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
