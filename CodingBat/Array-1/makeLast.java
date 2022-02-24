public int[] makeLast(int[] nums) {
  int[] newArr = new int[nums.length * 2];
  newArr[newArr.length - 1] = nums[nums.length -1];
  return newArr;
}
