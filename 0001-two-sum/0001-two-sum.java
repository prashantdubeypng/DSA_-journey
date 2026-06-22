class Solution {
    public int[] twoSum(int[] num, int target) {
        HashMap<Integer ,Integer> contain = new HashMap<>();
        int[] ans = new int[2];
        for(int i = 0; i<num.length;i++){
            if(contain.containsKey(target - num[i])){
                ans[0] = i;
                ans[1] = contain.get(target-num[i]);
                return ans;
            }
            contain.put(num[i],i);
        }
        return ans;
    }
}