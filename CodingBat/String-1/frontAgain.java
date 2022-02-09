/*
* Joshua de Souza
* February 8, 2022
* CodingBat String1: frontAgain
* Program returns true if the first 2 characters appear at the end of a string.
*/
public boolean frontAgain(String str) {
 if(str.length() >= 2 && str.substring(0, 2).equals(str.substring(str.length() - 2, str.length()))) return true;
 return false;
}//end frontAgain
