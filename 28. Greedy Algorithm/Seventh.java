/* Job Sequencing Problem

Given an array of jobs where every job has a deadline and profit if the job is finished before the deadline. It is also given that every job takes a single unit of time. So maximum possible deadline for any job is 1. Maximise the total profit if only one job can be scheduled at time.

Job A= 4, 20
Job B= 1, 10
Job C= 1, 40
Job D= 1, 30

ans=C,A
 */
// Here we'll learn to sort Objects.

import java.util.*;

public class Seventh {
    
    static class Job{
        int deadline;
        int profit;
        int id;

        public Job(int i,int d,int p){
            id=i;
            deadline=d;
            profit=p;
        }
    }
    public static void main(String args[]){
        int jobsinfo[][]={{4,20},{1,10},{1,40},{1,30}};

        ArrayList<Job> jobs=new ArrayList<>();

        for(int i=0;i<jobsinfo.length;i++){
            jobs.add(new Job(i,jobsinfo[i][0],jobsinfo[i][1]));
        }

        Collections.sort(jobs,(obj1,obj2)->obj2.profit-obj1.profit); //Descending order profit

        ArrayList<Integer> seq=new ArrayList<>();
        int time=0;

        for(int i=0;i<jobs.size();i++){
            Job curr=jobs.get(i);
            if(curr.deadline>time){
                seq.add(curr.id);
                time++;
            }
        }
        //print seq

        System.out.println("Max Jobs= " + seq.size());
        for(int i=0;i<seq.size();i++){
            System.out.print(seq.get(i)+ " ");
        }
        System.out.println();
    }
}
