class Solution {
    public int firstMissingPositive(int[] nums) {
//         // HashSet<Integer> set = new HashSet<>();
//         // for(int ele : nums){
//         //     if(ele > 0){
//         //         set.add(ele);
//         //     }
//         // }

//         // for(int i=1; i<=Integer.MAX_VALUE; i++){
//         //     if(!set.contains(i)){
//         //         return i;
//         //     }
//         // }

//         // return 1;

//         int min = Integer.MAX_VALUE;
//         int max = Integer.MIN_VALUE;

//         for(int ele : nums) {
            
//             min = Math.min(min, ele);
//             max = Math.max(max, ele);
//         }


//         if(min > 1){
//             return 1;
//         }

//         int sum = 0;

//         for(int 0; i){
//             if(ele > 0){
//                 sum += ele;
//             }
//         }


//         return 0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]<=0){
                nums[i]=n+1;
            }
        }
        for(int i=0;i<n;i++){
            int val=Math.abs(nums[i]);
            if(val<=n){
                nums[val-1]=-Math.abs(nums[val-1]);
            }
        }
        for(int i=0;i<n;i++){
            if(nums[i]>0){
                return i+1;
            }
        }
        return n+1;
    }
}
 