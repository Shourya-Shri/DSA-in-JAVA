/*
# Weakest Soldier:-
=> We are given an m*n binary matrix of 1's(soldies) and 0's(civilians). The soldiers are positioned in front of the civilians. That is, all the 1's will appear to the left of all the 0's in each row.

A row i is weaker than a row j if one of the following is true:-

i)  The number of soldiers in row i is less than the number of soldies in row j.
ii) Both rows have the same number of soldiers and i<j.
*/

import java.util.*;

public class Seventh {
    
    static class Row implements Comparable<Row>{
        int soldiers;
        int idx;

        public Row(int soldiers, int idx) {
            this.soldiers = soldiers;
            this.idx = idx;
        }
        @Override

        public int compareTo(Row r2) {
            if(this.soldiers==r2.soldiers){
                return this.idx-r2.idx;
            }else{
                return this.soldiers-r2.soldiers;
            }
        }
    }
    public static void main(String args[]){
        int army[][]={{1,0,0,0},
                      {1,1,1,1},
                      {1,0,0,0},
                      {1,0,0,0}};

        int k=2;

        PriorityQueue<Row> pq=new PriorityQueue<>();

        //Counting no of soldiers
        for(int i=0;i<army.length;i++){
            int count=0;
            for(int j=0;j<army[0].length;j++){
                count+=army[i][j]==1?1:0;
            }
            pq.add(new Row(count,i));
        }
        for(int i=0;i<k;i++){
            System.out.println("R" + pq.remove().idx);
        }
    }
}
