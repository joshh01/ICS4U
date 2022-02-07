/*
* Joshua de Souza
* February 7, 2022
* CodingBat String1: extraEnd
* Program creates a string repeating the last 2 characters of a word.
*/
public String extraEnd(String str) {
  String endString = str.substring(str.length()- 2);
  return endString + endString + endString;
  //or return str.substring(str.length() - 2, str.length()) + str.substring(str.length() - 2, str.length()) + str.substring(str.length() - 2, str.length());
}//end extraEnd
