/*
* Joshua de Souza
* February 7, 2022
* CodingBat String2: countHi
* Program returns the number of times "hi" appears in the string.
*/
public int countHi(String str) {
  int counter = 0;
  for(int i = 0; i < str.length() - 1; i++)
  {
    if(str.substring(i, i + 2).equals("hi"))
    {
      counter = counter + 1;
    }
  }
  return counter;
}//end countHi
