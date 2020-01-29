package com.conway.gameoflife;

public class firstGeneration implements Conway {
    // fill up the empty array with random binary numbers(0 or 1)
    // and return the filled up array as initial generation
    @Override
    public int[][] firstGen(int rows, int columns) {
        int[][] firstGen = new int[ROWS][COLUMNS];
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                firstGen[i][j] = (int) (Math.random() * 2);
            }
        }
        return firstGen;
    }
    // This methods simply formats the output of the arrays in a nice readable format
    @Override
    public void formatOutput(int rows) {
        for (int i = 0; i < rows*4 ; i++) {
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
        char[][] newArray = new char[arr.length][arr.length];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length ; j++) {
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
