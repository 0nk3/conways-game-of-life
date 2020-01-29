package com.conway.gameoflife;
/* **************************************************************** *
*display method displays the contents of the given array as a table *
*firGen generates the first generation based on the given dimensions*
* formatOutput simply formats the tables in a nice readable way     *
* ***************************************************************** */
interface Conway {
    void display(int[][] array);
    int[][] firstGen(int rows, int columns);
    void formatOutput(int rows);
    int ROWS = 15;
    int COLUMNS = 15;
}
