//continue statement- To skip a situation

public class Eleventh {
    public static void main(String args[]){
        for(int i=1;i<=5;i++){
            if(i==3){           // 1 2 4 5
                continue;
            }
            System.out.print(i + " ");
        }
    }
}
