/* N-Queens-all ways[Important]
Place N queens on an N*N chess Board such thta no 2 queens can attack each other.
 */
// Here we'll just print queen
public class Fourth{
    public static void NQueens(char board[][],int row){
        //base
        if(row==board.length){
            printBoard(board);
            return;
        }
        //column loop
        for (int j=0;j<board.length;j++){
            board[row][j]='Q';
            NQueens(board,row+1); //function call
            board[row][j]='X'; // backtracking step
        }
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
        int n=2;
        char board[][]=new char[n][n];
        //Initialize size
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                board[i][j]='.';
            }
        }
        NQueens(board, 0);
    }
}