/*
* Joshua de Souza
* February 7, 2022
* CodingBat String2: countCode
* Program returns the amount of times "code" is said, ignoring the third letter.
*/
public int countCode(String str) {
  int counter = 0;
  for(int i = 0; i < str.length() - 3; i++)
  {
    if(str.substring(i, i + 2).equals("co") && str.substring(i + 3, i + 4).equals("e"))
    {
      counter = counter + 1;
    }
  }
  return counter;
}//end countCode
