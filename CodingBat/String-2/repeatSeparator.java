/*
* Joshua de Souza
* February 8, 2022
* CodingBat String1: repeatSeparator
* Program returns a string made of words separated by a separator string.
*/
public String repeatSeparator(String word, String sep, int count) {
  String bigWord = "";
  for(int i = 0; i < count; i++) 
  {
    if(i == count - 1) 
    {
      bigWord = bigWord + word;
    }
    else
    {
      bigWord = bigWord + word + sep;
    }
  }
  return bigWord;
}//end repeatSeparator
