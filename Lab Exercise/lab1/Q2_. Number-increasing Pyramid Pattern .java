import java.util.Scanner;
class Number_increasing_Pyramid_Pattern{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        System.out.println("*** Number-increasing Pyramid Pattern *** ");
        System.out.print("Enter the number to print the patteren : ");
        int n = console.nextInt();
        
        for (int i = 0 ; i <= n ; i++)
        {
            for (int j = 0 ; j <= i ; j++)
            {
                System.out.print( j + " ");
            }
            System.out.println();
        }
    }
}
