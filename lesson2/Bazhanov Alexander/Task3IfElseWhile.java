public class Task3IfElseWhile {
    public static void main(String[] args) {
        int currYear = 2001;
        while (currYear <= 2016){
           if (yearIsLeap(currYear)){
               System.out.println( currYear + " - Wow! This is leap-year!");
           }
           else{
               System.out.println(currYear + " - Ups! This is not leap-year!");
           }
            currYear++;
        }

    }

    public static boolean yearIsLeap (int year){
        return (year % 4 == 0 && year % 100 !=0 || year % 400 == 0);
    }
}
