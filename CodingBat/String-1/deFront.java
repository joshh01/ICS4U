/*
* Joshua de Souza
* February 8, 2022
* CodingBat String1: deFront
* Program returns a string without the first 2 characters.
*/
public String deFront(String str) {    
  String newString = "";
  if(str.charAt(0) == 'a')
  {
    newString = newString + "a";
  }
  if(str.charAt(1) == 'b')
  {
    newString = newString + "b";
  }
  newString = newString + str.substring(2, str.length());
  return newString;
}//end deFront
