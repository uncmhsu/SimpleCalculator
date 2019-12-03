package simpleCalculator;

public class CalculatorModel {
	private int additionValue;
	private int subtractionValue;

	public void addTwoNumbers(int firstNumber, int secondNumber) {
		additionValue = firstNumber + secondNumber;
	}

	public void subtractTwoNumbers(int thirdNumber, int fourthNumber) {
		subtractionValue = thirdNumber + fourthNumber;
	}

	public int getAdditionValue() {
		return additionValue;
	}

	public int getSubtractionValue() {
		return subtractionValue;
	}
}
