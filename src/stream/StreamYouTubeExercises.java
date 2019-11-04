package stream;

import stream.helper.Grape;
import stream.helper.Wine;
import stream.helper.WineType;

import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author padovese
 * @since 03/11/2019
 */

public class StreamYouTubeExercises {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 5, 5, 9, 8, 1, 4);

        numbers.stream()
                .filter(e -> e.equals(1))
                .map(e -> e * 2)
                .distinct()
                .forEach(System.out::println);

        numbers.stream()
                .skip(2)
                .limit(5)
                .forEach(System.out::println);

        Optional<Integer> min = numbers.stream()
                .min(Comparator.naturalOrder());
        System.out.println(min);

        Optional<Integer> max = numbers.stream()
                .max(Comparator.naturalOrder());
        System.out.println(max);

        List<Integer> listMultipliedByTwo = numbers.stream()
                .map(e -> e * 2)
                .collect(Collectors.toList());
        System.out.println(listMultipliedByTwo);

        Map<Boolean, List<Integer>> higherThanFive = numbers.stream()
                .collect(Collectors.groupingBy(e -> e >= 5));
        System.out.println(higherThanFive);

        Map<Integer, List<Integer>> eq = numbers.stream().collect(Collectors.groupingBy(e -> e));
        System.out.println(eq);
        System.out.println("////////");

        System.out.println(getWines().stream().collect(Collectors.groupingBy(e -> e.getWineType())));
        System.out.println(getWines().stream().collect(Collectors.groupingBy(e -> e.getYear())));
        System.out.println(getWines().stream().count());
        System.out.println(getWines().stream().max(Comparator.comparing(e -> e.getYear())));

        String wineNames = getWines().stream()
                .filter(e -> e.getYear() > 2010)
                .map(e -> e.toString())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.joining(";"));
        System.out.println(wineNames);

    }

    public static List<Wine> getWines(){
        List<Wine>  wines = new ArrayList<>();
        wines.add(new Wine("Wine 1", Grape.CABERNET_SAUVIGNON, WineType.RED, 2015));
        wines.add(new Wine("Wine 2", Grape.CHARDONNAY, WineType.RED, 2014));
        wines.add(new Wine("Wine 3", Grape.MERLOT, WineType.RED, 2018));
        wines.add(new Wine("Wine 4", Grape.PINOT_NOIR, WineType.WHITE, 2018));
        wines.add(new Wine("Wine 5", Grape.SYRAH, WineType.WHITE, 2015));
        wines.add(new Wine("Wine 6", Grape.ZINFANDEL, WineType.RED, 2014));
        wines.add(new Wine("Wine 7", Grape.CABERNET_SAUVIGNON, WineType.RED, 2005));
        wines.add(new Wine("Wine 8", Grape.PINOT_NOIR, WineType.WHITE, 2016));
        wines.add(new Wine("Wine 9", Grape.CABERNET_SAUVIGNON, WineType.RED, 2015));

        return wines;
    }
}
