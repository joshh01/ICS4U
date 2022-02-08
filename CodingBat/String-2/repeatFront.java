/*
* Joshua de Souza
* February 8, 2022
* CodingBat String1: repeatFront
* Program returns a string made of the first n characters of the string.
*/
public String repeatFront(String str, int n) {
  String repeatedString = "";
  for(int i = 0; i < n; i++)
  {
    repeatedString = repeatedString + str.substring(0, n - i);
  }
  return repeatedString;
}//end repeatFront
