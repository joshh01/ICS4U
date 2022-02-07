/*
* Joshua de Souza
* February 7, 2022
* CodingBat String1: endsLy
* Program returns true if a string ends with "ly".
*/
public boolean endsLy(String str) {
  if(str.length() < 2)
  {
    return false;
  }
  if(str.substring(str.length() - 2, str.length()).equals("ly"))
  {
    return true;
  }
  else
  {
    return false;
  }
}//end endsLy
