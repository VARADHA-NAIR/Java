package Aug_26_2025;

import java.util.Scanner;

public class primeNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        boolean bs = true;

        if(num<=1) {
            bs = false;
        }else
        {
            for(int i=2;i<num;i++)
            {
                if(num%i == 0)
                {
                    bs = false;
                    break;
                }
            }
        }


        if(bs)
        {
            System.out.println(num + " is a prime number");
        }else
        {
            System.out.println(num +" is not a prime number");
        }

    }
}
