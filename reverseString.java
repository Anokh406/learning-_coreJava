public class reverseString {
    public static void Reverse_string(String str,int idx){
        if(idx ==0){
            System.out.print(str.charAt(idx));
            return;
        }
        System.out.print(str.charAt(idx));
        Reverse_string(str, idx-1);//recursive call funtion to reverse
    }
    public static void main(String[] args) {
        String str="anokh";
        Reverse_string(str,str.length()-1);
    }
}
