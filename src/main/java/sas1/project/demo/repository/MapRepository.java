package sas1.project.demo.repository;

import java.sql.PreparedStatement;

public class MapRepository
{
    // denne class skal have metoder der skal kunne gemme information omkring højde og bredte om current map
    // den skal så kunne kaldes på igen ved load, og sendes til map classen der oprettet et ocean ud fra specifikationerne


    public void createMapSave(String SaveName){
        String sql = "INSERT INTO "

        try{
            PreparedStatement psMapSave = conn.PrepareStatement(sql);
            psMapSave.setArray(1,mapObject);

        }
    }

    // skal have metode der kan get valgt ArrayListe af map til reinitialisering

}
