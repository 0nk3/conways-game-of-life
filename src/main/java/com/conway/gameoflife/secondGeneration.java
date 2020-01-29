package com.conway.gameoflife;

public class secondGeneration extends firstGeneration {

    //computation of the second generation based on the previous generation
    int[][] secondGen(int[][] initialGrid) {
        int neighbours = countLiveNeighbours(initialGrid, initialGrid.length-1, initialGrid.length-1);
        int[][] secondGrid = new int[ROWS][COLUMNS];
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                // treating the edges
                int state = initialGrid[i][j];
//                if(i == 0 || i == COLUMNS - 1 || j == 0 || j == ROWS - 1) {
//                    secondGrid[i][j] = state;
//
//                } else {
                    // Computing live neighbors
                    // implementation of the actual rules
                    //System.out.println("state = " + state + "|" + "neighbours = " + neighbours);
                    if (state == 0 && neighbours == 3) {
                        secondGrid[i][j] = 1;
                    } else if (state == 1 && (neighbours < 2 || neighbours > 3)) {
                        secondGrid[i][j] = 0;
                    } else {
                        secondGrid[i][j] = state;
                    }
                //
            }
        }
        return secondGrid;
    }

    // check the total number of live neighbours
    private int countLiveNeighbours(int[][] firstGen, int x, int y) {
        int sum = 0;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                //wrapper
                int row = (x + i + firstGen.length) % firstGen.length;
                int col = (y + j + firstGen.length) % firstGen.length;
                sum += firstGen[row][col];
            }
        }
        // I shouldn't count the current element , so it must be exclude before return value
        sum -= firstGen[x][y];
        return sum;
    }
    // display the second generation
    @Override
    public void display(int[][] finalGen) {

        for(int i = 0; i < finalGen.length *4; i++){
            System.out.print("_");
        }
        System.out.println();
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print("|" + finalGen[i][j] + "| ");
            }
            System.out.println();
        }
        formatOutput(finalGen.length);
    }

}
