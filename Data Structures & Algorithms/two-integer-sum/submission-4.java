class Solution {
public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> map = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
        Integer second = map.get(target - nums[i]);
        
        if (second != null && i != second) {
            return new int[]{second, i};
        } else {
            map.put(nums[i], i);
        }
    }
    
    return null;
}
}
