import java.util.Scanner;

public class PerfectNumberProb2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Value of number");
        int number = sc.nextInt();
        int sum = 0;
        for (int itr = 1;itr < number;itr++)
        {
            if(number%itr==0)
            {
                sum = sum + itr;
            }
        }
        if (sum==number)
        {
            System.out.println(number+" It is Perfect number");
        }
        else
        {
            System.out.println(number+" It is not Perfect number");
        }

    }
}
