/*
 * Course: CSC1110 - 131
 * Fall 2023
 * Homework 8
 * Name: Andrew Keenan
 * Last Updated: 10-18-23
 */
package keenana;

import java.util.Scanner;

/**
 * the elevator driver
 */
public class ElevatorDriver {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Elevator elevator = new Elevator();
        boolean quit = false;
        System.out.println("Welcome to the elevator");
        while (!quit){
            System.out.println();
            System.out.println("Options: (s)elect floor, (f)ire alarm, (q)uit");
            System.out.println("Enter s, f, or q");
            String choice = scan.next();
            char option = choice.charAt(0);
            if (option == 's' || option == 'S'){
                System.out.println("Which floor would you like to go to: ");
                boolean validFloor = false;
                int floor = 0;
                while(!validFloor) {
                    floor = scan.nextInt();
                    final int maxFloor = 100;
                    if (floor < maxFloor && 1 < floor){
                        validFloor = true;
                    } else {
                        System.out.println("Invalid floor selection must be between 1 and 100");
                        System.out.println("enter another floor: ");
                    }
                }
                if(floor > elevator.getCurrentFloor()) {
                    elevator.goingUp(floor);
                } else if (floor < elevator.getCurrentFloor()){
                    elevator.goingDown(floor);
                }
            } else if (option == 'f' || option == 'F'){
                System.out.println("DANGER you must exit the building");
                elevator.goingDown(1);
            } else if (option == 'q' || option == 'Q'){
                quit = true;
            } else{
                System.out.println("Invalid selection please choose again");
            }
        }
        System.out.println("Quitting: Have a nice day");
    }
}
