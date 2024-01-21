/* Chocola Problem -{SPOJ, platform}, Hard, {MAANG} --VVI

We are given a bar of chocolate composed of m*n square pieces. One should break the chocolate into single squares. Each break of a part of the chocolate is charged a cast expressed by a positive integer. This cost does not depend on the size of the part that is being broken but only depends on the line the break goes along. Let us denote the costs of breaking along consecutive vertical line with x1,x2,......x(n-1) and along horizontal lines with y1,y2,.....y(n-1). Compute the minimal cost of breaking the whole chocolate into single squares.*/

//Different name-Minimum cost to cut a board.
// * Cost of cutting depends on the line the break goes along not the size. 

import java.util.*;

public class Eighth {
    
    public static void main(String args[]){
        int n=4,m=6;
        Integer costver[]={2,1,3,1,4};
        Integer costhor[]={4,1,2};

        Arrays.sort(costver, Collections.reverseOrder());
        Arrays.sort(costhor, Collections.reverseOrder());

        int h=0,v=0;
        int hp=1,vp=1;
        int cost=0;

        while(h<costhor.length && v<costver.length){
            if(costver[v]<=costhor[h]){ //horizontal cut
                cost+=(costhor[h]*vp);
                hp++;
                h++;
            }else{ //Vertical cut
                cost+=(costver[v]*hp);
                vp++;
                v++;
            }
        }
        while(h<costhor.length){
            cost+=(costhor[h]*vp);
            hp++;
            h++;
        }
        while(v<costver.length){
            cost+=(costver[v]*hp);
            vp++;
            v++;
        }
        System.out.println("Min cost of cuts= "+ cost);
    }
}
