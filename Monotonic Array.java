class Solution {
    public boolean isMonotonic(int[] nums) {
       int[]asc=Arrays.copyOf(nums,nums.length);
        Arrays.sort(asc);
        System.out.println("the array in ascending order = "+Arrays.toString(asc));
        int[]desc=Arrays.copyOf(nums,nums.length);
        Arrays.sort(desc);
        for (int i=0;i< desc.length/2;i++){
            int set=desc[i];
            desc[i]=desc[desc.length-1-i];
            desc[desc.length-1-i]=set;
        }
        System.out.println("the array in descending order = "+Arrays.toString(desc));
        if (Arrays.equals(nums, asc) || Arrays.equals(nums, desc)){
            
            return true;
        }
        else {
            return false;
        }
    }
}
