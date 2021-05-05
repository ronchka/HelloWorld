public class Array {

    public static void main(String[] args)
    {
        int[] nums = {1,2,3,4,5};
        int last = nums[nums.length - 1];
        int first = nums[0];
        nums[0] = last;
        nums[nums.length-1] = first;
        int sum = nums[0] + nums[nums.length/2];
        System.out.println(sum);
    }

}
