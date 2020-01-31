package com.conway.gameoflife;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

class secondGenerationTest {
    private secondGeneration generation = new secondGeneration();
    // Change Constants ROW and COLUMN(to 5 by 5) and enable this test case by removing the comment
    /*@Test
    void testCaseOne() {

        int[][] array0 = {
                {1, 0, 1, 1, 0},
                {0, 0, 1, 0, 0},
                {1, 0, 1, 1, 0},
                {1, 1, 0, 1, 1},
                {0, 1, 1, 1, 0}
        };
        int[][] expected = {
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0},
                {0, 0, 0, 0, 0}
        };

        Assert.assertArrayEquals(expected, generation.secondGen(array0));
    }*/
    @Test
    void givenTestCase(){
        int[][] input = {
                {0, 0, 1, 0, 0, 0},
                {0, 0, 1, 1, 1, 0},
                {0, 0, 0, 0, 0, 0}
        };
        int[][] expected = {
                {0, 0, 1, 0, 0, 0},
                {0, 0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0}
        };
        Assert.assertArrayEquals(expected, generation.secondGen(input));
    }
}



