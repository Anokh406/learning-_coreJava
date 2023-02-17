import java.util.ArrayList;

public class findSubsets {
    public static void print_subset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i)+"");
        }
        System.out.println();
    }
    public static void find_subset(int n,ArrayList<Integer> subset){
        if(n==0){
            print_subset(subset);
            return;
        }
        //   add hoga
        subset.add(n);
        find_subset(n-1, subset);

        // add nahi hoga
        subset.remove(subset.size()-1);
        find_subset(n-1, subset);
    }
    public static void main(String[] args) {
        int n=3;
        ArrayList<Integer> subset=new ArrayList<>();
        find_subset(n, subset);
    }
}
