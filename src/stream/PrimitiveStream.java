package stream;

import java.util.stream.DoubleStream;

public class PrimitiveStream {
  public static void main(String[] args) {
    DoubleStream oneValue = DoubleStream.of(3.14);
    DoubleStream varargs = DoubleStream.of(1.0, 1.1, 1.2);
    oneValue.forEach(System.out::println);
    System.out.println();
    varargs.forEach(System.out::println);
  }
}
