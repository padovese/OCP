package stream;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class OptionalReturnWithDoubleStream {
  public static void main(String[] args) {
    IntStream stream = IntStream.rangeClosed(1, 10);
    OptionalDouble optional = stream.average();

    optional.ifPresent(System.out::println);
    System.out.println(optional.getAsDouble());
    System.out.println(optional.orElseGet(() -> Double.NaN));
  }
}
