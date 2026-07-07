class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer> set= new HashSet<>();

       for(int num:nums){
        set.add(num);
        } 
      int len=0;
       for(int num:set){
        if(!set.contains(num-1)){
            int start=num;
            int l=1;

            while(set.contains(start+1)){
                start++;
                l++;
            }
            len=Math.max(len,l);
        }

       }
       return len; 
    }
}
