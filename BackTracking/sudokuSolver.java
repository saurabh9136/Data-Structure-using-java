package BackTracking;

public class sudokuSolver {

    public static boolean isSafe(int sudoku[][], int row, int col, int digit){

        // check column wise
        for(int i=0; i<=8; i++){
            if(sudoku[i][col] == digit){
                return false;
            }
        }
         // check row wise
        for(int j=0; j<=8; j++){
            if(sudoku[row][j] == digit){
                return false;
            }
        } 
        // check in grid below is a formula for calculating the grid
        // grid 3x3
        int sr = (row/3)*3;
        int sc = (col/3)*3;
        for(int i=sr; i<sr+3; i++){
            for(int j=sc; j<sc+3; j++){
                if(sudoku[i][j] == digit){
                    return false;
                }
            } 
        }
            return true;
    }
      
    public static boolean sudoku(int sudoku[][], int row, int col){
       
        // when the idx value of row =9 or j=0 then it hits the base case
        if(row == 9 && col ==0){
            return true;
        }
        int nextRow = row,nextcol = col+1;
        if(col+1 == 9 ){
         nextRow = row+1;
         nextcol = 0;
        }

        if(sudoku[row][col] != 0 ){
            return sudoku(sudoku, nextRow, nextcol);
        }

        for(int digit=1; digit<=9; digit++){
            if(isSafe(sudoku,row,col,digit)){
                sudoku[row][col] = digit;
                if(sudoku(sudoku, nextRow, nextcol)){// soln exist
                    return true;
                }
                sudoku[row][col] = 0;               
            }           
        }

        return false;
    }

    public static void printSudoku(int sudoku[][]){

        for(int i=0; i<9;i++){
            for(int j=0; j<9; j++){
                System.out.print(sudoku[i][j]+" ");
            }
            System.out.println();    
        }
    }


    public static void main(String[] args) {
        
        int sudoku[][] = { {0, 0, 8, 0, 0, 0, 0, 0, 0}, 
                          {4, 9, 0, 1, 5, 7, 0, 0, 2},
                          {0, 0, 3, 0, 0, 4, 1, 9, 0},
                          {1, 8, 5, 0, 6, 0, 0, 2, 0},
                          {0, 0, 0, 0, 2, 0, 0, 6, 0},
                          {9, 6, 0, 4, 0, 5, 3, 0, 0},
                          {0, 3, 0, 0, 7, 2, 0, 0, 4},
                          {0, 4, 9, 0, 3, 0, 0, 5, 7},
                          {8, 2, 7, 0, 0, 9, 0, 1, 3} };

        if(sudoku(sudoku, 0, 0)){
            System.out.println("solution exist");
            printSudoku(sudoku);
        }else{

            System.out.println("solution does not exist");
        }

    }
    
}
