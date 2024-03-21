package com.jhnfrankz.coffeemachinesimulator;

import java.util.Scanner;


public class Machine {
    public static void main(String[] args) {
        startMachine();
    }

    public static void startMachine() {
        CoffeeMachine coffeeMachine = new CoffeeMachine();

        while (coffeeMachine.getStateMachine() != StateMachine.EXIT) {
            CoffeeMachine.readAction(coffeeMachine);
        }
    }
}

