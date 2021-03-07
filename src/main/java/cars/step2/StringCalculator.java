package cars.step2;

public class StringCalculator {
  private final String input;

  public StringCalculator(String input) {
    inputValidation(input);
    this.input = input;
  }

  public int calculationAndOutput() {
    String[] inputs = input.split(" ");
    int leftNumber = Integer.parseInt(inputs[0]);
    for (int i = 0; i < inputs.length - 1; i += 2) {
      int rightNumber = Integer.parseInt(inputs[i + 2]);
      CalculatorType calculatorType = CalculatorType.valueOfType(inputs[i + 1]);
      leftNumber = calculatorType.calculateNumbers(leftNumber, rightNumber);
    }
    return leftNumber;
  }

  private void inputValidation(String input) {
    if (input == null || "".equals(input))
      throw new IllegalArgumentException("입력값이 없거나 공백입니다.");
  }

}
