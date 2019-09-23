package lambda;

import java.time.LocalDate;
import java.util.function.Supplier;

public class SupplerInterface {

  public static void main(String[] args) {

    //    Supplier<GorillaFamily> s = () -> new GorillaFamily();
    //    System.out.println(s.get());

    Supplier<LocalDate> s1 = LocalDate::now;
    // :: method reference, only works with lambda reference. Just another way to call a method.
    Supplier<LocalDate> s2 = () -> LocalDate.now();

    System.out.println(s1.get());
    System.out.println(s2.get());

    Supplier<StringBuilder> sb1 = StringBuilder::new;
    Supplier<StringBuilder> sb2 = () -> new StringBuilder();

    System.out.println(sb1);
    System.out.println(sb2);
  }
}
