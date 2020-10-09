package sas1.project.demo.util;

import sas1.project.demo.model.Game;
import sas1.project.demo.model.Hex;
import sas1.project.demo.model.Round;

import java.util.ArrayList;
import java.util.List;


public class RoundCalculator {

    private Attack attack;
    private Movement movement;
    private Game game;
    private int p1MaxMoves;
    private int p2MaxMoves;

    public RoundCalculator(Game game) {
        this.attack = new Attack();
        this.movement = new Movement();
        this.game = game;

    }

    public RoundCalculator(Attack attack, Movement movement) {
        this.attack = attack;
        this.movement = movement;
    }

    public void setRound(){

    }

    public void resolveRound(){
        Speed speed = new Speed();
        p1MaxMoves = speed.speedChange(game.getWind(),game.getRoundP1().getShip());
        p2MaxMoves = speed.speedChange(game.getWind(),game.getRoundP2().getShip());
        for(int i = 0; i < p1MaxMoves; i++){
            resolveMoves(game.getRoundP1());
        }
        game.getRoundP1().setTarget(resolveTarget(game.getRoundP1()));
        for(int j = 0; j < p1MaxMoves; j++){
            resolveMoves(game.getRoundP2());
        }
        game.getRoundP2().setTarget(resolveTarget(game.getRoundP2()));


    }

    private Hex resolveTarget(Round r) {
        Hex h = null;

        return h;
    }

    //Sende 1-3 mulige hexes til UI
    public void resolveMoves(Round r) {
        ArrayList<Hex> movesPos = movement.movement(r.getShip());

    }

    // Modtage Hex fra UI
    public void receiveMove(Hex h){

    }

    public void resolveAttack(){
        for (Hex h : game.getRoundP2().getMovesList()){
            if(h.getCord().compareTo(game.getRoundP1().getTarget().getCord()) == 0){
                attack.setDamage(game.getRoundP1().getShip(),game.getRoundP2().getShip(),40);
            }
        }
        for (Hex h : game.getRoundP1().getMovesList()){
            if(h.getCord().compareTo(game.getRoundP2().getTarget().getCord()) == 0){
                attack.setDamage(game.getRoundP2().getShip(),game.getRoundP1().getShip(),40);
            }
        }
        if( game.getRoundP1().getShip().getHullHP() <= 0 ||
            game.getRoundP1().getShip().getSailors() <= 0 ||
            game.getRoundP1().getShip().getSailsHP() <= 0){
            System.out.println("Player 2 wins!!!!");
        }
        else if(game.getRoundP2().getShip().getHullHP() <= 0 ||
                game.getRoundP2().getShip().getSailors() <= 0 ||
                game.getRoundP2().getShip().getSailsHP() <= 0){
            System.out.println("Player 1 wins!!!!");
        }
        else{
            System.out.println("Game continues");
        }
    }
}
