/*
* Joshua de Souza
* February 8, 2022
* CodingBat String2: xyzThere
* Program returns true if "xyz" is in the string, but not preceeded by a "."
*/
public boolean xyzThere(String str) {
  boolean nox = false;
  for(int i = 0; i < str.length() - 2; i++) {
    if(str.substring(i, i + 3).equals("xyz")) {
      if(i == 0) nox = true;
      if(i != 0 && str.charAt(i-1) != '.') nox = true;
    } 
  }
  return nox;
}//end xyzThere
