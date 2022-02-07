/*
* Joshua de Souza
* February 7, 2022
* CodingBat String1: firstTwo
* Program returns a string with the first two letters of a word.
*/
public String firstTwo(String str) {
  if(str.length() < 2) 
  {
    return str;
  }
  return str.substring(0, 2);
}//end firstTwo
