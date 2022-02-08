/*
* Joshua de Souza
* February 8, 2022
* CodingBat String1: repeatEnd
* Program returns a string with the last n characters repeated.
*/
public String repeatEnd(String str, int n) {
  String multipliedString = "";
  for(int i = 0; i < n; i++)
  {
    multipliedString = multipliedString + str.substring(str.length() - n, str.length());
  }
  return multipliedString;
}//end repeatEnd
