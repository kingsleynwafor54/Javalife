package ChapterSeven;

import java.util.Scanner;

public class Sudoku {
    int [][] grid= new int[9][9];
    //grid=readASolution();

    public boolean isValid(int i,int j,int[][] grid){
    for(int column=0;column<9;column++) {
        if (column != j && grid[i][column] == grid[i][j])
            return false;
    }
        for(int row =0;row<9;row++){
            if(row!=i && grid[row][j]==grid[i][j]){
                return false;
            }
        }
    for(int row =(i/3)*3;row<(i/3)*3+3; row++){
        for(int col=(j/3)*3;col<(j/3)*3+3;col++)
          if(row!=i && col!=j &&grid[row][col]==grid[i][j])
              return false;
    }
  return true;
    }
    public int[][] readASolution() {
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j <9; j++) {
                System.out.print("Enter a Sudoku puzzle solution:");
                grid[i][j] = input.nextInt();
                displayArray();
            }


        }
        return grid;
    }
public boolean isValid(int[][] grid){
        for(int i=0;i<9;i++)
            for(int j=0;j<9;j++)
                if(grid[i][j]<1||grid[i][j]>9 || !isValid(i,j,grid))
                    return false;
                return true;
}

public void displayArray(){
        for(int row=0;row<9;row++){
            for(int column=0;column<9;column++){
                System.out.print(grid[row][column]+" ");

                }
            System.out.println();
            }
        }

    public static void main(String[] args) {
        Sudoku sudoku=new Sudoku();
        int [][] grid={{5, 3, 4, 6, 7, 8, 9, 1, 2},
                {6, 7, 2, 1, 9, 5, 3, 4, 8},
                {1, 9, 8, 3, 4, 2, 5, 6, 7},
                {8, 5, 9, 7, 6, 1, 4, 2, 3},
                {4, 2, 6, 8, 5, 3, 7, 9, 1},
                {7, 1, 3, 9, 2, 4, 8, 5, 6},
                {9, 6, 1, 5, 3, 7, 2, 8, 4},
                {2, 8, 7, 4, 1, 9, 6, 3, 5},
                {3, 4, 5, 2, 8, 6, 1, 7, 9}
        };
        sudoku.readASolution();
     //  sudoku.displayArray();
    }
}

