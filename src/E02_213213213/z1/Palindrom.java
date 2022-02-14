package E02_213213213.z1;

public class Palindrom
{
    public static <T extends  Comparable> void czyPalindrom(T[] tab)
    {
        boolean palidrom = true;
        for (int i =0; i< tab.length/2; i++)
        {
            if(!tab[i].equals(tab[tab.length - 1 -i]))
            {
                palidrom = false;
                break;
            }
        }
        if(palidrom)
        {
            System.out.println("Argument jest paindromem");
        }
        else
        {
            System.out.println("Argument nie jest palindromem");
        }

    }


}
