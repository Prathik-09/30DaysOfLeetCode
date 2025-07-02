class Solution {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        if (n == 0) return;            
        k = k % n;
        if (k > n) return;
      
        int[] temp = new int[k];
        for(int i=k+1;i<n;i++){
            temp[i-k-1]=nums[i];
        }
        for(int i=0;i<k;i++){
            nums[i+k]=nums[i];
        }
        for(int i=k+1;i<k;i++){
            nums[i-k-1]=temp[i];
        }
    }
}
