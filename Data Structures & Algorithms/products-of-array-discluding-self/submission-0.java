class Solution {
    public int[] productExceptSelf(int[] nums) {
        int k= nums.length;
        int[] arr = new int[k];
        

        for(int i=0;i<k;i++){
            int pro = 1;
            for(int j=0;j<k;j++){
                if(i!=j){
                    pro*=nums[j];
                }
            }
            arr[i]=pro;
        }
        return arr;
    }
}  
