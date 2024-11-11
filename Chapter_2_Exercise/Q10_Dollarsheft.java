import java.util.Scanner;
public class Billcoin{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numebr : ");
        double number = scanner.nextDouble();
        
        int cents = (int) Math.round(number * 100);
        // 4672

        int tenDollar = cents / 1000; //4
        cents = cents % 1000;// 672
        int fiveDollar = cents / 500;//1
        cents = cents % 500; //172
        int oneDollar = cents / 100;//1
        cents = cents % 100;//72
        int quarters = cents / 25;//2
        cents = cents % 25;//23
        int dimes = cents / 10; //2
        cents %= 10;//3
        int nickels = cents / 5; // 0
        cents %= 5;//3
        int pennies = cents ; // 1 

        System.out.println(tenDollar + " ten dollar bills ");
        System.out.println(fiveDollar + " five dollar bills ");
        System.out.println(oneDollar + " one dollar bills");
        System.out.println(quarters + " quarters ");
        System.out.println(dimes + " dimes ");
        System.out.println(nickels + " nickels ");
        System.out.println(pennies + " pennies ");
   

    }
}
