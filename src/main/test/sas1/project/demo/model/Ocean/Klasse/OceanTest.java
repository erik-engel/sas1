package sas1.project.demo.model.Ocean.Klasse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OceanTest
{

    @BeforeEach
    void setUp()
    {


        // initialisere klassen ocean
        Ocean generere = new Ocean(5,5);


    }

    @Test
    void size()
    {
        Ocean generer = new Ocean(5,5);


        assertEquals(25, generer.samletOcean.size() );
    }

    @Test
    void opretHelOcean()
    {
        Ocean generer = new Ocean(5,5);


       int x= 0;
       int y= generer.samletOcean.get(0).getCord().getY();

        assertEquals(0,generer.samletOcean.get(0).getCord().getY() );
        assertEquals(0,generer.samletOcean.get(0).getCord().getX() );

        assertEquals(4,generer.samletOcean.get(4).getCord().getX());
        assertEquals(0,generer.samletOcean.get(4).getCord().getY());

        assertEquals(0,generer.samletOcean.get(5).getCord().getX());
        assertEquals(1,generer.samletOcean.get(5).getCord().getY());

        assertEquals(0,generer.samletOcean.get(10).getCord().getX());
        assertEquals(2,generer.samletOcean.get(10).getCord().getY());

        assertEquals(0,generer.samletOcean.get(20).getCord().getX());
        assertEquals(4,generer.samletOcean.get(20).getCord().getY());

        assertEquals(3,generer.samletOcean.get(18).getCord().getX());
        assertEquals(3,generer.samletOcean.get(18).getCord().getY());

        assertEquals(2,generer.samletOcean.get(22).getCord().getX());
        assertEquals(4,generer.samletOcean.get(2200).getCord().getY());

        // relations test

        assertEquals(1, generer.samletOcean.get(0).getSouthEast().getCord().getX());
        assertEquals(1, generer.samletOcean.get(0).getSouthEast().getCord().getY());

        assertEquals(1, generer.samletOcean.get(6).getSouth().getCord().getX());
        assertEquals(2, generer.samletOcean.get(6).getSouth().getCord().getY());

        assertEquals(null, generer.samletOcean.get(0).getNorth());

        assertEquals(null, generer.samletOcean.get(24).getSouth());

    }
}