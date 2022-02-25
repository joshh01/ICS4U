public int[] frontPiece(int[] nums) {
  if(nums.length < 2) return nums;
  int[] firstTwo = new int[2];
  firstTwo[0] = nums[0];
  firstTwo[1] = nums[1];
  return firstTwo;
}
