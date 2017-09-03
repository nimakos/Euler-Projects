import java.util.ArrayList;
import java.util.Scanner;

/*he prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?*/

public class Proj_3
{
    public static void main(String[] args)
    {
        System.out.println("Δώσε μου πόσους πρώτους αριθμούς θέλεις να υπολογίσεις");
        Scanner keyboard = new Scanner(System.in);
        int x = keyboard.nextInt();
        prime(x);
    }


    public  static void prime(int x)
    {
        ArrayList<Integer> list = new ArrayList<>();

        int counter = 0;
        int counter2 =0;
        long product = 600851475143L;
        for (int i = 1; i < 9000; i++)
        {
            counter=0;
            for (int j = 2; j <= i; j++)
            {
                if (i % j == 0)
                {
                    counter++;
                    if(counter == 1 && i==j)
                    {
                        counter2++;
                        if (counter2 <= x )
                        {
                            list.add(i);
                        }
                    }

                }
            }
        }
        System.out.println(list);

        for (int k=list.size()-1; k>=0; k--)
        {
                if(product % list.get(k) == 0)
                {

                    //System.out.println(list.get(k));
                }
        }
    }
}
