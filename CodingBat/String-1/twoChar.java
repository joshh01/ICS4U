/*
* Joshua de Souza
* February 7, 2022
* CodingBat String1: twoChar
* Program returns a string length 2 starting at the index.
*/
public String twoChar(String str, int index) {
  if((str.length() - index) < 2 || index < 0)
  {
    return str.substring(0 , 2);
  }
  else
  {
    return str.substring(index, index + 2);
  }
}//end twoChar
