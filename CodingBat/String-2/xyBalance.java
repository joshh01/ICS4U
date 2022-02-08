/*
* Joshua de Souza
* February 8, 2022
* CodingBat String2: xyBalance
* Program returns true if there is a 'y' after x's in the string.
*/
public boolean xyBalance(String str) {
  String xys = "";
  for(int i = 0; i < str.length(); i++) 
  {
    if(str.charAt(i) == 'x')
    {
      xys = xys + "x";
    }
    if(str.charAt(i) == 'y')
    {
      xys = xys + "y";
    }
  }
  if(xys.contains("x") && !xys.contains("y")) return false;
  if(xys.length() > 2 && xys.substring(xys.length() - 2, xys.length()).equals("xy")) return true;
  return true;
}//end xyBalance
