public int start1(int[] a, int[] b) {
  int counter = 0;
  if(a.length > 0 && a[0] == 1) counter++;
  if(b.length > 0 && b[0] == 1) counter++;
  return counter;
}
