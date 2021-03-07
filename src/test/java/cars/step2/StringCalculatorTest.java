package cars.step2;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;

public class StringCalculatorTest {
  @Test
  @DisplayName("제작/임시 테스트")
  void test() {
    //
    CalculatorType calculatorType = CalculatorType.valueOfType("+");
    // System.out.println("calculatorType: " + calculatorType);
  }

  private StringCalculator stringCalculator;

  void init(String input) {
    stringCalculator = new StringCalculator(input);
  }

  // 사칙연산 테스트
  @DisplayName("사칙연산 테스트")
  @ParameterizedTest
  @CsvSource({ "1 + 2, 3", "2 + 5 + 7, 14", "1 * 5 - 2 + 6, 9", "1 + 2 * 10 - 5 / 5, 5" })
  void plusTest(String input, int expectedValue) {
    //given
    init(input);

    //when
    int result = stringCalculator.calculationAndOutput();

    //then
    assertThat(result).isEqualTo(expectedValue);
  }

}
