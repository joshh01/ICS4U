/*
* Joshua de Souza
* February 8, 2022
* CodingBat String1: oneTwo
* Program returns a new string 
*/
public String oneTwo(String str) {
  String newString = "";
  for(int i = 0; i < str.length() - 2; i += 3)
	{
		  newString = newString + str.substring(i + 1, i + 3) + str.charAt(i);
	}
	return newString;
}//end oneTwo
