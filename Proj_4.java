import java.util.ArrayList;
import java.util.Collections;

public class Proj_4 {
    public static void main(String[] args)
    {

        /* A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.*/

        ArrayList<Integer> list = new ArrayList<>();
        int palindrome;
        int n, reverse = 0;
        for(int i = 100; i < 1000; i++)
        {
            for(int j = 100; j < 1000; j++)
            {
                palindrome = i * j;
                n = palindrome;

                reverse=0;
                while(n!=0)
                {
                    reverse = reverse*10;
                    reverse = reverse + n%10;
                    n = n/10;
                }
                if(palindrome==reverse)
                {
                    list.add(reverse);
                    //System.out.println(reverce);
                }
            }
        }

        Collections.sort(list);
        for(int i: list){
            System.out.println(i);
        }
    }
}
