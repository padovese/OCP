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

  public static void main(String[] args) {
    System.out.println(avg());
    System.out.println(avg(1));
    System.out.println(avg(1, 2, 3));
  }
}
