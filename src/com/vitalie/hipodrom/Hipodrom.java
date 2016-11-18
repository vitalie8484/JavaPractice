package com.vitalie.hipodrom;

import java.util.ArrayList;

public class Hipodrom extends  Thread {

    private ArrayList<Horse> horses = new ArrayList<>();

    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            move();
            print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        printWinner();
    }

    public ArrayList<Horse> getHorses() {
        return horses;
    }

    public void move() {
        for (Horse horse : horses)
            horse.move();
    }

    public void print() {
        for (Horse horse : horses)
            horse.print();
        System.out.println();
        System.out.println();
    }

    public Horse getWinner() {
        Horse winner = new Horse("new", 0, 0);
        for (Horse horse : horses)
            if (horse.getDistance() >= winner.getDistance())
                winner = horse;

        return winner;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getNamme());
    }
}
