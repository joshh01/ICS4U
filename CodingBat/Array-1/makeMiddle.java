public int[] makeMiddle(int[] nums) {
  int[] middle2 = new int[2];
  middle2[0] = nums[nums.length / 2 - 1];
  middle2[1] = nums[nums.length / 2];
  return middle2;
}
