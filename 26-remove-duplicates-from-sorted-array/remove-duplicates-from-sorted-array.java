class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet <Integer>s = new HashSet <>();

        int j=0;
        for ( int i=0; i<nums.length ; i++){
            if (!s.contains(nums[i])){
                s.add(nums[i]);
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
        
    }
}