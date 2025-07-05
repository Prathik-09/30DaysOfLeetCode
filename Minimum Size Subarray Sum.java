class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,s=0,m=Integer.MAX_VALUE;
        int n=nums.length;
        for(int r=0;r<n;r++){
            s+=nums[r];
            while(s>=target){
                m=Math.min(m,r-l+1);
                s-=nums[l];
                l++;
            }
        }
        if(m==Integer.MAX_VALUE){
            return 0;
        }
        return m;
    }
}
