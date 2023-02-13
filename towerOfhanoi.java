public class towerOfhanoi {
    public static void towerOfhanoi(int n, String src, String helper,String dest){
        if(n==1){
            System.out.println("Transfer disk "+n+"from "+src+" to "+dest);
            return;
        }
        towerOfhanoi(n-1, src, dest, helper);
        System.out.println("Transfer disk "+n+"from "+src+" to "+dest);
        towerOfhanoi(n-1, helper , src, dest);
    }
    public static void main(String[] args) {
        int n=3;
        towerOfhanoi(n,"S","H", "D");
    }
    
}
