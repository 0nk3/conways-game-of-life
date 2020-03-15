package com.conway.gameoflife;
/* ************************************************************************** *
 * @author : Ndumiso Onke Fanti                                               *
 * Title : Conways Game of Life                                               *
 * The primary goal is to make a console version of the game of life but with *
 * only 2 states i.e initial generation and the generation that should follow *
 *  based on what we had initially.I only need two objects keeping track of   *
 * just two generations.                                                      *
 * ************************************************************************** */
class Main {
    public static void main(String[] args) {

        System.out.println("===================> FIRST GENERATION <==========================");

        //generate and display the fist generation
        firstGeneration generationOne = new firstGeneration();
        int[][] filledUP = generationOne.firstGen(firstGeneration.ROWS, firstGeneration.COLUMNS);
        //System.out.println("First Generation -->" + Arrays.deepToString(filledUP));
        char[][] firstGeneration = generationOne.toStrings(filledUP);
        // display grid
        generationOne.display(firstGeneration);

        System.out.println("====================> SECOND GENERATION <=======================");

        //generate the second generation based on the previous generation
        secondGeneration generationTwo = new secondGeneration();
        int[][] finale = generationTwo.secondGen(filledUP);;
        //System.out.println("Second Generation -->" + Arrays.deepToString(finale));
        char[][] secGen = generationTwo.toStrings(finale);
        //display grid
        generationTwo.display(secGen);
    }
}
