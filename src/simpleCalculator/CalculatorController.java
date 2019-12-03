package simpleCalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {

	private CalculatorView theView;

	private CalculatorModel theModel;

	public CalculatorController(CalculatorView theView, CalculatorModel theModel) {

		this.theView = theView;

		this.theModel = theModel;

		this.theView.additionCalculateListener(new AdditionListener());
		this.theView.subtractionCalculateListener(new SubtractionListener());

	}

	class AdditionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			int firstNumber, secondNumber = 0;

			try {

				firstNumber = theView.getFirstNumber();

				secondNumber = theView.getSecondNumber();
				theModel.addTwoNumbers(firstNumber, secondNumber);

				theView.setAdditionSolution(theModel.getAdditionValue());
			}

			catch (NumberFormatException ex) {

				System.out.println(ex);

				theView.displayErrorMessage("You Need to Enter 2 Integers");

			}

		}

	}

	class SubtractionListener implements ActionListener {

		public void actionPerformed(ActionEvent e) {

			int thirdNumber, fourthNumber = 0;

			try {

				thirdNumber = theView.getThirdNumber();

				fourthNumber = theView.getFourthNumber();
				theModel.subtractTwoNumbers(thirdNumber, fourthNumber);
				theView.setSubtractionSolution(theModel.getSubtractionValue());
			}

			catch (NumberFormatException ex) {

				System.out.println(ex);

				theView.displayErrorMessage("You Need to Enter 2 Integers");

			}

		}

	}

}
