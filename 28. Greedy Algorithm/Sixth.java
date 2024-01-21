//Indian Coins

// We are given an infinite supply of denominations[1,2,5,10,20,100,500,2000]. Find minimum number of coins/notes to make change for a value V.

//V=121
//ans=3(100+20+1)

import java.util.*;

public class Sixth {
    public static void main(String args[]){
        Integer coins[]={1,2,5,10,20,50,100,500,2000};
        Arrays.sort(coins, Comparator.reverseOrder());
        int CountofCoins=0;
        int amount=590;
        ArrayList<Integer> ans=new ArrayList<>();

        for(int i=0;i<coins.length;i++){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    CountofCoins++;
                    ans.add(coins[i]);
                    amount-=coins[i];
                }
            }
        }
        System.out.println("Total(min) coins used = " + CountofCoins);

        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i)+ " ");
        }
        System.out.println();
    }
}
