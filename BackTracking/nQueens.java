package BackTracking;

public class nQueens {

    public static void printBoard(char board[][]){
        System.out.println("-----------------CHESS BOARD-----------------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){

                 System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static boolean isSafe(char board[][], int row, int col){

        // vertically up
        for(int i=row-1; i>=0; i--){
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        // diagonally left
        for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        // diagonally right
        for(int i=row-1,j=col+1; i>=0 &&j<board.length; i--,j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }

        return true;
    }

    public static void nQuees(char board[][], int row){
        if(row == board.length){
            printBoard(board);
            return;
        }
        // column loop
        for(int j=0; j<board.length; j++){
         if(isSafe(board,row,j)){
            board[row][j] = 'Q'; 
            nQuees(board, row+1); // function
            board[row][j] = 'X'; // backTracking
         }
        }
    }

    public static void main(String[] args) {
        int n= 5;
        char board[][] = new char[n][n];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){

                board[i][j] = 'X';  
            }
            System.out.println();
        }
        
        nQuees(board, 0);
      
    }
    
}
