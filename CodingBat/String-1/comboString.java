 /*
* Joshua de Souza
* February 7, 2022
* CodingBat String1: comboString
* Program returns a combined string.
*/
public String comboString(String a, String b) {
  if(a.length() < b.length()) 
  {
    return a + b + a;
  }
  else
  {
    return b + a + b;
  }
}//end comboString
