package sas1.project.demo.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OceanTest
{

    @BeforeEach
    void setUp()
    {


        // initialisere klassen ocean
        char size = 's';
        Ocean generere = new Ocean(size);


    }

    @Test
    void size()
    {
        char size = 's';
        Ocean generer = new Ocean(size);


        assertEquals(100, generer.samletOcean.size() );
    }

    @Test
    void opretHelOcean()
    {
        char size = 's';
        Ocean generer = new Ocean(size);


       int x= 0;
       int y= generer.samletOcean.get(0).getCord().getY();

        assertEquals(0,generer.samletOcean.get(0).getCord().getY() );
        assertEquals(0,generer.samletOcean.get(0).getCord().getX() );

        assertEquals(4,generer.samletOcean.get(4).getCord().getX());
        assertEquals(0,generer.samletOcean.get(4).getCord().getY());

        assertEquals(0,generer.samletOcean.get(10).getCord().getX());
        assertEquals(1,generer.samletOcean.get(10).getCord().getY());

        assertEquals(0,generer.samletOcean.get(20).getCord().getX());
        assertEquals(2,generer.samletOcean.get(20).getCord().getY());

        assertEquals(0,generer.samletOcean.get(40).getCord().getX());
        assertEquals(4,generer.samletOcean.get(40).getCord().getY());

        assertEquals(3,generer.samletOcean.get(33).getCord().getX());
        assertEquals(3,generer.samletOcean.get(33).getCord().getY());

        assertEquals(2,generer.samletOcean.get(42).getCord().getX());
        assertEquals(4,generer.samletOcean.get(42).getCord().getY());

        // relations test

        assertEquals(1, generer.samletOcean.get(0).getSouthEast().getCord().getX());
        assertEquals(1, generer.samletOcean.get(0).getSouthEast().getCord().getY());

        assertEquals(1, generer.samletOcean.get(11).getSouth().getCord().getX());
        assertEquals(2, generer.samletOcean.get(11).getSouth().getCord().getY());

        assertEquals(null, generer.samletOcean.get(0).getNorth());

        assertEquals(null, generer.samletOcean.get(99).getSouth());

    }
}