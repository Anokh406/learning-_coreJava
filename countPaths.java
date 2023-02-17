public class countPaths {
    public static int count_paths(int i,int j,int n,int m){
    if(i==n||j==n){
        return 0;
    }
    if(i==n-1 || j==n-1){
        return 1;
    }
        // downward move
        int downward=count_paths(i+1, j, n, m);
        // move right
        int right=count_paths(i,j+1, n, m);
        return downward+right;
    }
    public static void main(String[] args) {
        int n=3,m=3;
     System.out.println(   count_paths(0, 0, n, m));
    }
}
