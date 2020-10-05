package sas1.project.demo.model;

import java.util.ArrayList;

public class grid {
    public static void createGrid (int size){
        ArrayList<cords> cordList = new ArrayList<>();
        int t = size;
        for(int i = 0; i < t; i++){
            for(int j = 0; j < t; j++){
                cords temp = new cords(i,j);
                cordList.add(temp);
            }
        }
        System.out.println(cordList);
        ArrayList<hex> hexes = new ArrayList<>();
        for(int i = 0; i < cordList.size(); i++){
            cords temp = cordList.get(i);
            hex t2 = new hex(temp,null,null,null,null,null,null);
            hexes.add(t2);
        }
        /*for(int i = 0; i < hexes.size(); i++){
            hex t1 = hexes.get(i);
            cords temp = t1.getX();
            //nord
            int north = temp.getX() - 1;
            cords tempN = (temp.setX(north)),temp.setY(temp.getY()));
            //syd


        }*/

    }

    /*public hex find(){
        for

        return null;
    }*/
}
