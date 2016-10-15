public class Task2ForCycle {
    public static void main(String[] args) {
        printStar();
        printStar();
        printStar();
        printStar();
        printStar();

        System.out.println(); //Разделил строкой для наглядности

        printStarWithCycle();

    }

    public static void printStar(){
        System.out.println("*****");
    }

    public static void printStarWithCycle(){
        for(int i =0; i < 5; i++){
            System.out.println("*****");
        }
    }
}
