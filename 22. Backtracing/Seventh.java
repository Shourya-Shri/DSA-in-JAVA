//Grid Ways

/* Find number of ways to reach from(0,0) to (N-1,M-1) in a N*M grid. Allowed moves - Right or Down */

// f(x,y)=f(x+1,y){Down}+f(x,y+1){Right}

//Short trick-- (n-1+m-1)!/(n-1)!(m-1)!

public class Seventh{
    public static int gridways(int i,int j,int n,int m){
        //base case
        if(i==n-1 && j==m-1){ // Condition for last cell
            return 1;
        }else if(i==n || j==n){ // Boundary crossing condition
            return 0;
        }
        int w1=gridways(i+1, j, n, m);//down
        int w2=gridways(i, j+1, n, m);//up
        return w1+w2;
    }
    public static void main(String args[]){
        int n=3,m=3;
        System.out.println(gridways(0, 0, n, m));
    }
}