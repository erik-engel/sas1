package sas1.project.demo.model.Ocean.Klasse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class oceanTest extends OceanGenerering
{

    @BeforeEach
    void setUp()
    {


        // initialisere klassen ocean
        OceanGenerering generere = new OceanGenerering();

        // kalder metoderne der opretter Ocean
        generere.OpretHelOcean(5,5);

        // kalder metoderne der laver relationerne
        generere.hexNaboRelation();
    }

    @Test
    void size()
    {
        OceanGenerering generer = new OceanGenerering();
        generer.OpretHelOcean(5,5);

        assertEquals(25, generer.samletOcean.size() );
    }

    @Test
    void opretHelOcean()
    {
        OceanGenerering generer = new OceanGenerering();
        generer.OpretHelOcean(5,5);

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
        assertEquals(4,generer.samletOcean.get(22).getCord().getY());

        // relations test

        assertEquals(1, generer.samletOcean.get(0).getSouthEast().getCord().getX());
        assertEquals(1, generer.samletOcean.get(0).getSouthEast().getCord().getY());

        assertEquals(1, generer.samletOcean.get(6).getSouth().getCord().getX());
        assertEquals(2, generer.samletOcean.get(6).getSouth().getCord().getY());

    }
}