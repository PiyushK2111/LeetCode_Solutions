class Solution {
    public boolean uniformArray(int[] nums1) {
        // First find the min element in array
        int min=nums1[0];
        for(int x:nums1){
            if(x<min){
                min=x;
            }
        }

        // Check if the min element is odd....if odd , we can make all elements odd
        if(min%2!=0){
            return true;
        }else{

            // if min is even, then all elements must ALREADY be even
            for(int x:nums1){
                if(x%2!=0){
                    return false; // if an odd element is found then its impossible to convert
                }
            }
        }
        return true;
    }
}