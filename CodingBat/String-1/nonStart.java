/*
* Joshua de Souza
* February 7, 2022
* CodingBat String1: nonStart
* Program returns a combined string without the first letters.
*/
public String nonStart(String a, String b) {
  return a.substring(1, a.length()) + b.substring(1, b.length());
}//end nonStart
