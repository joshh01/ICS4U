public int bigDiff(int[] nums) {
  int lowest = nums[0], highest = nums[0];
  for(int i = 0; i < nums.length; i++)
  {
    if(nums[i] < lowest)
    {
      lowest = nums[i];
    }
    if(nums[i] > highest)
    {
      highest = nums[i];
    }
  }
  return highest - lowest;
}
