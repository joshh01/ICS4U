/*
* Joshua de Souza
* February 8, 2022
* CodingBat String2: bobThere
* Program returns true if a string contains "bob", but the "o" can be any character.
*/
public boolean bobThere(String str) {
  for(int i = 0; i < str.length() - 2; i++)
  {
    if(str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') return true;
  }
  return false;
}//end bobThere
