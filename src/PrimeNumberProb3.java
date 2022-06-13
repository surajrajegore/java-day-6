import java.util.Scanner;

public class PrimeNumberProb3 {
    public static void primeNum(int number)
    {
        int temp=0;
        if (number==0 ||number== 1)
        {
            System.out.println(number+" is not prime number");
        }
        else
        {
        for(int i=2;i<number/2;i++)
        {
            if (number%i==0) {
                System.out.println(number + " is not prime number");
                temp = 1;
                break;
            }
            }

                if (temp==0) {
                    System.out.println(number + " is prime number");

                }
            }
        }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value of number :");
        int number  = sc.nextInt();
        primeNum(number);
    }
}
