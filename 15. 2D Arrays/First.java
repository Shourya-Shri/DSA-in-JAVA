//Creation of 2D Arrays
/*In java 2D arrays are not stored in Row major and Column Major
In Java 2D ararys are stored as an individual array of all rows
at different locations. All at different positions in a single array manner.
Their address have no relation among them in memory. */
//Search in boolean Array

import java.util.*;

public class First{

    public static boolean Search(int matrices[][],int key){
        for(int i=0;i<matrices.length;i++){
            for(int j=0;j<matrices[0].length;j++){
                if(matrices[i][j]==key){
                    System.out.println("Found at cell (" + i +" , " + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }
    public static void main(String args[]){
        int matrices[][]=new int[3][3];
        int n=matrices.length,m=matrices[0].length;
        Scanner sc=new Scanner(System.in);

        //Taking input

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrices[i][j]=sc.nextInt();
            }
        }

        //Output

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrices[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println(Search(matrices, 9));
    }
}