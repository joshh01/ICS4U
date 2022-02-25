public int maxTriple(int[] nums) {
  int index = nums[0];
  if(nums[nums.length / 2] > index)
  {
    index = nums[nums.length / 2];
  }
  if(nums[nums.length - 1] > index)
  {
    index = nums[nums.length - 1];
  }
  return index;
}
