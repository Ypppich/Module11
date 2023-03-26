package Task4;

import java.util.stream.Stream;

public class StreamIterate {
    public static Stream<Long> randomNumberGenerate(long a, long c, long m) {
        return Stream.iterate(0l, seed -> (a * seed + c) % m);
    }

    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);

        Stream<Long> randomNumbers = randomNumberGenerate(a, c, m);
        randomNumbers.limit(20).forEach(System.out::println);
    }
}
