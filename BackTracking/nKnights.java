package BackTracking;

public class nKnights {

    public static void printBoard(int board[][]){

        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }


    public static void printNknights(int board[][], int row){

        if(row == board.length){
            printBoard(board);
            return;
        }
        
        for(int j=0; j<board.length; j++){
            if(isSafe(board, row, j)){
             board[row][j] = 'K';
             printNknights(board, row+1);// recusrsion kaam
             board[row][j] = 'X';
            }

        }
        
    }
    
     public static boolean isSafe(int board[][], int row, int col){
         return true;

     }

    public static void main(String[] args) {
        
        int n = 4;
        int board[][] = new int[n][n];
        for(int i=0; i<board.length; i++){
            for(int j=0; j<board.length; j++){
                board[i][j] = 0;
            }
            System.out.println();
        }
        printBoard(board);
    }
}
