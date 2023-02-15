public class moveAllX {
    public static void moveall_X(String str,int idx,int count,String newString){
        if(idx ==str.length()){
            for(int i=0;i<count; i++){
                newString +='x';
            }
            System.out.println(newString);
            return;
        }
        char currentChar=str.charAt(idx);
        if(currentChar=='x'){
            count++;
            moveall_X(str, idx+1, count, newString);
        }else{
            newString += currentChar;
            moveall_X(str, idx+1, count, newString);

        }
    }
    public static void main(String[] args) {
        String str ="axbcxxd";
        moveall_X(str, 0, 0, "");
    }
}
