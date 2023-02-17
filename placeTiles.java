public class placeTiles {
    // place tiles of size 1 *m in a floor of size n *m
    public static int place_tiles(int n, int m){
        if(n==m){return 2;}
        if(n<m){return 1;}
        // horizontally
        int horizontally=place_tiles(n-m, m);
    //    vertically
    int vertically=place_tiles(n-1,m);
    return horizontally+vertically;
    }
    public static void main(String[] args) {
        int n=4,m=2;
        System.out.println(place_tiles(n, m));
    }
}
