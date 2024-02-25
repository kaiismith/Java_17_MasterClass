package JavaCollections;

import java.util.Iterator;

public class CollectionTest {
    public static void main(String[] args) {
        OurGenericList<Integer> list = new OurGenericList<>();
        list.add(1);
        list.add(2);
        list.add(3);

//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }        Iterator<Integer> iterator = list.iterator();

        for (int x : list) {
            System.out.println(x);
        }

    }
}
