/*
* Joshua de Souza
* February 8, 2022
* CodingBat String1: atFirst
* Program returns string made up of the first two characters of a word.
*/
public String atFirst(String str) {
  String newString = "";
  if(str.length() == 1) return newString = str.charAt(0) + "@";
  if(str.length() == 0) return newString = "@@";
  newString = str.substring(0, 2);
  return newString;
}//end atFirst
