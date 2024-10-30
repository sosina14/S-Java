//  Que 1,  sum of the digit
import java.util.Scanner;
class Sumofdigits{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num = console.nextInt();
        double sum = 0;
        
        while (num != 0){
            
        double temp = num % 10;
        sum += temp;
        num = num /10; 
            
        }
        System.out.println("The number is "+ sum);
}
}
