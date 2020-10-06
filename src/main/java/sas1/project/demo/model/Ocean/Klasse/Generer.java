package sas1.project.demo.model.Ocean.Klasse;

// skal importere klasserne hex og koordinat til oprettelse af liste som indeholder en masse
// delobjekter af ocean til samlet.

import sas1.project.demo.model.Cord;
import sas1.project.demo.model.Hex;

import java.util.ArrayList;

public class Generer
{
    // opretter tom ArrayListe til oprettelse af tomme objekter
    ArrayList<Hex> samletOcean = new ArrayList<>();

    int x;
    int y;

    public void size(int x, int y){

        this.x = x;
        this.y = y;
    }

    // en metode der opretter de tomme hex objekter til af fylde med information
    // input x og y giver størrelsen af listen med objekter
    public void OpretHelOcean()
    {

        // et forloop der iterere gennem og opretter hex objekter indtil y længde er fuldført
        for (int i = 0; i < y; i++)
        {
            //nested forloop med x coordinat længde verticale værdier
            for (int j = 0; j < x; j++)
            {
                samletOcean.add(new Hex(new Cord(j, i)));

            }
        }
    }
        // skal have en metode der gør det muligt for objekterne i Ocean at vide hvilke objekter der
        // ligger nærliggende


        // lav en if else på hver retning som først checker om retningen går ud over den acceptable grænse.
        // hvis den ikke går ud over grænsen så sæt den pågældende værdi
        public void hexNaboRelation(){

        for(Hex hexObj: samletOcean){


            if (hexObj.getCord().getX()%2==0){
                //checker om current hexobj x coordinat er heltal og sætter så x og y til +1
                for(Hex tempHex: samletOcean){
                    if(tempHex.getCord().getX()==hexObj.getCord().getX()+1
                            && tempHex.getCord().getY()==hexObj.getCord().getY()+1){
                        hexObj.setSouthEast(tempHex);
                        break;
                    }
                }
            }
            // checker om current hexobj x coordinat er ulige tal (rest ved modulus 2) så sæt x +1
            if(hexObj.getCord().getX()%2==0){
                hexObj.setSouthEast(hexObj.getCord().getX()+1,hexObj.getCord().getY());
            }

        }
    }

// seperat metode der skal finde ud af om top coordinat matcher med et andet object i listen
    // x=this og y=this-1
    public void relationNorth(){

        for(Hex hexObj: samletOcean){
            for(Hex tempHexObj: samletOcean){
                if(tempHexObj.getCord().getY()==hexObj.getCord().getY()-1 &&
                tempHexObj.getCord().getX()==hexObj.getCord().getX()){
                    hexObj.setNorth(tempHexObj);
                }
            }
        }
    }
            // metode der skal sætte setsouth som matcher temp hex object coordinater med
            // de ønskede koordinater
    public void relationSouth(){

        for(Hex hexObj: samletOcean){
            for(Hex tempHexObj: samletOcean){
                if(tempHexObj.getCord().getY()==hexObj.getCord().getY()+1 &&
                        tempHexObj.getCord().getX()==hexObj.getCord().getX()){
                    hexObj.setSouth(tempHexObj);
                }
            }
        }
    }

}

