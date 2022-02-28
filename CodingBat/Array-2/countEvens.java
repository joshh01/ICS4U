public int countEvens(int[] nums) {
  int evens = 0;
  for(int i = 0; i < nums.length; i++)
  {
    if(nums[i] % 2 == 0) 
    {
      evens++;
    }
  }
  return evens;
}
