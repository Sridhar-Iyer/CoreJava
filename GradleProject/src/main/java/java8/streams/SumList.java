package java8.streams;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SumList {

    private static int sumIterator(@NotNull List<Integer> list) {

        Iterator<Integer> it = list.iterator();
        int sum = 0;
        while(it.hasNext()) {
            int num = it.next();
                if(num > 10) {
                    sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(26);
        System.out.println(list);
        int sum = SumList.sumIterator(list);
        System.out.println(sum);

        sum = SumList.streamSum(list);
        System.out.println(sum);
    }

    private static int streamSum(@NotNull List<Integer> list) {
        return list.stream().filter(i -> i > 10).mapToInt(i -> i).sum();
    }
}
