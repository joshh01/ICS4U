/*
* Joshua de Souza
* February 8, 2022
* CodingBat String1: prefixAgain
* Program returns whether a prefix returns in the string again.
*/
public boolean prefixAgain(String str, int n) {
  String prefix = "";
  prefix = str.substring(0, n);
  if(str.length() == 2)
  {
    if(str.charAt(1) == str.charAt(0)) return true;
  }
  for(int i = 0; i < str.length() - n; i++)
  {
    if(i >= prefix.length() && str.substring(i, i + prefix.length()).equals(prefix)) return true;
  }
  return false;
}//end prefixAgain
