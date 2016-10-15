public class Part3Task1ConvertBinaryToDec {
    public static void main(String[] args) {
        String binary = "011001";
        System.out.println(binaryToDec(binary));
    }

    public static int binaryToDec (String s){
        int sum = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt((s.length()-1) - i) == '1'){
                sum = sum + (int)Math.pow(2, i);
            }
        }
        return sum;
    }
}
