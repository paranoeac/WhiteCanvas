package hack;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Collection {

    public static void main(String[] args) {
        ArrayList<String> altest = new ArrayList<String>();

        altest.add("one");
        altest.add("two");
        altest.add("three");
        altest.add("four");
        altest.add("five");

        for (Iterator<String> i = altest.iterator(); i.hasNext();) {
            System.out.println("ArrayList : " + i.next());
        }

        HashSet<String> hs = new HashSet<String>();

        hs.add("one");
        hs.add("two");
        hs.add("five");
        hs.add("three");
        hs.add("four");

        for (Iterator<String> i = hs.iterator(); i.hasNext();) {
            System.out.println("HashSet : " + i.next());
        }

        System.out.println("test : " + hs);
    }
}