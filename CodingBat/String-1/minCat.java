/*
* Joshua de Souza
* February 8, 2022
* CodingBat String1: minCat
* Program returns concatenated strings of equal lengths.
*/
public String minCat(String a, String b) {
  if(a.length() > b.length())
  {
    return a.substring(a.length() - b.length()) + b;
  }
  else if (a.length() < b.length())
  {
   return a + b.substring(b.length() - a.length());
  }
  else
  {
    return a + b;
  }
}//end minCat
