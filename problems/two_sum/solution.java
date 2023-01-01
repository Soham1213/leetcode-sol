class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
    
        for (int j = 0; j < nums.length; j++) {
            int second = target - nums[j];
            if (map.containsKey(second) && map.get(second) != j) {
              int[] pair = {j, map.get(second)};
              return pair;
            }
        }
        return null;
    }
}