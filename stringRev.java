package Aug_26_2025;

import java.util.Scanner;

public class stringRev
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string = ");
        String str = sc.next();
        String rev = "";
        for(int i =0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            rev = ch + rev;
        }
        System.out.println(rev);
    }
}
