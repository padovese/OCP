package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class FirstStreams {
    public static void main(String[] args) {
        Stream<String> stream = Stream.empty();
        Stream<Integer> stream1 = Stream.of(1);
        Stream<Integer> stream2 = Stream.of(1, 2, 3);

        System.out.println(stream.count());
        System.out.println(stream1.count());
        System.out.println(stream2.count());

        List<String> list = Arrays.asList("a", "b", "c");
        Stream<String> fromList = list.stream();
        Stream<String> fromListParallel = list.parallelStream();

        Stream<Double> random = Stream.generate(Math::random);
        random.forEach(System.out::println); //print forever because it is a infinite Stream
    }
}
