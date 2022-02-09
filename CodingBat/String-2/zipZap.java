/*
* Joshua de Souza
* February 8, 2022
* CodingBat String1: zipZap
* Program returns a string with "zip" and "zap" where the middle letter is missing.
*/
public String zipZap(String str) {
  String newString = "";
  if(str.length() < 3)
  {
    return newString = str;
  }
  for(int i = 0; i < str.length(); i++)
  {
    if(str.charAt(i) == 'z' && str.charAt(i + 2) == 'p')
		{
			newString = newString + "zp";
			i+=2;
		} 
		else
		{
	    newString = newString + str.charAt(i);	  
		}
  }
  return newString;
}//end zipZap
