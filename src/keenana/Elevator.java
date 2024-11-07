/*
 * Course: CSC1110 - 131
 * Fall 2023
 * Homework 8
 * Name: Andrew Keenan
 * Last Updated: 10-18-23
 */
package keenana;

/**
 * Class to create an elevator
 */
public class Elevator {
    private int currentFloor;

    /**
     * constructor for the elevator, sets the floor to 1
     */
    public Elevator(){
        currentFloor = 1;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    /**
     * Simulates going up the elvator shaft
     * @param desiredFloor the entered floor the elevator needs ot go to
     */
    public void goingUp(int desiredFloor){
        System.out.println("Going up ");
        while (currentFloor != desiredFloor){
            currentFloor++;
            System.out.print(currentFloor+"...");
        }
    }

    /**
     * simulates going down the elevator shaft
     * @param desiredFloor the entered floor the elevator needs to go to
     */
    public void goingDown(int desiredFloor){
        System.out.println("Going down ");
        while (currentFloor != desiredFloor){
            currentFloor--;
            System.out.print(currentFloor+"...");
        }
    }
}
