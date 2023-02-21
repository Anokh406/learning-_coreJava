public class backtrack {
   
    public static void printPermutation(String str , int idx, String permutation ){
        if(str.length()==0){
            System.out.println(permutation);
            return;
        }
        for(int i=0;i<str.length();i++){
            char currChar = str.charAt(i);
            String newStr=str.substring(0,i)+str.substring(i+1);
            printPermutation(newStr, idx+1, permutation+currChar);
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permuteHelper(nums, new ArrayList<>(), result);
        return result;
    }
    
    private void permuteHelper(int[] nums, List<Integer> permutation, List<List<Integer>> result) {
        if (permutation.size() == nums.length) {
            result.add(new ArrayList<>(permutation));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if (permutation.contains(nums[i])) {
                    continue;
                }
                permutation.add(nums[i]);
                permuteHelper(nums, permutation, result);
                permutation.remove(permutation.size() - 1);
            }
        }
    }
    public static void main(String[] args) {
        //  String str="abc";
        //  printPermutation(str, 0,"");
        int[] nums = {1,1,2,3,3,4,4,8,8};
        permute(nums);
    }
// leet code problem first solve
    // public int singleNonDuplicate(int[] nums) {
    //     int left = 0;
    //     int right = nums.length - 1;
    //     while (left < right) {
    //         int mid = (left + right) / 2;
    //         if (mid % 2 == 1) {
    //             // if mid is odd, move to the previous even index
    //             mid--;
    //         }
    //         if (nums[mid] != nums[mid + 1]) {
    //             // single element is to the left of mid
    //             right = mid;
    //         } else {
    //             // single element is to the right of mid
    //             left = mid + 2;
    //         }
    //     }
    //     return nums[left];
    // }
    // public static void main(String[] args){
    //     int[] nums = {1,1,2,3,3,4,4,8,8};
    //     singleNonDuplicate(nums);
    // }
}
