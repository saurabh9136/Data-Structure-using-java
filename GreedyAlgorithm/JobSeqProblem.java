package GreedyAlgorithm;
import java.util.*;

public class JobSeqProblem {

    static class Job {
        int id;
        int deadline;
        int profit;

        public Job(int i, int d,int p) {
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String[] args) {
        
        int jobinfo[][] = {{4, 20}, {1, 10}, {1, 40}, {1, 30}};
        // create a array of object using arraylist

        ArrayList<Job> jobs = new ArrayList<>();

        // now add the value of jbInfo into jobs
        for(int i=0; i<jobinfo.length; i++) {
            jobs.add(new Job(i, jobinfo[i][0], jobinfo[i][1]));
        }
        // now sort the price into decsending order
// obj1 or obj2 shows the relation if index of array         
        Collections.sort(jobs, (obj1, obj2) -> obj2.profit - obj1.profit);// Descending order
        // if we want to take as ascending order then simply change obj1.p-obj2.p

        int time = 0;// time track and compare with deadline
        ArrayList<Integer> seq = new ArrayList<>();
        // it store the index of jobs index
        for(int i=0; i<jobs.size(); i++ ) {
            Job currJob = jobs.get(i);
            // first check ki deadline khatam to nhi ho gai h
            if(currJob.deadline > time) {
                time++;
                seq.add(currJob.id);
            }
        }
        
        System.out.println("total Numbers of job done is : "+seq.size());
        for(int i=0; i<seq.size(); i++) {
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();

    }
    
}
