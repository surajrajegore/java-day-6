import java.util.Scanner;

public class FibonacciProb1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num1=0,num2=1,num3;
        System.out.println("Enter the Upper bound: ");
        int upperBound = sc.nextInt();
        for (int itr = 2;itr <=upperBound;itr++)
        {
            num3=num1+num2;
            System.out.print(num3+",");
            num1 = num2;
            num2 = num3;
        }

    }
}
