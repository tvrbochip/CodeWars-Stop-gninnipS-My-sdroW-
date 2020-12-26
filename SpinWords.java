/*
Write a function that takes in a string of one or more words, and returns the same string, 
but with all five or more letter words reversed (Just like the name of this Kata). 
Strings passed in will consist of only letters and spaces. Spaces will be included only when more than one word is present.

Examples: spinWords( "Hey fellow warriors" ) => returns "Hey wollef sroirraw"
spinWords( "This is a test") => returns "This is a test" spinWords( "This is another test" )=> 
returns "This is rehtona test"
*/

public class SpinWords {

  public String spinWords(String sentence) {
    String[] strAr = sentence.split(" ");
    StringBuilder sb = new StringBuilder();
    
    for (int i = 0; i < strAr.length; i++) {
      if (strAr[i].length() >= 5) {
        char[] chr1 = new char[strAr[i].length()];
        for (int j = chr1.length - 1; j >= 0; j--) {
          sb.append(strAr[i].charAt(j));
        }
        sb.append(" ");
      } else {
        sb.append(strAr[i]);
        sb.append(" ");
      }
    }
    return sb.toString().substring(0, sb.length() - 1);
  }
}
