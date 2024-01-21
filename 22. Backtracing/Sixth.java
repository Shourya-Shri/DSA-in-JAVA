//N Queens- print one solution only

public class Sixth{
    public static boolean isSafe(char board[][],int row,int col){
        //Vertical Up
        for(int i=row-1;i>=0;i--){
            if(board[i][col]=='Q'){
                return false;
            }
        }
        //Diagonal leftUp
        for(int i=row-1,j=col-1;i>=0 && j>=0;i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        //Diagonally rightup
        for(int i=row-1,j=col+1;i>=0 && j<board.length;i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
    }
    public static boolean NQueens(char board[][],int row){
        //base
        if(row==board.length){
            return true;
        }
        //column loop
        for (int j=0;j<board.length;j++){
            if(isSafe(board, row, j)){
                board[row][j]='Q';
                if(NQueens(board, row+1)){
                    return true;
                }
                board[row][j]='X';
            }
        }
        return false;
    }
    public static void printBoard(char board[][]){
        System.out.println("-----Chess Board-----");
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int n=10;
        char board[][]=new char[n][n];
        //Initialize size
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='X';
            }
        }
        if(NQueens(board, 0)){
            System.out.println("Solution is possible");
            printBoard(board);
        }else{
            System.out.println("Solution is not possible");
        }
    }
}