package backtracking;

public class backtrack {
    public class first{
    public static void printPermutation(String str , String perm,int idx){
        if(str.length()==0){
            System.out.println(perm);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+i);
            printPermutation(newStr,  perm+currChar, idx+1);
        }
    }

    public static void main(String[] args) {
         String str="abc";
         printPermutation(str, "", 0);
    }

}
}
