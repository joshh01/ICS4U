/*
* Joshua de Souza
* February 7, 2022
* CodingBat String2: endOther
* Program returns true if either string appears at the end of the other.
*/
public boolean endOther(String a, String b) {
  if(a.length() <= b.length() && a.toLowerCase().equals(b.substring(b.length() - a.length() , b.length()).toLowerCase()))
  {
    return true;
  } else if(b.length() <= a.length() && b.toLowerCase().equals(a.substring(a.length() - b.length() , a.length()).toLowerCase()))
  {
    return true;
  }
  return false;
}//end endOther
