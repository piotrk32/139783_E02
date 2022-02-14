package E02_213213213;

import E02_213213213.z1.Palindrom;
import E02_213213213.z2.Print;
import E02_213213213.z3.ListFile;

import java.io.File;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args)
    {
        //z1
        Integer[] numbers = {1,2,3,4,5,6,5,4,3,2,1};
        Palindrom.czyPalindrom(numbers);
        Integer[] numbers_random = {2,4,5,23,52,23,324};
        Palindrom.czyPalindrom(numbers_random);

        LocalTime[] data = {
                LocalTime.of(12,10),
                LocalTime.of(11,10),
                LocalTime.of(12,10)

        };
        Palindrom.czyPalindrom(data);
        LocalTime[] data_random = {
                LocalTime.of(13,10),
                LocalTime.of(14,10),
                LocalTime.of(15,10)

        };
        Palindrom.czyPalindrom(data_random);

        //z2

        List<String> list = new ArrayList<>();
        list.add("jeden");
        list.add("dwa");
        list.add("trzy");
        list.add("cztery");
        list.add("piec");
        Print.wypiszCoDrugi(list);
        System.out.println("\n");
        List<Integer> list_integer = new ArrayList<>();
        list_integer.add(1);
        list_integer.add(2);
        list_integer.add(3);
        list_integer.add(4);
        list_integer.add(5);
        Print.wypiszCoDrugi(list_integer);

        System.out.println("\n");


        ListFile.subDir("C:\\Users\\Ja\\IdeaProjects\\E02_139783\\src\\E02_213213213");




    }
}
