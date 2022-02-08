/*
* Joshua de Souza
* February 8, 2022
* CodingBat String2: mixString
* Program returns a string using mixed characters from 2 strings.
*/
public String mixString(String a, String b) {
  String mixedString = "";
  if(b.length() >= a.length())
  {
    for(int i = 0; i < a.length(); i++)
    {
      mixedString = mixedString + a.charAt(i) + b.charAt(i); 
    }
    mixedString = mixedString + b.substring(a.length(), b.length());
  }
  if(a.length() > b.length())
  {
    for(int i = 0; i < b.length(); i++)
    {
      mixedString = mixedString + a.charAt(i) + b.charAt(i); 
    }
    mixedString = mixedString + a.substring(b.length(), a.length());
  }
  return mixedString;
  //abab
}//end mixString
