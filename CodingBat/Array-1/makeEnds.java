public int[] makeEnds(int[] nums) {
  int[] length2 = new int[2];
  length2[0] = nums[0];
  length2[1] = nums[nums.length - 1];
  return length2;
}
