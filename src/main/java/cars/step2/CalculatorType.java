package cars.step2;

import java.util.Arrays;

public enum CalculatorType {
  PLUS("+", (a, b) -> a + b), MINUS("-", (a, b) -> a - b), MULTIPLY("*", (a, b) -> a * b), DIVIDE("/", (a, b) -> a / b);

  private final String type;
  private final Calculator calculator;

  CalculatorType(String type, Calculator calculator) {
    this.type = type;
    this.calculator = calculator;
  }

  public static CalculatorType valueOfType(String type) {
    return Arrays.stream(CalculatorType.values()).filter((calcType) -> {
      // System.out.println("calcType: " + calcType.type);
      return calcType.type.equals(type);
    }).findAny().orElseThrow(() -> new IllegalArgumentException("사칙연산이 아닙니다."));
  }

  public int calculateNumbers(int leftNumber, int rightNumber) {
    return calculator.calculate(leftNumber, rightNumber);
  }
}
