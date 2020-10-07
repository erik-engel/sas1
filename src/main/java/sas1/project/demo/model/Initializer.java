package sas1.project.demo.model;

import sas1.project.demo.model.Ocean.Klasse.Ocean;

import java.util.Scanner;

public class Initializer {
    public static void main(String[] args) {
        Initialize();
    }

    public static void Initialize() {
        Scanner input = new Scanner(System.in);
        System.out.println("Choose size: input 's' for small, 'm' for medium or 'l' for large");
        String size = input.nextLine().toLowerCase();
        Ocean ocean = new Ocean();
        switch (size){
            case "s":
                ocean = new Ocean(10,10);
                break;
            case "m":
                ocean = new Ocean(20,20);
                break;
            case "l":
                ocean = new Ocean(40,40);
                break;
        }
        System.out.println(ocean.getSamletOcean().size());
    }
}
