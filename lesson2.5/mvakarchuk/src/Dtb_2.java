public class Dtb_2 {
  public static void main(String[] args) {
    int dec = 248;
    System.out.println(convertDecToBin2(dec));
  }

public static String convertDecToBin2(int decimal){
  String bin = "";
  for (int i = pot(decimal); i >= 0; i--){
    if (decimal >= power(2,i)){
      bin += '1';
      decimal -= power(2,i);
      }
  else {
    bin += '0';
          }
        }
  return bin;

    }

public static int pot(int num){
  int maxPower = 0;
  for (int i = maxPower; num >= power(2, i); i++){
    maxPower = i;
    }
  return maxPower;
  }

public static int power (int num, int pow){
  if (pow == 0) return 1;
	return num * power(num, pow-1);
	}
}
