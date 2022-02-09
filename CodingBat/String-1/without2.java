/*
* Joshua de Souza
* February 8, 2022
* CodingBat String1: without2
* Program returns a string without the first 2 characters if they appear at the end.
*/
public String without2(String str) {
  if(str.length() < 2)
  {
    return str;
  }
  if(str.substring(0, 2).equals(str.substring(str.length() - 2, str.length())))
  {
    return str.substring(2, str.length());
  }
  return str;
}//end without2
