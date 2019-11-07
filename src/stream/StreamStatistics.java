package stream;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author padovese
 * @since 06/11/2019
 */

public class StreamStatistics {

    public static void main(String[] args) {

        IntSummaryStatistics summary = IntStream.of(1, 3, 4).summaryStatistics();
        System.out.println(summary.getCount());
        System.out.println(summary.getMax());
        System.out.println(summary.getMin());
        System.out.println(summary.getAverage());

    }




}
