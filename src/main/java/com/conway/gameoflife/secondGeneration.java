package com.conway.gameoflife;

public class secondGeneration extends firstGeneration {

    //computation of the second generation based on the previous generation
    int[][] secondGen(int[][] initialGrid) {

        int[][] secondGrid = new int[ROWS][COLUMNS];
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                int neighbours = countLiveNeighbours(initialGrid, i, j);
                //System.out.println("neighbours : " + neighbours);
                int state = initialGrid[i][j];
            // 1. loneliness = death.
                if (state == 1 && neighbours < 2) {
                    secondGrid[i][j] = 0;
           // 2. over population = death
                }else if(state == 1 && neighbours > 3 ){
                    secondGrid[i][j] = 0;
            //3. reproduction = birth
                }else if(state ==0 && neighbours==3){
                    secondGrid[i][j] = 1;
                }
            //4. Maintains state = no change
                else {
                    secondGrid[i][j] = state;
                }
            }
        }
        return secondGrid;
    }
    // TODO check the total number of live neighbours
    private int countLiveNeighbours(int[][] firstGen, int x, int y) {
        int sum = 0;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                // implement a wrapper to take care of the edge and avoid IndexOutOfBound Exception

                int col = (x + i + COLUMNS) % COLUMNS;
                int row = (y + j + ROWS) % ROWS;
                sum += firstGen[row][col];
            }
        }
        // I shouldn't count the current element , so it must be excluded before the actual return value
        sum -= firstGen[x][y];
        return sum;
    }
    // display the second generation
    @Override
    public void display(char[][] finalGen) {
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
