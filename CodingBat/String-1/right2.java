/*
* Joshua de Souza
* February 7, 2022
* CodingBat String1: right2
* Program returns a combined string where the last 2 characters are sent to the start.
*/
public String right2(String str) {
  return str.substring(str.length() - 2, str.length()) + str.substring(0, str.length() - 2);
}//end right2
