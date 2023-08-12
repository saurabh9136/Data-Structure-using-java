package BackTracking;

public class nQueenPractice {

    public static void printBoardP(char board[][]){
        System.out.println("----------CHESS BOARD-------------");
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){

                 System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }        
    }

    public static boolean isSafe(char[][] board, int row, int col){
        //check vertically up row changes col constant
        for(int i= row-1; i>=0; i--){
            if(board[i][col] == 'Q'){

                return false;
            }
        }

        //check daigonal left where col and row are same
        for(int i=row-1,j=col-1; i>=0 && j>=0; i--,j--){
            if(board[i][j] == 'Q'){

                return false;
            }
        }

        //check diagonal right where row-- col++
        for(int i=row-1,j=col+1; i>=0 && j<board.length; i--,j++){
            if(board[i][j] == 'Q'){

                return false;
            }
        }
        // if none of the condition is true then we can place the Q on particular cell
        return true;
    }

    public static void nQueenPrac(char[][] board, int row){
     
        // baseCase
        if(row == board.length){
            //printBoardP(board);
            count++;
            return;
        }

        // loop for column
        for(int col=0; col<board.length; col++){
        // use if condition to check the condition
        if(isSafe(board, row, col)){      

                //first place the queen
                board[row][col] = 'Q';
                // move to another cell with row
                nQueenPrac(board, row+1);// recursion
                // now remove the queen in backteacking method
                board[row][col] = 'X';       
           
         }
        }

    }
// to count number of ways we intitalize static var
static int count=0;

   public static void main(String[] args) {
       
      int n=5;
      char board[][] = new char[n][n];
      for(int i=0; i<board.length; i++){
        for(int j=0; j<board.length; j++){

            board[i][j] = 'X';  
        }
        System.out.println();
    }
    nQueenPrac(board, 0);
    System.out.println("number of ways are: "+count);
   }   
}
