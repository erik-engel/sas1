package sas1.project.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sas1.project.demo.model.*;

@SpringBootApplication
public class ShipsAndSailsApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShipsAndSailsApplication.class, args);
        Player p1 = new Player(1,"Ole");
        Player p2 = new Player(2,"Harley");
        Ship shipP1 = new Ship(1, "shipBrig",1, new Hex(new Cord(1,2)), 2, 2, 2,2, 2, 2,2,2);
        Ship shipP2 = new Ship(2, "shipBrig",2, new Hex(new Cord(4,4)), 2, 2, 2,2, 2, 2,2,2);
        Round roundP1 = new Round();
        Round roundP2 = new Round();
        Game game1 = new Game(1,new Ocean('m'),new Wind(1,"North",7),roundP1,roundP2);

    }

}
