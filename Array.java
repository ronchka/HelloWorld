public class Array {

    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4,5};
        int last = nums[nums.length - 1];
        int first = nums[nums.length - 5];
        nums[0] = last;
        nums[nums.length-1] = first;
        for (int i = 0; i <5; i++) {
            System.out.print(nums[i]);
        }
    }

}
