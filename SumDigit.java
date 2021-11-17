import java.util.*;
public class SumDigit{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please Enter First Integer Numbers:");
        int number1 = input.nextInt();
        float number1 = input.nextInt();

        System.out.println("Please Enter Second Integer Numbers:");
        int number2 = input.nextInt();

        System.out.println("Please Enter Third Integer Numbers:");
        int number3 = input.nextInt();

        int Sum = number1 + number2 + number3;
        System.out.println("Sum of the digits" + Sum);

        
    }
}