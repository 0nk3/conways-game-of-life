package com.conway.gameoflife;

import java.util.Random;

public class firstGeneration implements Conway {
    // board dimensions
    static final int ROWS = 3;
    static final int COLUMNS = 6;

    // fill up the empty array with random binary numbers(0 or 1)
    // and return the filled up array as initial generation
    @Override
    public int[][] firstGen(int rows, int columns) {
        Random random = new Random();
        int[][] firstGen = new int[ROWS][COLUMNS];
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                firstGen[i][j] = random.nextInt(2);
            }
        }
        return firstGen;
    }
    // This methods simply formats the output of the arrays in a nice readable format
    @Override
    public void formatOutput(int rows) {
        for (int i = 0; i < COLUMNS*4 ; i++) {
            System.out.print("_");
        }
        System.out.println();
    }
    // this method accepts a 2 dimensional array and converts it to a string
    // According to the problem set :
    // Alive = # = 1
    // Dead  = + = 0
    @Override
    public char[][] toStrings(int[][] arr) {
        char[][] newArray = new char[ROWS][COLUMNS];
        for (int i = 0; i < ROWS ; i++) {
            for (int j = 0; j < COLUMNS ; j++) {
                if(arr[i][j]==1){
                    newArray[i][j] = '#';
                }else {
                    newArray[i][j] = '+';
                }
            }
        }
        return newArray;
    }

    // displaying the first generation table
    @Override
    public void display(char[][] fistGen){
        formatOutput(fistGen.length);
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print("|" + fistGen[i][j] + "| ");
            }
            System.out.println();
        }
        formatOutput(fistGen.length);
    }
}
