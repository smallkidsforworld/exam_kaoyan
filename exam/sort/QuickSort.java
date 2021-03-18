import java.util.Arrays;

public class QuickSort {
    public static void quickSort(int[] nums) {
        quick(nums, 0, nums.length - 1);
    }

    public static void quick(int[] nums, int start, int end) {
        if (end <= start)
            return;
        int flag = nums[start];
        int left = start, right = end;
        while (left < right) {
            while (left < right && nums[right] >= flag)
                right--;
            nums[left] = nums[right];
            while (left < right && nums[left] < flag)
                left++;
            nums[right] = nums[left];
        }
        nums[left] = flag;
        quick(nums, start, left - 1);
        quick(nums, right + 1, end);
    }

    public static void main(String[] args) {
        int[] nums = new int[] { 1, 6, 4, 6, 2, 8, 7, 3 };
        quickSort(nums);
        Arrays.stream(nums).forEach(System.out::println);
    }
}