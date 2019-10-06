package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TransformingAMethodIntoAStream {
  List<String> list = Arrays.asList("Toby", "Anna", "Leroy", "Alex");

  public static void main(String[] args) {
    TransformingAMethodIntoAStream t = new TransformingAMethodIntoAStream();
    t.regularMethod();
    t.withLambda();
  }

  public void regularMethod() {

    List<String> filtered = new ArrayList<>();

    for (String name : list) {
      if (name.length() == 4) filtered.add(name);
    }

    Collections.sort(filtered);
    Iterator<String> iter = filtered.iterator();

    if (iter.hasNext()) System.out.println(iter.next());
    if (iter.hasNext()) System.out.println(iter.next());
  }

  public void withLambda() {
    list.stream().filter(n -> n.length() == 4).sorted().limit(2).forEach(System.out::println);
  }
}
