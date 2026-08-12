class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            ArrayList<Integer> temp = new ArrayList<>();
            // int digit = 0;
            while (nums[i] != 0){
                temp.add(nums[i] % 10);
                // ans.add(digit);
                nums[i] /= 10;
            }
            Collections.reverse(temp);
            ans.addAll(temp);
        }
        int[] arr = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++){
            arr[i] = ans.get(i);
        }
        return arr;
    }
}