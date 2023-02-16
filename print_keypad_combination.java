class print_keypad_combination {
    public static String[] keypad={".","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};
    public static void Print_combination(String str,int idx,String combination){
        if(idx==str.length()){
            System.out.println(combination);
            return;
        }
        char
         currentCharacter=str.charAt(idx);
         String mapping=keypad[currentCharacter-'0'];
         for(int i=0;i<mapping.length();i++){
            Print_combination(str,idx+1,combination+mapping.charAt(i));
         }
    }
    public static void main(String[] args) {
        String str="23";
        Print_combination(str,0,"");
    }
}