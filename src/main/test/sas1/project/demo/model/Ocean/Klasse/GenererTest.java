package sas1.project.demo.model.Ocean.Klasse;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GenererTest extends Generer
{

    @BeforeEach
    void setUp()
    {


        // initialisere klassen ocean
        Generer generere = new Generer();

        // kalder metoderne der opretter Ocean
        generere.OpretHelOcean(5,5);

        // kalder metoderne der laver relationerne
        generere.hexNaboRelation();
    }

    @Test
    void size()
    {
        Generer generer = new Generer();

        generer.OpretHelOcean(5,5);
        assertEquals(25, generer.samletOcean.size() );
    }

    @Test
    void opretHelOcean()
    {
        Generer generer = new Generer();
        generer.OpretHelOcean(5,5);

        assertTrue(0,generer.samletOcean.get(0).getCord().getX());

    }

    @Test
    void hexNaboRelation()
    {
    }
}