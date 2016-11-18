package com.vitalie.tetris;

public class FigureFactory {

    public static Figure createRandomFigure(int x, int y) {
        return new Figure(0, 0, new int[3][3]);
    }

}
