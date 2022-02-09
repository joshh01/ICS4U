/*
* Joshua de Souza
* February 8, 2022
* CodingBat String1: getSandwich
* Program returns the string between "bread".
*/
public String getSandwich(String str) {
  int breadCount = 0, firstIndex, lastIndex;
  for(int i = 0; i < str.length() - 4; i++)
  {
    if(str.substring(i, i + 5).equals("bread"))
    {
      breadCount++;
    }
  }
  if(breadCount >= 2) 
  {
    return str.substring(str.indexOf("bread") + 5, str.lastIndexOf("bread"));
  }
  return "";
}//end getSandwich
