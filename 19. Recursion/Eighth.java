/* Friends Pairing Problem
Given n friends, each one can remain single or can be paired up with some other friends.Each friend can be paired only once. Find out the total numbers of ways in which friends can remain single or can be paired up.
 */

 public class Eighth{

    public static int friendsPairing(int n){
        if(n==1||n==2){
            return n;
        }
        //choice
        //single
        int fnm1=friendsPairing(n-1);

        //Pair
        int fnm2=friendsPairing(n-2);
        int Pairways=(n-1)*fnm2;

        //total ways

        int totalWays=fnm1+Pairways;
        return totalWays;
    }
    public static void main(String args[]){
        System.out.println(friendsPairing(3));
    }
 }