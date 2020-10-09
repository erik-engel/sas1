package sas1.project.demo.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WindTest
{
    Wind wind;

    @BeforeEach
    void windTestSetup(){
        wind = new Wind(12, "N",7);
    }


    @Test
    void getNewWindDirectionTest()
    {
        wind.getNewWindAttributes();

        boolean res = wind.getWindDirection().equals("N")||
                wind.getWindDirection().equals("SE")||
                wind.getWindDirection().equals("SW")||
                wind.getWindDirection().equals("NE")||
                wind.getWindDirection().equals("NW");

        assertTrue(res);

        wind.setWindDirection("S");
        wind.getNewWindAttributes();

        boolean res1 = wind.getWindDirection().equals("S")||
                wind.getWindDirection().equals("SE")||
                wind.getWindDirection().equals("SW")||
                wind.getWindDirection().equals("NE")||
                wind.getWindDirection().equals("NW");

        assertTrue(res1);
// har lavet nogel udprint for at sikre værdien af wind direction faktisk ændre sig

        wind.getNewWindAttributes();
        System.out.println(wind.getWindDirection());

        wind.getNewWindAttributes();
        System.out.println(wind.getWindDirection());

        wind.getNewWindAttributes();
        System.out.println(wind.getWindDirection());


    }

    @Test
    void WindSpeedChangeTest(){
    //tester på windspeed 7 "må ikke gå over 8
        wind.getNewWindAttributes();

        boolean windSpeed = wind.getWindSpeed()==0 || wind.getWindSpeed()==5 ||
                wind.getWindSpeed()==6 || wind.getWindSpeed()==7 || wind.getWindSpeed()==8;

        System.out.println(wind.getWindSpeed());
        assertTrue(windSpeed);

        // tester på windspeed 5 " 3-7
        wind.setWindSpeed(5);

        boolean windSpeed1 = wind.getWindSpeed()==0 || wind.getWindSpeed()==3 ||
                wind.getWindSpeed()==4 || wind.getWindSpeed()==5 || wind.getWindSpeed()==6
                || wind.getWindSpeed()==7;

        System.out.println(wind.getWindSpeed());
        assertTrue(windSpeed1);

        //tester på windspeed 1 " må ikke gå under 0 eller over 3
        wind.setWindSpeed(1);

        boolean windSpeed3 = wind.getWindSpeed()==0 || wind.getWindSpeed()==1 ||
                wind.getWindSpeed()==2 || wind.getWindSpeed()==3;

        assertTrue(windSpeed3);
        System.out.println(wind.getWindSpeed());
    }

}