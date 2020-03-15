package com.conway.gameoflife;
public class secondGeneration extends firstGeneration {

    //computation of the second generation based on the previous generation
    int[][] secondGen(int[][] initialGrid) {

        int[][] secondGrid = new int[ROWS][COLUMNS];
        // going through every element
        for (int x = 1; x < ROWS - 1; x++){
            for (int y = 1; y < COLUMNS - 1; y++){
                // count live neighbours
                int aliveNeighbours = 0;
                for (int i = -1; i <= 1; i++){
                    for (int j = -1; j <= 1; j++){
                        aliveNeighbours += initialGrid[x + i][y + j];
                    }
                    
                }
                // Should subtract to exclude the cell itself
                aliveNeighbours -= initialGrid[x][y];

                // 1. Underpopulation
                if ((initialGrid[x][y]==1) && (aliveNeighbours < 2)) {
                    secondGrid[x][y] = 1;
                // 2. Survival
                }else if((initialGrid[x][y] == 1) && (aliveNeighbours == 2 || aliveNeighbours ==3)){
                    secondGrid[x][y] = 1;
                //  3. overpopulation
                }else if((initialGrid[x][y] == 1) && (aliveNeighbours > 3) ){
                    secondGrid[x][y] = 0;
                //3. Reproduction
                }else if((initialGrid[x][y] == 0) && (aliveNeighbours ==3 )) {
                    secondGrid[x][y]  = 1;
                }
            }
        }
        return secondGrid;
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
