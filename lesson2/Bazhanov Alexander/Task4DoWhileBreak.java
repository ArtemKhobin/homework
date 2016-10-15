public class Task4DoWhileBreak {
    public static void main(String[] args) {
        int count = 0;
        do{
            System.out.println("It seems that I'm here forever");
            count++;
            if (count == 5) break;
        }while(true);
    }

}
