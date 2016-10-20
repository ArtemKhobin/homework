
public class ConvertBinToDec2 {
	public static void main(String[] args) {
        String binary = "1011001";
        if (checkIsOk(binary))
            System.out.println(convertBinToDec2(binary));
        else
            System.out.println("Check your number!");
    }

    public static int convertBinToDec2 (String string){
        int sum = 0;
        int unicodeBias = 48;
        for (int i = 0; i < string.length(); i++){
            sum = sum * 2 + ((int)string.charAt(i) - unicodeBias);
        }
        return sum;
    }
    public static boolean checkIsOk(String string) {
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) < '0' || string.charAt(i) > '9')
                return false;
        }
        return true;
    }

}
