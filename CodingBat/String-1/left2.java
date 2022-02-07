/*
* Joshua de Souza
* February 7, 2022
* CodingBat String1: left2
* Program returns a combined string where the first 2 characters are sent to the end.
*/
public String left2(String str) {
  return str.substring(2, str.length()) + str.substring(0, 2);
}//end left2
