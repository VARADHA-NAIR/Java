package Aug_26_2025;

import java.util.Scanner;

public class swappingNumbers
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a first number =");
        int num1 = sc.nextInt();
        System.out.print("Enter a second number =");
        int num2 = sc.nextInt();
        System.out.println("Number before swapping is : "+num1 +" and "+num2);
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("Numbers after swapping is :"+num1 +" and "+num2);
    }
}
