/*
* Joshua de Souza
* February 8, 2022
* CodingBat String1: lastTwo
* Program returns a string with swapped last letters.
*/
public String lastTwo(String str) {
  if(str.length() == 0) return "";
  if(str.length() >= 2) return str.substring(0, str.length() - 2) + str.charAt(str.length() - 1) + str.charAt(str.length()-2);
  return str;
}//end lastTwo
