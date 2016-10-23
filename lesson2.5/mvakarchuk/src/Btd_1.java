public class Btd_1 {
  public static void main(String[] args) {
    String binary = "1110010";
    if (checkIsOk(binary))
    System.out.println(convertDecToBin1(binary));
    else
    System.out.println("Check your number");
  }

  public static int convertDecToBin1(String binary){
    int sum = 0;
    for (int i = 0; i < binary.length(); i++){
      if (binary.charAt((binary.length()-1) - i) == '1'){
        sum += power(2, i);
            }
        }
        return sum;
    }

public static int power (int num, int pow){
	if (pow == 0) return 1;
	return num * power(num, pow-1);
    }

public static boolean checkIsOk(String string) {
  for (int i = 0; i < string.length(); i++){
    if (string.charAt(i) < '0' || string.charAt(i) > '9')
    return false;
      }
    return true;
    }
}
