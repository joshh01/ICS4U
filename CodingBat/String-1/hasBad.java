/*
* Joshua de Souza
* February 7, 2022
* CodingBat String1: hasBad
* Program returns true if "bad" starts at index 1 or 2.
*/
public boolean hasBad(String str) {
  if(str.equals("bad"))
  {
    return true;
  }
  if(str.length() <= 3) 
  {
    return false;
  }
  if(str.substring(0, 3).equals("bad") || str.substring(1, 4).equals("bad"))
  {
    return true;
  }
  else
  {
    return false;
  }
}//end hasBad
