package de.tictactoe;

public class MatchField {

    //Our TicTacToe field always has 9 fields by default
    private int rows = 3;
    private int columns = 3;
    char[][] symbols;

    //Konstruktor
    public MatchField(){
        this.rows = rows + 1;
        this.columns = columns + 1;

        symbols = new char[this.rows][this.columns];

    }

    public void printMatchField (){
        for(int y = 0; y < rows; y++){
            for(int x = 0; x < columns; x++){

                if(x == 0 && y == 0){
                    System.out.print("   |");
                }

                if(x >= 1 && y == 0){
                    System.out.print(" " + x +" |");
                }

                if(x == 0 && y >= 1){
                    System.out.print(" " + y + " |");
                }

                if(x >= 1 && y >= 1) {
                    System.out.print(" " + symbols[y][x] + " |");
                }
            }
            System.out.println();
            //
        }




    }





}
