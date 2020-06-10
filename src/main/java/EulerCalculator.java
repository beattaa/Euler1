import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EulerCalculator {
    private List<Integer> getListOfNumbersDividedByThreeAndFive(int range) {
        Stream<Integer> collect1 = Stream.iterate(1, number -> number + 1)
                .limit(range-1)
                .filter(number -> number % 3 == 0);

        Stream<Integer> collect2 = Stream.iterate(1, number -> number + 1)
                .limit(range-1)
                .filter(number -> number % 5 == 0);

        return Stream.concat(collect1, collect2)
                .distinct()
                .collect(Collectors.toList());
    }

    public Integer sumOfEulerNumbers(int range) {
        return getListOfNumbersDividedByThreeAndFive(range)
                .stream()
                .reduce((first, second) -> first + second)
                .get();

    }

}
