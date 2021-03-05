package fr.lernejo;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.assertj.core.api.Assertions.assertThat;

class SampleTest {

    private final Sample sample = new Sample();

    @Test
    void add_behave_as_expect() {
        int result = sample.op(Sample.Operation.ADD, 7,3);
        assertThat(result).isEqualTo(10);
    }

    @ParameterizedTest
    @CsvSource({
        "3,7,10",
        "0,3,3"
    })
    void add_behave_as_expect_second(int a, int b, int expectedResult) {
        int result = sample.op(Sample.Operation.ADD, a,b);
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void mult_behave_as_expect() {
        int result = sample.op(Sample.Operation.MULT, 4,3);
        assertThat(result).isEqualTo(12);
    }

    @ParameterizedTest
    @CsvSource({
        "2,5,10",
        "0,3,0"
    })
    void mult_behave_as_expect_second(int a, int b, int expectedResult) {
        int result = sample.op(Sample.Operation.MULT, a,b);
        assertThat(result).isEqualTo(expectedResult);
    }
}
