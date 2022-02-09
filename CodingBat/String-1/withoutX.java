//INEFFICIENT
/*
* Joshua de Souza
* February 8, 2022
* CodingBat String1: withoutX
* Program returns a string without x's on the front or back.
*/
public String withoutX(String str) {
  String newString = "";
  if(str.length() == 0) return "";
  if(str.charAt(0) != 'x')
  {
    newString = newString + str.charAt(0);
  }
  if(str.length() > 1)
  {
    newString = newString + str.substring(1, str.length() - 1);
  } 
  if(str.charAt(str.length() - 1) != 'x')
  {
    newString = newString + str.charAt(str.length() - 1);
  }
  return newString;
}//end withoutX
