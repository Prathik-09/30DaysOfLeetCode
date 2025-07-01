class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        int[] arr=new int[26];
        int[] arr1=new int[26];
        int n=s.length();
        int k=p.length();
        int l=0,r=0;
        if(k>n){
            return ans;
        }
        while(r<k){
            arr[p.charAt(r)-'a']++;
            arr1[s.charAt(r)-'a']++;
            r++;
        }
        r--;
        while(r<n){
            if(Arrays.equals(arr,arr1)){
                ans.add(l);
            }
            r++;
            if(r!=n){
                arr1[s.charAt(r)-'a']++;
                
            }
            arr1[s.charAt(l)-'a']--;
            l++;
        }
        return ans;
    }
}
