package sas1.project.demo.model;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input 1 for a small map");
        System.out.println("Input 2 for a medium map");
        System.out.println("Input 3 for a large map");
        System.out.println("Input 0 to exit");
        String i = input.nextLine();
        switch (i) {
            case "1":
                grid.createGrid(10);
                break;
            case "2":
                grid.createGrid(20);
                break;
            case "3":
                grid.createGrid(30);
                break;
            case "0":
                System.exit(0);
            default:
                System.out.println("invalid input, try again");
        }
    }
}
