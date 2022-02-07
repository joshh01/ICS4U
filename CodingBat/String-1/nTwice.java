/*
* Joshua de Souza
* February 7, 2022
* CodingBat String1: ntwice
* Program returns made of the first and last n chars of the string.
*/
public String nTwice(String str, int n) {
  return str.substring(0, n) + str.substring(str.length() - n, str.length());
}//end nTwice
