package sas1.project.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Movement
{

    // hvor kan skiber rykke hen
    // udregne mulige ryk ud fra direction
    //Ship ship = new Ship();

    //finde ship speed
    // finde ud af om det muligt at dreje "boolean fra ship skal sættes false eller true
    // hvis antal mulige ryk er brugt


    // gemme temp objects med ryk


    public static List<Hex> movement(Ship ship){
        ArrayList<Hex> newHex = new ArrayList<>();
        switch(ship.getDirection()){
            case N:
                newHex.add(ship.getPosition().getNorth());
                if (ship.getNumberOfTurns() > 0){
                    newHex.add(ship.getPosition().getNorthEast());
                    newHex.add(ship.getPosition().getNorthWest());
                }
                break;
            case S:
                newHex.add(ship.getPosition().getSouth());
                if (ship.getNumberOfTurns() > 0){
                    newHex.add(ship.getPosition().getSouthEast());
                    newHex.add(ship.getPosition().getSouthWest());
                }
                break;
            case NE:
                newHex.add(ship.getPosition().getNorthEast());
                if (ship.getNumberOfTurns() > 0){
                    newHex.add(ship.getPosition().getSouthEast());
                    newHex.add(ship.getPosition().getNorth());
                }
                break;
            case NW:
                newHex.add(ship.getPosition().getNorthWest());
                if (ship.getNumberOfTurns() > 0){
                    newHex.add(ship.getPosition().getNorth());
                    newHex.add(ship.getPosition().getSouthWest());
                }
                break;
            case SE:
                newHex.add(ship.getPosition().getSouthEast());
                if (ship.getNumberOfTurns() > 0){
                    newHex.add(ship.getPosition().getNorthEast());
                    newHex.add(ship.getPosition().getSouth());
                }
                break;
            case SW:
                newHex.add(ship.getPosition().getSouthWest());
                if (ship.getNumberOfTurns() > 0){
                    newHex.add(ship.getPosition().getSouth());
                    newHex.add(ship.getPosition().getNorthWest());
                }
                break;
        }
return newHex;
        //currentSpeed, numberOfTurns, position, direction,
    }

}
