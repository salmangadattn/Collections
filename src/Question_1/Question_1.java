package Question_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
    1. Write Java code to define List .
       Insert 5 floating point numbers in List, and using an iterator, find the sum of the numbers in List.
     */
public class Question_1 {

    public static void main(String[] args) {

        List<Float> list = new ArrayList<>();

        list.add(2.3F);
        list.add(6.3F);
        list.add(0.3F);
        list.add(3.3F);
        list.add(2.8F);

        float sum = 0F;

        Iterator<Float> iterator = list.listIterator();

        while (iterator.hasNext()) {
            float num = iterator.next();
            sum += num;
        }

        System.out.println("Required sum is : " + sum);

    }

}
