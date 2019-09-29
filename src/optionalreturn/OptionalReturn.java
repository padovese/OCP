package optionalreturn;

import java.util.Optional;

public class OptionalReturn {

  public static Optional<Double> avg(int... scores) {
    if (scores.length == 0) {
      return Optional.empty();
    }

    int sum = 0;
    for (int score : scores) {
      sum += score;
    }
    return Optional.of((double) sum / scores.length);
  }

  public static double avgInDouble(Optional opt) {
    if (opt.isPresent()) {
      return (double) opt.get();
    }
    return 0.0;
  }

  public static void withLambda() {
    Optional<Double> opt = avg(90, 100);
    opt.ifPresent(System.out::println);
  }

  public static void main(String[] args) {
    System.out.println(
        avg()); // if i do avg().get() i take a java.util.NoSuchElementException: No value
    // present
    System.out.println(avg(1));
    System.out.println(avg(1, 2, 3));

    System.out.println(avg().isPresent());
    System.out.println(avg(1).isPresent());
    System.out.println(avg(1, 2, 3).isPresent());

    System.out.println(avgInDouble(avg()));
    System.out.println(avgInDouble(avg(1)));
    System.out.println(avgInDouble(avg(1, 2, 3)));

    withLambda();

    Optional<Double> opt = avg();
    System.out.println(opt.orElse(Double.NaN));
    System.out.println(opt.orElseGet(() -> Math.random()));
    System.out.println(opt.orElseThrow(() -> new IllegalStateException()));
  }
}
