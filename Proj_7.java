import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

/**
 By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

 What is the 10001st prime number?
 */
public class Proj_7 {
    public static void main(String[] args)
    {
        System.out.println("Δώσε μου πόσους πρώτους αριθμούς θέλεις να υπολογίσεις");
        Scanner keyboard = new Scanner(System.in);
        BigInteger x = BigInteger.valueOf(keyboard.nextInt());
        prime(x);
    }


    public  static void prime(BigInteger x)
    {
        ArrayList<BigInteger> list = new ArrayList<BigInteger>();

        int counter = 0;
        BigInteger counter2 = new BigInteger("0");
        BigInteger one = new BigInteger("1");
        BigInteger number = new BigInteger("150000");

        for (BigInteger i = BigInteger.valueOf(0); i.compareTo(number) < 0; i = i.add(one))
        {
            counter=0;
            for (BigInteger j = BigInteger.valueOf(2);  j.compareTo(i)  <= 0; j = j.add(one))
            {
                if ( i.mod(j).equals(BigInteger.ZERO))
                {
                    counter++;
                    if(counter == 1 &&  i.compareTo(j) == 0 )
                    {
                        counter2=counter2.add(one);
                        if (counter2.compareTo(x) <= 0 )
                        {
                            list.add(i);
                        }
                    }

                }
            }
        }
        System.out.println(list);
    }
}
