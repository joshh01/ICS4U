/*
* Joshua de Souza
* February 8, 2022
* CodingBat String1: lastChars
* Program returns the last 2 letters of 2 strings. 
*/
public String lastChars(String a, String b) {
  char aLastChar;
  char bLastChar;
  if(a.length() == 0) 
  {
    aLastChar = '@';
  }
  else
  {
    aLastChar = a.charAt(0);
  }
  if(b.length() == 0) 
  {
    bLastChar = '@';
  }
  else
  {
    bLastChar = b.charAt(b.length() - 1);
  }
  return "" + aLastChar + bLastChar;
}//end lastChars
