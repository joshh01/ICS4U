/*
* Joshua de Souza
* February 8, 2022
* CodingBat String1: plusOut
* Program returns a string with +s unless it has the original string.
*/
public String plusOut(String str, String word) {
  String newString = "";
  for(int i = 0; i < str.length(); i++)
  {
    if(i <= str.length() - word.length())
    {
      if(str.substring(i, i + word.length()).equals(word))
      {
        newString = newString + word;
        i += word.length() - 1;
      }
      else
      {
        newString = newString + "+";
      }
    } 
    else 
    {
      newString = newString + "+";  
    }
  }
  return newString;
}//end plusOut
