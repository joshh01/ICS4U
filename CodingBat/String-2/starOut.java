/*
* Joshua de Souza
* February 8, 2022
* CodingBat String1: starOut
* Program returns a string without characters next to *s.
*/
public String starOut(String str) {
  String newString = "";
  for(int i = 0; i < str.length(); i++)
  {
    if(str.charAt(i) == '*')
    {
      newString = newString;
    }
    else if(i > 0 && str.charAt(i - 1) == '*')
    {
      newString = newString;
    }
    else if(i < str.length() - 1 && str.charAt(i + 1) == '*')
    {
      newString = newString;
    }
    else
    {
      newString = newString + str.charAt(i);
    }
  }
  return newString;
}//end starOut
