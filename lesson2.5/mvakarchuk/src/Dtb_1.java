public class Dtb_1 {
  public static void main(String[] args) {
    int dec = 248;
    System.out.println(convertDecToBin1(dec));
  }

public static String convertDecToBin1(int decimal){
  String result = "";
  int unicodeBias = 48;

  for (int i = decimal; i > 0; i /= 2){
    result += (char)((i % 2) + unicodeBias);
    }
  return reverseString(result);
  }

public static String reverseString (String string){
  char[] chArray = string.toCharArray();
  char[] reverseArray = new char[chArray.length];
  String reversedString;
  for (int first = 0, last = chArray.length - 1; first < chArray.length; first ++, last--){
    reverseArray[first] = chArray[last];
    }
  reversedString = new String(reverseArray);
  return reversedString;
  }
}
