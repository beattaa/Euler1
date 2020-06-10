import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EulerCalculatorTest {

    private EulerCalculator eulerCalculator = new EulerCalculator();

    @Test
    void shouldSumOfEulersMultiplesTo10Be23() {
        // given
        int range = 10;
        //when
        Integer sum = eulerCalculator.sumOfEulerNumbers(range);
        //then
        assertThat(sum).isEqualTo(23);
    }

    @Test
    void shouldSumOfEulersMultiplesTo11Be33() {
        // given
        int range = 11;
        //when
        Integer sum = eulerCalculator.sumOfEulerNumbers(range);
        //then
        assertThat(sum).isEqualTo(33);
    }

    @Test
    void shouldSumOfEulersMultiplesTo12Be33() {
        // given
        int range = 12;
        //when
        Integer sum = eulerCalculator.sumOfEulerNumbers(range);
        //then
        assertThat(sum).isEqualTo(33);
    }

    @Test
    void shouldSumOfEulersMultiplesTo13Be45() {
        // given
        int range = 13;
        //when
        Integer sum = eulerCalculator.sumOfEulerNumbers(range);
        //then
        assertThat(sum).isEqualTo(45);
    }

    @Test
    void shouldSumOfEulersMultiplesTo16Be60() {
        // given
        int range = 16;
        //when
        Integer sum = eulerCalculator.sumOfEulerNumbers(range);
        //then
        assertThat(sum).isEqualTo(60);
    }
}
