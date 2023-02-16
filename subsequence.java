import java.util.HashSet;

public class subsequence {
    public static void subsequences(String str,int idx, String newString){
        if(idx == str.length()){
            System.out.println(newString);
            return;
        }
        char currentChar=str.charAt(idx);
        // to be
        subsequences(str, idx+1, newString+currentChar);
        // not to be
        subsequences(str, idx+1, newString);
    }
    public static void subsequences_unique(String str,int idx, String newString,HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(newString)){
                return;
            }else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currentChar=str.charAt(idx);
        // to be
        subsequences_unique(str, idx+1, newString+currentChar,set);
        // not to be
        subsequences_unique(str, idx+1, newString,set);
    }
    public static void main(String[] args) {
         String str="aaa";
         HashSet<String> set = new HashSet<String>();
         subsequences_unique(str, 0, "",set);
    }
}
