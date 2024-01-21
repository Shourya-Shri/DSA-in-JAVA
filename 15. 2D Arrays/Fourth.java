// Search in a Sorted Matrix => Both Row and column wise, it is sorted

/* If key< cell value==>> TOP
   If key> cell value==>  Right
 */

public class Fourth{
    public static boolean StaircaseSearch(int matrix[][],int key){
        int row=0,col=matrix[0].length-1;

        while(row<matrix.length && col>=0){
            if(matrix[row][col]==key){
                System.out.println("Found key at (" + row + "," + col + ")");
                return true;
            }
            else if(key<matrix[row][col]){
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("Key not found");
        return false;
    }

    public static void Print2Darray(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        int matrix[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        System.out.println(StaircaseSearch(matrix, 37));
        Print2Darray(matrix);
    }
}