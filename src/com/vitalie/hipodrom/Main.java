package com.vitalie.hipodrom;

public class Main {

    private static Hipodrom game;

    public static void main(String[] args) {

        game = new Hipodrom();

        Horse horse1 = new Horse("Horse_1", 3, 0);
        Horse horse2 = new Horse("Horse_2", 3, 0);
        Horse horse3 = new Horse("Horse_3", 3, 0);

        game.getHorses().add(horse1);
        game.getHorses().add(horse2);
        game.getHorses().add(horse3);

        game.start();

    }

}
