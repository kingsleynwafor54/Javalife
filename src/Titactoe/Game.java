package Titactoe;

import java.util.HashSet;
import java.util.Set;

public class Game {
    private Board gameBoard;
    private boolean isGameWon;
    private boolean isBoardFull;
    public boolean lastValuePlayWasX;
    int moveMade=0;


    public Game()
    {
        this.gameBoard=new Board();

        this.isGameWon=false;
        this.isBoardFull=false;
        this.lastValuePlayWasX=false;

    }
public void makeMove(int gridPosition) throws GameOverExceptions,BoardIsFullException,AlreadyOccupiedException {

    if (isBoardFull) {
        throw new BoardIsFullException();
    }

    int position = gridPosition - 1;
    int row = gridPosition / 3;
    int column = gridPosition % 3;
    Value[][] array= gameBoard.getArray();
//    if(array[row][column]!=Value.EMPTY){
//        throw  new AlreadyOccupiedException();
//    }

    if (lastValuePlayWasX) {
        gameBoard.getArray()[row][column] = Value.O;lastValuePlayWasX=false;


    } else {
        gameBoard.getArray()[row][column] = Value.X;
        lastValuePlayWasX=true;
    }
    if (isGameWon) {
        throw new GameOverExceptions();
    }
    if (moveMade < 9) {
        isBoardFull = true;
    }
}
    public boolean isGameWon(){
        Value[][] array= gameBoard.getArray();
        for(int row =0;row<array.length;row++){
            Set<Value>values=new HashSet<>();
            for (int column=0;column<array[row].length;column++){
                values.add(array[row][column]);
        }
    if (!values.contains(Value.EMPTY)&& values.size()==1){

            return true;

    }
        }
   for(int column=0 ;column< array.length;column++){
       Set<Value> values=new HashSet<>();
       for(int row=0;row<array.length;row++){
           values.add(array[row][column]);
       }
       if (!values.contains(Value.EMPTY)&& values.size()==1){

           return true;
   }
    }
   Set<Value>leftDiagonalValues=new HashSet<>();
for(int counter=0;counter<array.length;counter++) {
    int row = counter;
    int column = counter;
    leftDiagonalValues.add(array[row][column]);
}
if (!leftDiagonalValues.contains(Value.EMPTY)&&leftDiagonalValues.size()==1){
    return true;

}
int row=2;
int column=0;
Set<Value>rightDiagonalValues=new HashSet<>();
for(;row>=0;row--){
    for(;column<array.length;column++){
        rightDiagonalValues.add(array[row][column]);

    }
}
if (!rightDiagonalValues.contains(Value.EMPTY)&&leftDiagonalValues.size()==1){
    return true;
        }
return false;
}
}
