/*
* Joshua de Souza
* February 8, 2022
* CodingBat String1: conCat
* Program returns the concatenation without a doubled middle character.
*/
public String conCat(String a, String b) {
  if(b.length() == 0) return a;
  if(a.length() == 0) return b;
  if(a.charAt(a.length() - 1) == b.charAt(0))
  {
    return a.substring(0, a.length() - 1) + b;
  }
  return a + b;
}//end conCat
