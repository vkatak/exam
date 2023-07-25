import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in))
        {
            System.out.print("Enter number : ");
            int num=sc.nextInt();
            long fact=1;
            while(num>0)
            {
                fact=fact*num;
                num--;
            }
            System.out.println("The factorial of the number is : "+fact);

        } catch(Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}