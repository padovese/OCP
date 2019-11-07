package optionalreturn;

import java.io.IOException;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * @author padovese
 * @since 06/11/2019
 */

public class OptionalClass {
    public static void main(String[] args) throws IOException {
        Optional<Integer> number = Optional.of(1);
        System.out.println(number);
        System.out.println(number.get());
        System.out.println(number.isPresent());
        number.ifPresent(e -> System.out.println(e));
        Optional<Integer> b = number.map(e -> e + 1);
        System.out.println(b);
        System.out.println(Optional.empty());
        System.out.println(Optional.ofNullable(5));
        System.out.println(Optional.ofNullable(null));
        // System.out.println(Optional.of(null)); generates nullPointerException

        Optional<Integer> numberNull = Optional.ofNullable(null);
        System.out.println(numberNull.orElse(2));
        System.out.println(numberNull.orElseGet(() -> 123));
        // numberNull.orElseThrow(() -> new IOException()); generates IOException

        // With Stream
        Stream.of(1, 2, 3).findFirst().ifPresent(e -> System.out.println(e));
        Stream.of().findFirst().ifPresent(e -> System.out.println(e));
        Stream.of(1, 2, 3).max(Comparator.naturalOrder()).ifPresent(e -> System.out.println(e));
    }
}
