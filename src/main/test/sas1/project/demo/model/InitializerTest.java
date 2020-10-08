package sas1.project.demo.model;

import org.junit.jupiter.api.Test;
import sas1.project.demo.model.Ocean.Klasse.Ocean;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class InitializerTest {

    @Test
    void sizeTest(){
        String[] sizes = new String[3];
        sizes[0] = "s";
        sizes[1] = "m";
        sizes[2] = "l";
        Ocean ocean;
        for (int i = 0; i < sizes.length; i++) {
            switch (sizes[i]) {
                case "s":
                    ocean = new Ocean(10, 10);
                    assertEquals((10 * 10), ocean.getSamletOcean().size());
                case "m":
                    ocean = new Ocean(20, 20);
                    assertEquals((20 * 20), ocean.getSamletOcean().size());
                case "l":
                    ocean = new Ocean(40, 40);
                    assertEquals((40 * 40), ocean.getSamletOcean().size());
            }
        }
    }

}