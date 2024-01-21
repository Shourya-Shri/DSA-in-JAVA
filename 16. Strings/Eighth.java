// Print Largest String (In LEXICOGRAPHICALLY--> a<b<c<d<e<f and so onnn.....)
/* For a given set of strings, print the largest string */
// "apple","mango","banana"

/*
 Function to do so:-
 str1.compareTo(str2)  :-
 0 : Equal
 <0: -ve
 >0: +ve

* Ignore case compare to--> (Here A=a;)
compareToIgnoreCase() 
 */

 public class Eighth{
    public static void main(String args[]){
        String fruits[]={"apple","mango","banana"};

        String largest=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){  //Here a!=A
                largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
 }