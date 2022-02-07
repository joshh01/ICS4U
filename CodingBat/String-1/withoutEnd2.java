/*
* Joshua de Souza
* February 7, 2022
* CodingBat String1: withoutEnd2
* Program returns strings without the first and letters.
*/
public String withouEnd2(String str) {
  if(str.length() > 1) 
  {
    return str.substring(1, str.length() - 1);
  }
  else
  {
    return "";
  }
}//end withoutEnd2
