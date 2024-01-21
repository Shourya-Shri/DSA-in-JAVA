//Buy & Sell Stock

/* You are given an array prices where prices[i] is the price of a given stock
on the ith day. You want to maximaize your profit by chosing a sibgle day to
buy one stock and choosing a different day in the future to sell that stock.
Return the maximum priofit you can achieve from this transaction.
If you cannot acheive any profit, return 0.*/

//Profit --> Sell on high and buy on low
//prices[]={7,1,5,3,6,4}

public class Twelth{
    public static int BuyAndSell(int prices[]){
        int buyPrice=Integer.MAX_VALUE;
        int maxProfit=0;

        for(int i=0;i<prices.length;i++){
            if(buyPrice<prices[i]){ //Profit
                int profit=prices[i]-buyPrice; //Today's Profit
                maxProfit=Math.max(maxProfit,profit);
            }else{
                buyPrice=prices[i];
            }
        }
        return maxProfit;
    }
    public static void main(String args[]){
        int prices[]={7,1,5,3,6,4};
        System.out.println(BuyAndSell(prices));
    }
}