public class LearningArray {
  public static void main(String[] args) {
    int nums[] = { 1, 2, 3, 4 };
    // int nums2[] = new int[5];

    System.out.println("-----------before-----------");
    print(nums);

    for (int i = 0; i < nums.length; i++) {
      nums[i] = nums[i] * nums[i];
    }

    System.out.println("-----------after-----------");
    print(nums);

  }

  public static void print(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
