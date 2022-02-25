public int[] make2(int[] a, int[] b) {
  int[] make2 = new int[2];
  if(a.length == 2) return a;
  if(a.length == 1) 
  {
    make2[0] = a[0];
    make2[1] = b[0];
  }
  if(a.length > b.length)
  {
    make2[0] = a[0];
    make2[1] = a[1];
  }
  if(a.length < 2 && a.length < b.length)
  {
    if(a.length == 0) return b;
    if(a.length == 1)
    {
      make2[0] = a[0];
      make2[1] = b[0];
    }
  }
  return make2;
}
