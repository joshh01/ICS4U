public int[] front11(int[] a, int[] b) {
  int[] firstChars = new int[2];
  int[] firstChar = new int[1];
  int[] noChars = new int[0];
  if(a.length == 0 && b.length == 0) return noChars;
  if(a.length > 0 && b.length > 0) 
  {
    firstChars[0] = a[0];
    firstChars[1] = b[0];
    return firstChars;
  }
  if(a.length == 0) 
  {
    firstChar[0] = b[0];
    return firstChar;
  }
  if(b.length == 0)
  {
    firstChar[0] = a[0];
    return firstChar;
  }
  return firstChars;
}
