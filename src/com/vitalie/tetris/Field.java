package com.vitalie.tetris;

public class Field {

    private int width;
    private int height;

    private int[][] matrix;

    public Field(int width, int height) {
        this.width = width;
        this.height = height;

        matrix = new int[10][10];
    }

    public void print() {

    }

    public void removeFullLines() {

    }

    public Integer getValue(int x, int y) {
        return 0;
    }

    public void setValue(int x, int y) {

    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int[][] getMatrix() {
        return matrix;
    }
}
