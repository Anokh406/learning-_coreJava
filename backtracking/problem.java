package backtracking;

import java.util.*;

public class problem {

    class Project {
        int capital;
        int profit;
    
        public Project(int capital, int profit) {
            this.capital = capital;
            this.profit = profit;
        }
    }
    
    public class IPO {
        public static int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
            int n = profits.length;
            Project[] projects = new Project[n];
            for (int i = 0; i < n; i++) {
                projects[i] = new Project(capital[i], profits[i]);
            }
            Arrays.sort(projects, (p1, p2) -> p1.capital - p2.capital);
            PriorityQueue<Integer> pq = new PriorityQueue<>((p1, p2) -> p2 - p1);
            int available = w;
            int index = 0;
            for (int i = 0; i < k; i++) {
                while (index < n && projects[index].capital <= available) {
                    pq.offer(projects[index].profit);
                    index++;
                }
                if (pq.isEmpty()) {
                    break;
                }
                available += pq.poll();
            }
            return available;
        }
    }
    public static void main(String[] args) {
        
        int k=2,w=0;
        int[]  profits = {1,2,3}, capital = {0,1,1};
    
        findMaximizedCapital(k,w,profits,capital);
    }
        
}


