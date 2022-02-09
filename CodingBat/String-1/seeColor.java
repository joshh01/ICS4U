/*
* Joshua de Souza
* February 8, 2022
* CodingBat String1: seeColor
* Program returns red or blue if the string begins with either.
*/
public String seeColor(String str) {
  if(str.length() >= 3 && str.substring(0, 3).equals("red")) return "red";
  if(str.length() >= 4 && str.substring(0, 4).equals("blue")) return "blue";
  return "";
}//end seeColor
