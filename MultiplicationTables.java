package Aug_26_2025.java;

import java.util.Scanner;

public class MultiplicationTables
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        System.out.print("Enter the limit of numbers:");
        int limit = sc.nextInt();
        for(int i =1;i<=limit;i++)
        {
            int result = num*i;
            System.out.println(num + "*" + i + " = "+result);
        }

    }
}
