package Task5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMixer {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        List<T> firstList = first.collect(Collectors.toList());
        List<T> secondList = second.collect(Collectors.toList());

        int minLength = Math.min(firstList.size(), secondList.size());
        List<T> zippedList = new ArrayList<>(minLength * 2);

        for (int i = 0; i < minLength; i++) {
            zippedList.add(firstList.get(i));
            zippedList.add(secondList.get(i));
        }
        return zippedList.stream();
    }
}

class StreamMixerTest {
    public static void main(String[] args) {
        Stream<Integer> first = Stream.of(1, 3, 5, 7, 9, 11, 15);
        Stream<Integer> second = Stream.of(2, 4, 6, 8, 10, 99, 100, 1);

        Stream<Integer> result = new StreamMixer().zip(first, second);
        result.forEach(System.out::println);
    }
}
