/*   QUE 1 , Write a program to display sum of the first 100 integer numbers using for loop.
class sosi{
    public static void main(String[] args){
        int sum = 0;
        for(int i = 0 ; i <= 10 ; i++){
            sum =sum+ i;
            System.out.println(sum);
            
        }
    }
}*/
/*QUE 2 , Write statements that can be used in a Java program to read two integers and display the number of integers that lie between them, including the integers themselves. For example, four integers are between 3 and 6: 3, 4, 5, and 6.

import java.util.Scanner;
class Sosi {
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
        System.out.print("Write two numbers to find the numbers between them \n Enter first number ");
        int n1 = scanner.nextInt();
        System.out.print("Enter 2nd number ");
        int n2 = scanner.nextInt();
        for (int i = n1 ; i <= n2 ; i++){
            System.out.print(" " + i);
        }
    }
}
*/
/* QUE 3 , Write a program that reads an integer value and prints the sum of all even integers between 2 and the input value, inclusive. Print an error message if the input value is less than 2. 
*/
import java.util.Scanner;
class Sosi {
    public static void main(String[] args){
         Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to find the numbers between 2 and it    \n Enter the number ");
        int n1 = scanner.nextInt();
       if (n1 >= 2){
        for (int i = 2 ; i <= n1 ; i++){
            System.out.print(" " + i);
        }
       }
        else {
            System.out.print("ERROR" );
        }
       
    }
}
