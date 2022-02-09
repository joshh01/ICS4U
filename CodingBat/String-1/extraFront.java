/*
* Joshua de Souza
* February 8, 2022
* CodingBat String1: extraFront
* Program returns a string made of 3x the first 2 chars of the string.
*/
public String extraFront(String str) {
  if(str.length() < 2)
  {
    return str + str + str;
  }
  return str.substring(0, 2) + str.substring(0, 2) + str.substring(0, 2);
}//end extraFront
