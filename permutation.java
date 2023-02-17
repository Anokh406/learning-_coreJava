class permutation {
    public static void print_permutation(String str,String permutation) {
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currentChar=str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            print_permutation(newStr, permutation+currentChar);
        }

    }
    public static void main(String[] args) {
        String str="abcd";
        print_permutation(str, "");
    }
}