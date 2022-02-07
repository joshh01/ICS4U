/*
* Joshua de Souza
* February 7, 2022
* CodingBat String1: theEnd
* Program returns the first letter of a string.
*/
public String theEnd(String str, boolean front) {
  if(front == true) 
  {
    return str.substring(0, 1);
  }
  else
  {
    return str.substring(str.length() - 1, str.length());
  }
}//end theEnd
