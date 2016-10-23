public class Btd_2 {
	public static void main(String[] args) {
        String binary = "1110010";
        if (checkIsOk(binary))
            System.out.println(convertDecToBin2(binary));
        else
            System.out.println("Check your number!");
    }

    public static int convertDecToBin2(String binary){
        int sum = 0;
        int unicodeBias = 48;
        for (int i = 0; i < binary.length(); i++){
            sum = sum * 2 + ((int)binary.charAt(i) - unicodeBias);
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
