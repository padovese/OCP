package stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamNearbyRestaurants {

  public static void main(String[] args) {
    StreamNearbyRestaurants streamNearbyRestaurants = new StreamNearbyRestaurants();

    List<Integer> restaurant1 = Arrays.asList(1, 2);
    List<Integer> restaurant2 = Arrays.asList(3, 4);
    List<Integer> restaurant3 = Arrays.asList(1, -1);

    List<List<Integer>> allLocations = Arrays.asList(restaurant1, restaurant2, restaurant3);

    System.out.println(streamNearbyRestaurants.nearestVegetarianRestaurant(0, allLocations, 2));
  }

  List<List<Integer>> nearestVegetarianRestaurant(
      int totalRestaurants, List<List<Integer>> allLocations, int numRestaurants) {

      List<List<Integer>> query = allLocations
              .stream()
              .sorted(Comparator.comparing(e -> Math.sqrt(e.get(0) * e.get(0) + e.get(1) * e.get(1))))
              .limit(numRestaurants)
              .collect(Collectors.toList());

      return query;
  }
}
