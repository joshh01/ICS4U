/*
* Joshua de Souza
* February 7, 2022
* CodingBat String2: catDog
* Program returns true if "cat" and "dog" appear the same amount of times in a string.
*/
public boolean catDog(String str) {
  int counterDog = 0;
  int counterCat = 0;
  for(int i = 0; i < str.length() - 2; i++)
  {
    if(str.substring(i, i + 3).equals("cat"))
    {
      counterCat = counterCat + 1;
    }
    if(str.substring(i, i + 3).equals("dog"))
    {
      counterDog = counterDog + 1;
    }
  }
  if(counterDog == counterCat)
  {
    return true;
  }
  else
  {
    return false;
  }
}//end catDog
