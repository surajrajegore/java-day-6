import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class StopwatchProg6 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long startTime = System.currentTimeMillis();
       System.out.println("Enter any number to pause excution ");
       int n = sc.nextInt();

        long endTime = System.currentTimeMillis();

        long timeElapsed = endTime - startTime;

        System.out.println("Elapsed time " + (double)timeElapsed/1000+" second");

    }
}
