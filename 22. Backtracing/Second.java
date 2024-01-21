//Find Subset Code
/* 
Find & print all the subsets of a given string.

Number of a totatl Sub String-2^n
 */

public class Second{
    public static void findSubsets(String str,String ans,int i){
        //Base case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("NULL");
            }else{
                System.out.println(ans);
            }
            return;
        }

        //Yes Choice

        findSubsets(str,ans+str.charAt(i),i+1);

        //No choice 

        findSubsets(str, ans, i+1);
    }
    public static void main(String args[]){
        String str="abc";
        String ans="";
        findSubsets(str, ans, 0);
    }
}