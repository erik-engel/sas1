package sas1.project.demo.model.Ocean.Klasse;

// skal importere klasserne hex og koordinat til oprettelse af liste som indeholder en masse
// delobjekter af ocean til samlet.

import sas1.project.demo.model.Cord;
import sas1.project.demo.model.Hex;

import java.util.ArrayList;

public class Ocean
{
    // opretter tom ArrayListe til oprettelse af tomme objekter
    ArrayList<Hex> samletOcean = new ArrayList<>();

    private int oceanx;
    private int oceanY;


    // en metode der opretter de tomme hex objekter til af fylde med information
    // input x og y giver størrelsen af listen med objekter
    public void OpretHelOcean(int x, int y)
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

        hexNaboRelation();
    }
        // skal have en metode der gør det muligt for objekterne i Ocean at vide hvilke objekter der
        // ligger nærliggende


        // lav en if else på hver retning som først checker om retningen går ud over den acceptable grænse.
        // hvis den ikke går ud over grænsen så sæt den pågældende værdi
        private void hexNaboRelation(){

        for(Hex hexObj: samletOcean){
            //dette loop gennemgås med hvert punkt, for at finde det punkts naboer


            relationNorth(hexObj);//her findes naboen nordfor
            relationSouth(hexObj);//her findes naboen sydfor
            relationSider(hexObj, hexObj.getCord().getX()%2);//her findes de resterende naboer

            // checker om current hexobj x coordinat er ulige tal (rest ved modulus 2) så sæt x +1

        }

    }

// seperat metode der skal finde ud af om top coordinat matcher med et andet object i listen
    // x=this og y=this-1
    private void relationNorth(Hex hexObj){
            for(Hex tempHexObj: samletOcean){
                if(tempHexObj.getCord().getY()==hexObj.getCord().getY()-1 &&
                tempHexObj.getCord().getX()==hexObj.getCord().getX()){
                    hexObj.setNorth(tempHexObj);//punktets nordlige nabo findes baseret på forholdet mellem fælterne
                    break;
                }
            }
    }

    private void relationSouth(Hex hexObj){
            for(Hex tempHexObj: samletOcean){
                if(tempHexObj.getCord().getY()==hexObj.getCord().getY()+1 &&
                        tempHexObj.getCord().getX()==hexObj.getCord().getX()){
                    hexObj.setSouth(tempHexObj);//punktets sydlige nabo findes baseret på forholdet mellem fælterne
                    break;
                }
            }
    }

    private void relationSider(Hex hexObj, int d){
        /*for at finde de resterende naboer er det nødvendigt at vide,
        hvorvidt feltets x-værdi er lige eller ulige, da vi anvender et forskudt grid.
        int d vil være lig 0 ved lige x-værdier, og lig 1 ved ulige x-værdier.
        den måde vores grid er forskudt på gør at hvert felt har to naboer til hver side,
        men kun en nabo på hver side ligger på samme række/y-værdi.
        de ulige kolonner vil derfor ligge på række med sine sydlige naboer til siden,
        mens de like kolonner ligger på række med de nordlige naboer til siden.
        derfor må de ulige kolonners nordlige naboer ligge på rækken nordfor,
        mens de lige kolonners sydlige naboer ligger på rækken sydfor.
        da y-værdier bliver mindre jo længere mod nord man bevæger sig,
        og de ulige kolonner er rykket et halvt felt nordligt,
        vil hver nabo til siderne have en y-værdi som er 1 lavere for en ulige kolonne end en lige kolonne.
        denne forskæl opnås ved at anvende modulo 2 af feltets x-værdi i beregningen.*/
            for(Hex tempHexObj: samletOcean) {
                if (tempHexObj.getCord().getY() == hexObj.getCord().getY() - d &&
                        tempHexObj.getCord().getX() == hexObj.getCord().getX() - 1) {
                    hexObj.setNorthWest(tempHexObj);
                    break;
                }
            }
            for(Hex tempHexObj: samletOcean) {
                if (tempHexObj.getCord().getY() == hexObj.getCord().getY() - d &&
                        tempHexObj.getCord().getX() == hexObj.getCord().getX() + 1) {
                    hexObj.setNorthEast(tempHexObj);
                    break;
                }
            }
            for(Hex tempHexObj: samletOcean) {
                if (tempHexObj.getCord().getY() == hexObj.getCord().getY() + 1 - d &&
                        tempHexObj.getCord().getX() == hexObj.getCord().getX() - 1) {
                    hexObj.setSouthWest(tempHexObj);
                    break;
                }
            }
            for(Hex tempHexObj: samletOcean) {
                if(tempHexObj.getCord().getY()==hexObj.getCord().getY() + 1 - d &&
                        tempHexObj.getCord().getX()==hexObj.getCord().getX()+1){
                    hexObj.setSouthEast(tempHexObj);
                    break;
                }
            }

    }
}
    /*original kode til at finde én nabo, gemmes som sikkerhedsanordning:
    if (hexObj.getCord().getX()%2==0){
                //checker om current hexobj x coordinat er heltal og sætter så x og y til +1
                for(Hex tempHex: samletOcean){
                    if(tempHex.getCord().getX()==hexObj.getCord().getX()+1
                            && tempHex.getCord().getY()==hexObj.getCord().getY()+1){
                        hexObj.setSouthEast(tempHex);
                        break;
                    }
                }
            }*/




