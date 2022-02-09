/*
* Joshua de Souza
* February 8, 2022
* CodingBat String1: xyzMiddle
* Program returns if "xyz" appears in the middle of the string.
*/
public boolean xyzMiddle(String str) {
  int beforeCount = 0;
  int afterCount = 0;
  for(int i = 0; i < str.length() - 2; i++)
  {
    if(str.substring(i, i + 3).equals("xyz")) 
    {
      beforeCount = i;
      afterCount = str.length() - (i + 3);
      if(beforeCount == afterCount) return true;
      if(beforeCount + 1 == afterCount) return true;
      if(beforeCount == afterCount + 1) return true;
    }
  }
  return false;
}//end xyzMiddle
