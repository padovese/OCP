package stream;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author padovese
 * @since 08/11/2019
 */

public class StreamReduce {
    public static void main(String[] args) {
        Optional<Integer> sum = Stream.of(1, 2, 3, 4, 5).reduce((n1, n2) -> n1 + n2);
        System.out.println(sum.get());

        int maxWithInitialValue = Stream.of(1, 2, 3, 4, 5).reduce(1, (n1, n2) -> n1 + n2);
        System.out.println(maxWithInitialValue);

        Optional<Integer> max = Stream.of(1, 9, 4, 3, 8).reduce((n1, n2) -> n1 > n2 ? n1 : n2);
        System.out.println(max.get());

        //Map is the same as forEach, but it doesnt kill the stream, returns the data instead.
        Stream.of(1, 9, 4, 3, 8).map(e -> e+1).forEach(System.out::println);
    }
}
