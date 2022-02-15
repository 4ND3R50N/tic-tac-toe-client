package de.tictactoe;

public class MatchField {

    //Our TicTacToe field always has 9 fields by default
    private int rows = 3;
    private int columns = 3;
    char[][] symbols;
    private String separationBar;

    //Konstruktor
    public MatchField(){
        this.rows = rows + 1;
        this.columns = columns + 1;
        this.separationBar = generateSeparatorBar();

        symbols = new char[this.rows][this.columns];

    }

    //Method to print the MatchField
    public void printMatchField () {
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
            System.out.println(separationBar);
        }
    }

    //Auxiliary method to generate separator bars flexibly
    public String generateSeparatorBar() {
        String separator = "---+";
        for(int x = 1; x < columns; x++){
            separator = separator + "---+";
        }
        return separator;
    }



}
