public int[] midThree(int[] nums) {
  int[] middleArr = new int[3];
  middleArr[0] = nums[nums.length / 2 - 1];
  middleArr[1] = nums[nums.length / 2];
  middleArr[2] = nums[nums.length / 2 + 1];
  return middleArr;
}
