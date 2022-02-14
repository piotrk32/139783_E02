package E02_213213213.z2;

import java.util.Iterator;

public class Print
{
    public static <E, I extends Iterable<E>> void wypiszCoDrugi(I object)
    {

        boolean i = false;
        boolean isFirst = false;
        for (E element : object)
        {
            if (isFirst == true)
            {
                System.out.print(element);
                isFirst = !isFirst;


            }
            else if (i == false)
            {
                System.out.print("," + element);
            }
            i =!i;

        }
        System.out.println();
    }
}
