public class reverseString {

    // find ocurances 
    public static int first=-1;
    public static int last=-1;
    public static void find_occurrences(String str,int idx,char element) {
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currentChar = str.charAt(idx);
        if(currentChar==element){
            if(first==-1) {
                first=idx;
            }else{
                last=idx;
            }
        }
        find_occurrences(str, idx+1, element);
    }
    public static void Reverse_string(String str,int idx){
        if(idx ==0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        Reverse_string(str, idx-1);//recursive call funtion to reverse
    }
    public static void main(String[] args) {
        String str="abaacdaefaah";
        // Reverse_string(str,str.length()-1);
        find_occurrences(str, 0,'a');
    }
}
